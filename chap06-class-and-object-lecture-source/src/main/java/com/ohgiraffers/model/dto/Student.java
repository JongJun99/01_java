package com.ohgiraffers.model.dto;

public class Student extends Person{

    private int grade;
    private String major;

    public Student() {}

    public Student(String name, int age, double height, double weight, int grade, String major){
        super(age, height, weight);
        setName(name);
        this.grade = grade;
        this.major = major;
    }
}
