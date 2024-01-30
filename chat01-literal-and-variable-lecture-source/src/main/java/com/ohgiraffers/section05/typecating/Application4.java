package com.ohgiraffers.section05.typecating;

public class Application4 {
    public static void main(String[] args) {
        //데이터손실

        /*필기. 형변환 사용 시 주의할 점
        * 데이터 손실에 유의해서 사용해야 한다.
        * */

        //의도치 않은 데이터 손실
        int inum = 290;
        byte bnum = (byte)inum;

        System.out.println("inum :" + inum);
        System.out.println("bnum :" + bnum);    //데이터 손실로 예측이 어려움


        //의도한 데이터 손실
        double height = 175.5;
        int floorHeight = (int)height;

        System.out.println("height: " + height);
        System.out.println("floorHeight: " + floorHeight);


        /*필기.
        * 산술 연살자
        * 산술 연산자는 주로 사칙연산과 관련된 연산자로 가장 기본적이면서도 많이 사용되는 연산자이다.
        * 연산의 실행이 가능하기 위해 필요한 값이나 변수가 두 개인 이항 연산자로 분류되며
        * 피연산자들의 연산 방향은 왼쪽에서 오른쪽이다.
         */


















    }
}
