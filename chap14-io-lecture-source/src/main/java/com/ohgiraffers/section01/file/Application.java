package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {




        //[ File 클래스]
        /*JDK 1.0부터 지원하는 API로 파일 처리를 수행하는 대표적인 클래스이다.
        * 대상 파일에 대한 정보를 인스턴스를 생성하고
        * 파일의 생성, 삭제 등등의 처리를 수행하는 기능을 제공하고 있다.*/

        File file = new File("src/main/java/com/ohgiraffers/section01/file/test.txt");

        try {
            boolean creatSuccess = file.createNewFile();
            System.out.println("createSucess :" + creatSuccess);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("파일의 크기 :" + file.length() + "byte");
        System.out.println("파일의 경로 :" + file.getPath());
        System.out.println("현재 파일의 상위 경로 :" + file.getParent());
        System.out.println("파일의 절대 경로 :" + file.getAbsolutePath());     //최상의 루트 위치부터의 경로

        boolean deleteSuccess = file.delete();  //파일 또는 디렉토리 삭제
        System.out.println("deleteSuccess :" + deleteSuccess);


    }
}
