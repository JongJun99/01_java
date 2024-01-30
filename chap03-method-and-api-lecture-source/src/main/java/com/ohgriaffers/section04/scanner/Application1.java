package com.ohgriaffers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        //java.util.Scanner 를 이용 다양한 자료형 값 입력받기

        /*java.util.Scanner 를 이용 다양한 자료형 값 입력받기*/

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 :");
        String name = sc.nextLine();    //문자열 입력 nextLine()
        System.out.println("입력하신 이름은 " +name + "입니다.");

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();     //int형
        System.out.println("입력하신 나이는" + age);

        System.out.print("키를 입력해주세요");
        float heigh = sc.nextFloat();   //Float 실수형
        System.out.println("입력하신 키는 " + heigh + "입니다.");

        System.out.print("true 또는 false 입력해주세요.:");
        boolean isTrue = sc.nextBoolean();  // 논리형 boolean
        System.out.println("입력하신 논리값은?" + isTrue + "입니다.");

        sc.nextLine();
        System.out.print("아무 문자열을 입력해주세요 :");
        char ch = sc.nextLine().charAt(0);    //인덱스 [1,2,3,4,5] 1이 0부터 시작함 역순으로하면 5가 -1로시작
        System.out.println("입력하신 문자는" + ch + " 입니다.");



    }
}
