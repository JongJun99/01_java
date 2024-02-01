package com.ohgiraffers.section04.sort;

public class pratice {
    public static void main(String[] args) {

        // 크기가 5인 int형 배열을 만들고(arr) for문을 활용해 10부터 15까지의 정수를 초기화한 뒤
        //각 인덱스에 담긴 값을 출력해 보자.

        int[] arr = {10,11,12,13,14};  //int 형 배열에 변수를 선언하고 값 초기화
        int[] arr1= new int[5];     //크기가 5인 배열 생성

        for(int i = 0; i< 5; i++) {
            arr[i] = i+10;
            System.out.println(arr[i]);
        }


    }
}
