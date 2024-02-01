package com.ohgiraffers.section01.array;

public class Application2 {

    public static void main(String[] args) {

        /*
         * [배열의 사용 방법]
         * 1. 배열 선언
         * 2. 배열 할당 (new 연산자 이용)
         * 3. 배열 인ㄷ게스 공간에 값 대입*/

        /*배열 선언
         * 자료형[] 배열명;
         * 자료형 배열명[]
         *
         * stack 영역에 배열의 주소를 보관할 수 있는 공간을 만드는 것이다.*/

        int[] iarr;

        /*배열할당*/
        iarr = new int[5];
//        iarr = new int[];     배열의 크기를 지정하지않아 에러발생

        int[] iarr2 = new int[5];

        /*선언과 동시에 할당과 동시에 초기화*/
        int[] iarr3 = new int[]{11, 22, 33, 44, 55};
        for (int i = 0; i < iarr3.length; i++) {
            System.out.println(iarr3[i]);
        }

        int[] iarr4 = {111, 222, 333, 444, 555};
        for (int i = 0; i < iarr4.length; i++) {
            System.out.println(iarr4[i]);
        }
//        String[] = sarr = {"red" , "orange", "yellow", "green", "purle"};
//        for (int i = 0; i<sarr.length; i++) {
//            System.out.println(sarr[i]);
        }



}
