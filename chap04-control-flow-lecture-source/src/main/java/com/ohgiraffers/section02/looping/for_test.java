package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class for_test {
    public static void main(String[] args) {

        /* 1부터 입력 받은 정수까지의 짝수의 합을 출력하세요.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 10
         *
         * -- 출력 예시 --
         * 1부터 10까지 짝수의 합 : 30
         * */

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("정수를 입력하세요 : ");
//        int num = sc.nextInt();
//
//        int sum = 0;
//
//        for(int i = 0; i <= num; i++) {
//            if(i % 2 == 0) {
//                sum += i;
//            }
//        }
//
//        System.out.println("1부터 " + num + "까지 짝수의 합 : " + sum);


        /* 정수를 입력받아 1부터 입력받은 정수까지
         * 홀수이면 "토", 짝수이면 "마"가 정수만큼 누적되어 출력되도록 하세요.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 토마토마토
         * */

//        String a1 = "토";
//        String a2 = "마";
//        String result = "";
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("정수를 입력하세요 :");
//        int c = sc. nextInt();
//
//        for(int i = 0; i < c; i++) {
//            if(i % 2 ==0) {
//                result += a2;
//
//            }else {
//                result += a1;
//            }
//        }
//        System.out.println(result);

        //실습문제 3

        Scanner sc = new Scanner(System.in);
        int randomNumber = (int)(Math.random() * 100) + 1;  //((int)math.random() * 100) +  난수 ()안에 int형이 포함되면 에러
        int a = 0;

        while (true) {
            System.out.println("정수를 입력하세요 :");
            int number = sc.nextInt();
            a++;

            if(number < randomNumber) {
                System.out.println("입력하신 정수보다 큽니다.");
            }else if (number > randomNumber) {
                System.out.println("입력하신 정수보다 작습니다.");
            }else {
                System.out.println("정답입니다."+ a + " 회만에 정답을 맞추셨습니다.");
                break;

            }




        }


    }
}
