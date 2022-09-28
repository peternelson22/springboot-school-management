package com.nelson.demo.service;

import com.nelson.demo.entity.Student;

import java.util.List;

public interface StudentService {
    
    List<Student> getAllStudents();

    Student saveStudents(Student student);

    Student updateStudent(Student student);

    Student getStudentById(Long id);

    void deleteStudentById(Long id);
}
