package com.ohgiraffers.section04.sort;

import java.util.Scanner;

public class partice2 {
    public static void main(String[] args) {
        /*주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요.
         *-- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *  -- 출력 예시 --
         *  990501-1******/

        Scanner sc =new Scanner((System.in));
        System.out.println("주민등럭번호를 입력하세요 :");
        String num = sc.nextLine();

        char[] array = num.toCharArray();   //문자열을 char형 배열로 바꿔줌

        for(int i = 8; i <num.length(); i++) {
            if(i>=8) {
                array[i] = '*';
            }

        }
        System.out.println("주민등록번호 보호모드 :");
        System.out.println(array);






    }
}
