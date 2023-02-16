package com.example.ss11_mvc.repository;

import com.example.ss11_mvc.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll(String search);

    void save(Student student);

    Student findById(int id);

    void delete(int id);
}
