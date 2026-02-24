package com.rungroup.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rungroup.web.models.Student;
import com.rungroup.web.service.StudentService;

@Controller
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String listStudents(Model model){
        List<Student> listStudent = studentService.findAll();
        model.addAttribute("students", listStudent);
        return "students-list";
    }
}
