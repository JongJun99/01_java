package com.ohgiraffers.section5.logical;

public class Application2 {

    public static void main(String[] args) {
        //논리 연산자의 우선순위

        /*논리 연산자의 우선순위
        * && : 1순위
        * || : 2순위*/

        int num1 = 55;
        System.out.println("1부터 100사이입니까? :" + (1<=num1 && num1<=100));     //true

        int num2 = 175;
        System.out.println("1부터 100사이입니까? :"+ (1<=num2 && num2<=100));  //false

        char ch = 'T';
        System.out.println("영어가 대문자입니까? :" + ('A'<=ch && ch<='Z'));     //true

        char ch2 = 'w';
        System.out.println("영어가 대문자입니까? :" + ('A'<=ch2 && ch2<='Z'));   //falsee

        char ch3 = 'y';
        System.out.println("영문자가 y 입니까?:" + (ch3 == 'y' || ch3 == 'Y') );   //true

        /*영문자인지 확인
        * A~Z : 65 ~ 90*/
        char ch5 = 'f';
        System.out.println("영문자인지 확인 :" + ((ch5 >='A' && ch5 <= 'Z') || (ch5 >= 'a' && ch5 <= 'z')));
        System.out.println("영문자인지 확인 :" + ((ch5 >=65 && ch5 <= 90) || (ch5 >= 97 && ch5 <= 120)));










    }
}
