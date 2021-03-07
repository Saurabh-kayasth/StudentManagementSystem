package com.example.demo.repository;

import com.example.demo.model.Student;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,Integer>{
    // No implementation required
}
