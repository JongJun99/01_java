package com.ohgiraffers.model.dto;

public class Employee extends Person{

    private int salary;
    private String dept;

    public Employee() {}

    public Employee(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        setName(name);

    }

    //setter
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    //getter

    public int getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }

    public String information() {
        return "salary :" + salary + "dept :" + dept;
    }
}
