package com.example.ss11_mvc.service.impl;

import com.example.ss11_mvc.model.Student;
import com.example.ss11_mvc.repository.IStudentRepository;
import com.example.ss11_mvc.repository.impl.StudentRepository;
import com.example.ss11_mvc.service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    private IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public Student findById(int id) {
        return iStudentRepository.findById(id);
    }

    @Override
    public List<Student> findAll(String search) {
        // Validate dữ liệu, Xử lý nghiệp vụ, ....
        if (search == null) {
            search = "";
        }
        return iStudentRepository.findAll(search);
    }

    @Override
    public void save(Student student) {
        iStudentRepository.save(student);
    }

    @Override
    public void delete(int id) {
        iStudentRepository.delete(id);
    }
}
