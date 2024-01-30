package com.ohgiraffers.section04.comparison;

public class Application1 {
    public static void main(String[] args) {
        //비교 연산자

        /* 필기.
        * 비교 연산자
        * 비교 연산자는 피연산자 사이에서 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자이다.
        * 연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나 조건문의 조건철에 많이 사용된다.
        * */

        /* 필기.
        * 비교연산자의 종류
        * '==' : 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 true 다르면 false를 반환
        * '!=' : 왼쪽의 피연산자와 오른쪽의 피연산자가 다르면 true 같으면 false를 반환
        * '>=' : 왼쪽의 피연산자와 오른쪽의 피연산자가 크거나 같으면 true 아니면 false를 반환
        * '<=' : 왼쪽의 피연산자와 오른쪽의 피연산자가 작으면 같으면 true 아니면 false를 반환
        * '<'  : 왼쪽의 피연산자와 오른쪽의 피연산자가 작으면 true 아니면 false를 반환
        * '>'  : 왼쪽의 피연산자와 오른쪽의 피연산자가 크면 true 아니면 false를 반환*/

        int inum1 = 10;
        int inum2 = 20;

        System.out.println(" ===== 정수값 비교 =====");
        System.out.println("inum1과 inum2가 같은지 비교 :" + (inum1 == inum2));
        System.out.println("inum1과 inum2가 같지 않은지 비교 : " + (inum1 != inum2));
        System.out.println("inum1이 inum2보다 큰지 비교 : " + (inum1 > inum2));
        System.out.println("inum1이 inum2보다 크거나 같은지 비교 : " + (inum1 >= inum2));
        System.out.println("inum1이 inum2보다 작은지 비교 : " + (inum1 < inum2));
        System.out.println("inum1이 inum2보다 작은거나 같은지 비교 : " + (inum1 <= inum2));

        /* 문자값 비교*/
        char ch1 = 'a';     //'a' == 97
        char ch2 = 'A';     //'A' == 65

        System.out.println("=====문자값 비교 =====");
        System.out.println("ch1과 ch2가 같은지 비교 : " + (ch1 == ch2));
        System.out.println("ch1과 ch2가 같지 않은지 비교 :" + (ch1 !=ch2));
        System.out.println("ch1과 ch2가 작은지 비교 :" + (ch1 < ch2));


        /* 논리값과 문자열은 '==' '!=' 만 비교 가능하다 */
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("bool1과 bool2가 같은지 비교" + (bool1 == bool2));
        System.out.println("bool1과 bool2가 같지 않은지 비교" + (bool1 != bool2));
//        System.out.println("bool1이 bool2보다 큰지 비교" + (bool1 > bool2));


        String str1 = "java";
        String str2 = "java";

        System.out.println("str1과 str2가 같은지 비교 :" + (str1 == str2));
        System.out.println("str1과 str2가 같지 않은지 비교 :" + (str1 != str2));
//        System.out.println("str1이 str2보다 작은지 비교 :" + (str1 < str2));


        int x = 10;
        int y = 11;

        boolean result = x<=y;
        System.out.println("결과값은 ? :" + result);

        // 실습문제 1  정수형 변수 2개를 선언하여,
        //각 20과 30으로 초기화 한 후,
        //두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 다음과 같이 출력하세요.
        int x1 = 20;
        int x2 = 30;

        System.out.println("더하기 결과 :" + (x1+x2));
        System.out.println("빼기 결과 :" + (x1-x2));
        System.out.println("곱하기 결과 :" + (x1*x2));
        System.out.println("나누기한 몫 :" + (x1/x2));
        System.out.println("나누기한 나머지:" + (x1%x2));

        //실습문제 2 사각형의 넓이와 둘레를 구하여 출력합니다.
        //너비 12.5 높이 36.4를 변수에 저장하고,
        //넓이와 둘레를 계산한 뒤 변수에 담아 아래와 같이 출력하세요.

        double y1 = 12.5; //너비
        double y2 = 36.4; //높이

        double z1 = y1*y2; //넓이
        double zz1 = 2 *(y1+y2); //둘레

        System.out.println("면적 :" + z1);
        System.out.println("둘레 :" + zz1);


        //실습문제 3
        //문자형 변수를 하나 선언하고 'a'를 대입한 후,
        //문자 'a'가 가지는 유니코드값을 출력하세요.

        char qwerty = 'a';

        System.out.println("문자 a의 unicode :" + (int)qwerty);




        //- 실습문제 4
        //    국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤,
        //    총점과 평균을 정수 형태로 출력하세요.
        double r = 80.5; // 국어
        double t = 50.6; // 수학
        double d = 70.8; //영어

        double total = r+t+d; // 총 점수 구하기
        double average = (r+t+d)/3; // 평균값 구하기

        total = (int)total;
        average = (int)average;

        System.out.println("총점 : " + (int)total);
        System.out.println("총점 : " + (int)average);


    }
}
