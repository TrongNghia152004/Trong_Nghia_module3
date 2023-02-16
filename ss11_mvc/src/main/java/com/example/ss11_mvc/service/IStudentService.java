package com.example.ss11_mvc.service;

import com.example.ss11_mvc.model.Student;

import java.util.List;

public interface IStudentService {
    Student findById(int id);

    List<Student> findAll(String search);

    void save(Student student);

    void delete(int id);
}
