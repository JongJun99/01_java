package com.ohgriaffers.section01.method;

public class Application5 {
    public static void main(String[] args) {
        //return이란 ?

        /*메소드 리턴에 대해 이해할 수 있다.
        * return 이란??
        * 모든 메소드 내부에는 return; 이 존재한다.
        * void 메소드의 경우 return;을 명시적으로 작성하지 않아도 마지막줄에 컴파일러가 자동으로 추가를 해준다.
        * return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어이다.*/

        System.out.println("main() 시작");
        Application5 app5 = new Application5();
        app5.testMethod();

        System.out.println("main() 종료");
    }
    public void testMethod() {
        System.out.println("testMethod() 동작확인");

        return; // 컴파일러에 의해 자동으로 추가되는 구문이며 마지막에 작성해야함 (그렇지 않으면 에러)
    }
}
