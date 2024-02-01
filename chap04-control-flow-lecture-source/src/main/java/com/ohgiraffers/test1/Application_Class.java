package com.ohgiraffers.test1;

import java.util.Scanner;

public class Application_Class {
    public static void main(String[] args) {

        /*폴더 구조 com.ohgiraffers.test1

        Application 클래스

        1. 기본자료형 8개를 선언과 동시에 초기화 한다.
        2. 서로다른 자료형 값을 +연산하여 <강제형변환>을 이용하여 알맞는 변수에 담아준다. (1개만)
        3. 결과값을 삼항연산자를 활용하여 양수면 "양수입니다" 음수면 "음수입니다" 나올 수 있도록 코드작성.*/

        byte a1 = 1;
        int a2 = 1;
        short a3 = 1;
        long a4 =1L;

        float a5 = 1.0f;
        double a6 = 1.0;

        char ch ='a';
        boolean a7 = true;

        int result1 = (a2 + (int)a5);
        String result = (result1 > 0)? "양수입니다." : "음수입니다.";


        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를입력하세요 :");
        int a = sc. nextInt();
        System.out.println(result);


    }
}
