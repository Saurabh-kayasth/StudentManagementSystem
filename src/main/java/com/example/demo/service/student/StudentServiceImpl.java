package com.example.demo.service.student;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    // @Override
    public void addStudent(Student studentDTO) {
        // TODO Auto-generated method stub
        studentRepository.save(studentDTO);
    }

    // @Override
    public Optional<Student> getStudentById(int studentId) {
        // TODO Auto-generated method stub
        return studentRepository.findById(studentId);
    }

    // @Override
    public List<Student> getStudents() {
        // TODO Auto-generated method stub
        return studentRepository.findAll();
    }

    // @Override
    public void deleteStudentById(int id) {
        // TODO Auto-generated method stub
        studentRepository.deleteById(id);

    }
    
}
