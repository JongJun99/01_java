package com.ohgiraffers.section03.map.run;

public class Member {
    private String name;
    private int age;
    private char gender;
    private int couponCount;

    public Member(){}
    public Member(String name, int age, char gender, int couponCount){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.couponCount = couponCount;

    }


    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }

    //getter

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getCouponCount() {
        return couponCount;
    }

    public String toString() {
        return name + " " + age + " " + gender + " " + couponCount;
    }
}
