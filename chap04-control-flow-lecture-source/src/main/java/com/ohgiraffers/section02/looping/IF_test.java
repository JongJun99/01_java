/*package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class IF_test {
    public static void main(String[] args) { */


         /*//실습문제 1
        Scanner sc = new Scanner(System.in);
        System.out.println("나이가 어떻게 되세요? :");
        int old = sc.nextInt();

        if(old>=20) {
            System.out.println("판매가능합니다.");
        }else {
            System.out.println("판매 불가능합니다.");*/


        //실습문제2
        /*Scanner sc =new Scanner(System.in);
        System.out.println("당첨 번호가 어떻게 되세요? :");
        int number = sc.nextInt();

        if(number %2 ==0) {
            System.out.println("짝수네요!! 모자 선물입니다!");

        }else if(number /2 !=0) {
            System.out.println("홀수네요, 인형 선물입니다.!");
        }else {
            System.out.println("당첨 번호는 1~10사이에만 있어요");
        }*/

        //실습문제3
        /*Scanner sc = new Scanner(System.in);
        System.out.println("성실 점수");
        int sungsil = sc.nextInt();

        System.out.println("서비스 점수");
        int service = sc.nextInt();

        System.out.println("미소 점수");
        int smile = sc.nextInt();

        int average = ((sungsil + service + smile) / 3);

        if(average >= 60 && sungsil >= 40 && service >= 40 && smile >= 40) {
            System.out.println("합격입니다.!");
        }else {
            System.out.println("평균점수 미달로 불합격입니다.");

        }if (sungsil<40) {
            System.out.println("성실 점수 미달로 불합격입니다.");
        }if (service<40) {
            System.out.println("서비스 점수 미달로 불합격입니다.");
        }if (smile <40) {
            System.out.println("미소 점수 미달로 불합격입니다.");
        }*/

        //실습문제 4

        /*Scanner sc =new Scanner(System.in);

        System.out.println("월 급여 입력 :");
        int monthpay = sc.nextInt();

        System.out.println("매출액 입력 :");
        int monthpay2 = sc.nextInt();

        double bonus = 0;
        int total = 0;

        if(monthpay2 >= 50000000) {
            bonus = 0.05;
        } else if(monthpay2 >= 30000000) {
            bonus = 0.03;
        } else if(monthpay2 >= 10000000) {
            bonus = 0.01;
        } else {
            bonus = 0;
        }

        totalSalary = monthpay + (int)(monthpay2 * bonus);
        System.out.println("======================");
        System.out.println("매출액 : " + monthpay2);
        System.out.println("보너율 : " + (bonus * 100) + "%");
        System.out.println("월 급여 : " + monthpay);
        System.out.println("보너스 금액 : " + (int)(bonus * monthpay2));
        System.out.println("======================");
        System.out.println("총 급여 : " + total);



        반복문 실습문제1
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
        int num = sc.nextInt();

        int sum = 0;

        for(int i = 0; i <= num; i++) {
            if(i % 2 == 0) {
                sum += i;

            }
        }
        System.out.println("1부터 10까지 짝수의 합 :" + sum )








    }*/