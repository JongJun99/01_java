package com.ohgiraffers.section03.map.run;

import java.util.Scanner;

public class LibraryMenu {

    private LibaryManger Im = new LibaryManger();
    Scanner scanner = new Scanner(System.in);



    public void mainMenu(){
        System.out.println("이름을 입력하세요 :");
        String name = scanner.next();

        System.out.println("나이를 입력하세요 :");
        int age = scanner.nextInt();

        System.out.println("성별을 입력하세요 :");
        char gender = scanner.nextLine().charAt(0);


    }
    public void selectAll(){}
    public void searchBook(){}
    public void rentBook(){};




}
