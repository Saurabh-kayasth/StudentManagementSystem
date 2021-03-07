package com.example.demo.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Document
public class Student {

    @Id
    private Integer id;
    private String name;
    private String address;

    public Student(Integer id,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void setId(Integer value){
        this.id = value;
    }

    public Integer getId(){
        return this.id;
    }
    
    public void setName(String value){
        this.name = value;
    }

    public String getName(){
        return this.name;
    }
    
    public void setAddress(String value){
        this.address = value;
    }

    public String getAddress(){
        return this.address;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", address=" + address + "]";
    }

}
