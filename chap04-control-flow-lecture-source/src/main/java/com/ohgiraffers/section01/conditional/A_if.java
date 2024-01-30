package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

    public void simpleIfstatment() {

        /*
        * [if 문 표현식]
        * if(조건식)
        *       조건식이 true 일 때 실행할 명령문
        * }*/

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 :");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("입력하신 문구는 짝수입니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }

    public void nestedIfStatment() {

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 한 개 입력하세요 :");
        int num = sc.nextInt();

        if(num > 0) {
            if(num %2 == 0) {
                System.out.println("양수이면서 짝수일 때");
            }
            if(num %2 != 0) {
                System.out.println("양수이면서 홀수일 때");
            }

        }
        System.out.println("프로그램을 종료합니다.");
    }
}
