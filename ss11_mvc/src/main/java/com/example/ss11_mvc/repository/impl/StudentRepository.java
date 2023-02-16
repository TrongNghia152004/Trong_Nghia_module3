package com.example.ss11_mvc.repository.impl;

import com.example.ss11_mvc.model.Student;
import com.example.ss11_mvc.repository.IStudentRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
//    @Override
//    public List<Student> findAll(String search) {
//        // Lấy ở DB lên
//        List<Student> studentList = new ArrayList<>();
//        try {
//            PreparedStatement preparedStatement = BaseRepository.getConnection()
//                    .prepareStatement("select id, name, score from student where name like concat('%', ?, '%')");
//            preparedStatement.setString(1, search);
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            Student student;
//            while (resultSet.next()) {
//                student = new Student();
//                student.setId(resultSet.getInt("id"));
//                student.setName(resultSet.getString("name"));
//                student.setScore(resultSet.getFloat("score"));
//
//                studentList.add(student);
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return studentList;
//    }

    @Override
    public List<Student> findAll(String search) {
        // Lấy ở DB lên
        List<Student> studentList = new ArrayList<>();
        try {
//            CallableStatement callableStatement = BaseRepository.getConnection()
//                    .prepareCall("call find_by_name(?);");
//            callableStatement.setString(1, search);
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement(
                    "select s.id, s.name, s.score, c.name from student s inner join class c on s.class_id = c.id\n" +
                            "where s.name like concat('%', ?, '%');"
            );
            preparedStatement.setString(1, search);
            ResultSet resultSet = preparedStatement.executeQuery();

            Student student;
            while (resultSet.next()) {
                student = new Student();
                student.setId(resultSet.getInt("s.id"));
                student.setName(resultSet.getString("s.name"));
                student.setScore(resultSet.getFloat("s.score"));
                student.setClassName(resultSet.getString("c.name"));

                studentList.add(student);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentList;
    }


    @Override
    public void save(Student student) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection()
                    .prepareStatement("insert into student (name, score) VALUES (?, ?);");
//            String str =  "insert into student (name, score) VALUES (" + student.getName() + ", ";

            preparedStatement.setString(1, student.getName());
            preparedStatement.setDouble(2, student.getScore());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Student findById(int id) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection()
                    .prepareStatement("select id, name, score from student where id = ?");

            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            Student student;
            if (resultSet.next()) {
                student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setScore(resultSet.getFloat("score"));

                return student;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection()
                    .prepareStatement("delete from student where id = ?");

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void checkTransaction() {
        Connection connection = null;
        try {
            connection = BaseRepository.getConnection();
            connection.setAutoCommit(false); // Mặc định = true

            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into student (name, score) values ('Nguyễn Văn ABCD', 5);");
            preparedStatement.executeUpdate();

            PreparedStatement preparedStatement2 = connection
                    .prepareStatement("insert into student (name, score) values ('Nguyễn Văn ABCD', 'dsfdsf');");
            preparedStatement2.executeUpdate();

            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();
        studentRepository.checkTransaction();
    }
}
