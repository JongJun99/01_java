package com.ohgiraffers.section04.sort;

import java.util.Random;

public class pratice3 {
    public static void main(String[] args) {


        /*로또번호 생성기
        * 6칸짜리 정수 배열을 하나 생성하고
        * 1~45 중복되지 않은 난수를 발생시켜 각 인덱스에 대입한 뒤
        * 오름차순으로 정렬하여 출력
        * 중복되는 난수 발생 시 break문 사용 (중첩 for문)*/


        int[] array = new int[6];

        Random random = new Random();
        int a = (int)(Math.random() * 45) + 1; {
            for(int i =1; i<array.length; i++) {
                for(int j =0; j < 1; j++) {
                    if(array[i] < array[j]) {
                        int temp;
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }

            }
        }
        System.out.println("오름차순 출력 값 :" + array);


    }
}
