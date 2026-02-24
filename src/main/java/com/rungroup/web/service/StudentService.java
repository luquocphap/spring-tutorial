package com.rungroup.web.service;

import java.util.List;

import com.rungroup.web.models.Student;
public interface StudentService {
    List<Student> findAll();
    Student save(Student student);
}
