package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Student;
import com.example.demo.service.student.StudentServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.io.IOException;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping(path = "/students",consumes = "application/json")
    public void addStudent(@RequestBody Student studentDTO) throws IOException {
		studentService.addStudent(studentDTO);
    }

    @GetMapping(path = "/students/{studentId}")
    public Optional<Student> getStudentById(@PathVariable int studentId){
        return studentService.getStudentById(studentId);
        // return null;
    }
    
    @GetMapping(path = "/students")
    public List<Student> getStudents(){
        System.out.println("hello world");
        return studentService.getStudents();
        // return "hello";
    }
    
    @DeleteMapping(path = "/students/{studentId}")
    public void deleteStudentById(@PathVariable int studentId){
        // System.out.println(studentId);
        studentService.deleteStudentById(studentId);
    }
}
