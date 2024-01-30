package com.ohgiraffers.section04.overflow;

public class Application1 {
    public static void main(String[] args) {

        /*필기.
        *자료형 별 값의 최대 범위를 벗어나는 경우
        * 발생한 carry를 버림처리하고 sing bit를 반전시켜 최소값으로 순환시킴
        *
         */

        byte num1 =127;

        System.out.println("num1 : " + num1); //127 : byte의 최대 저장 범위

        num1++; // num1 = num1 + 1  1 증가함


        System.out.println("num1 overflow :" + num1); //-128 : byte의 최소 저장 범위

        /*필기. 언더플로우
        * 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다.
         */

        byte num2 = -128;
        System.out.println("num2 :" + num2);    //-128 : byte의 최소 저장 범위

        num2--;     //num2 = num2 - 1   1감소

        System.out.println("num2 underflow : " + num2); // /127 : byte의 최대 저장 범위

        int firstNum = 1000000;     //백만
        int secondNum = 700000;     //70만

        int multi = firstNum * secondNum;       //7천억이 나와야함
        System.out.println("firstNum\" * secondNum:" + multi);  //-79669248

        long longMulti = firstNum * secondNum;
        System.out.println("longMulti :" + longMulti);  //-79669248

        long result = (long)firstNum * secondNum;
        System.out.println("result :"+ result);     //정상적으로 7천억이 출력됨
















    }
}
