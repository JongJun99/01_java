package com.ohgiraffers.section04.sort;

import java.util.Scanner;

public class pratice {
    public static void main(String[] args) {

        // 크기가 5인 int형 배열을 만들고(arr) for문을 활용해 10부터 15까지의 정수를 초기화한 뒤
        //각 인덱스에 담긴 값을 출력해 보자.

        String[] fruits = {"딸기", "바나나", "복숭아", "키위", "사과"};

        Scanner sc = new Scanner(System.in);
        System.out.println("0부터 4까지의 정수를 입력하세요:");
        int num = sc.nextInt();

        if(num>=0 && num<=4) {
            System.out.println(fruits[num]);

            }else {
            System.out.println("준비된 과일이 없습니다.");
        }



    }
}
