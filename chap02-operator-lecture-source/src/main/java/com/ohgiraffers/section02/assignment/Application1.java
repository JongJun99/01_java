package com.ohgiraffers.section02.assignment;

public class Application1 {
    public static void main(String[] args) {
        //대입 연산자


        /* 필기.
        * 대입 연산자와 산술 복합 대입 연산자
        * '=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입함
        * '+' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽의 피연산자에 대입함
        * '-=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 결과를 왼쪽의 피연산자에 대입함
        * '*=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 왼쪽의 피연산자에 대입함
        * '/=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 결과를 왼쪽의 피연산자에 대입함
        * '%' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나누고 나머지 결과를 왼쪽의 피연산자에 대입함
         */

        int num = 12;
        System.out.println("num = " + num);

        num += 3;   // num = num + 3
        System.out.println("num = " + num);

        num -= 5;
        System.out.println("num = " + num);

        num *= 2;
        System.out.println("num = " + num);

        num /= 2;
        System.out.println("num = " + num);

        num =- 2; //주의사항 산술 보합 대입연산자의 작성 순서에 주의해야함
        System.out.println("num = " + num); // 산술 대입 연산자 -5가 아닌 num -5임













    }
}
