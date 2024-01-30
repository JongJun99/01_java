package com.ohgiraffers.section06.tenary;

public class Application1 {

    public static void main(String[] args) {
        //삼항 연산자 , (실습문제)

        /*삼항 연산자
        * 자바에서 유일하게 피연산자 항목이 3개인 연산자이다.
        * (조건식)? 참일 때 사용할 값 : 거짓일 때 사용할 값
        * */

        /*삼항 연산자 단독 사용 */
        int num1 = 10;
        int num2 = -10;

        String result1 = (num1>0)? "양수다!" : "양수아니다!!";
        String result2 = (num2>0)? "양수다!" : "양수아니다!!";

        System.out.println("num1의 결과값은? :" + result1);
        System.out.println("num2의 결과값은? :" + result2);


        /*삼항 연산자 중첩 사용*/
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result3 = (num3>0)? "양수이다" : (num3==0)? "0이다." : "음수이다";
        String result4 = (num4>0)? "양수이다" : (num4==0)? "0이다." : "음수이다";
        String result5 = (num5>0)? "양수이다" : (num5==0)? "0이다." : "음수이다";

        System.out.println("num3의 결과값은 ? " + (result3));
        System.out.println("num4의 결과값은 ? " + (result4));
        System.out.println("num5의 결과값은 ? " + (result5));


        /*- 실습문제 1

        두 개의 정수형 변수를 선언하고, 삼항 연산자를 사용하여
        두 수 중 큰 수를 출력하는 프로그램을 작성해본다.*/

        int a = 20;
        int b = 1;

        int result7 = (a>b)? a:b;
        System.out.println("두 수 중 큰 수는"+(result7)+"입니다.");


        /* 실습문제 2
        정수형 변수를 선언하여 점수를 저장하고,
        삼항 연산자를 사용하여 점수가 60점 이상이면 “합격입니다”,
        그렇지 않으면 “아쉽지만 불합격입니다.” 을 출력하는 프로그램을 작성해본다.*/

        int score1 = 60;
        int score2 = 30;

        String result10 = (score1>=60)? "합격입니다" : "아쉽지만 불합격입니다.";
        String result11 = (score2>60)? "합격입니다." : "아쉽지만 불합격입니다.";

        System.out.println("result10의 결과값은?:" + result10);
        System.out.println("result11의 결과값은?:" + result11);

        /*
        - 실습문제 3
        정수형 변수를 선언하고, 삼항연산자를 사용하여
        입력된 수가 짝수인지 홀수인지 출력하는 프로그램을 작성해본다.
        참고사항 : 조건식에 %를 활용하여 짝수인지 홀수인지를 판단해 보세요~~ */

        int ab = 1;

        String resultAB = (ab%2==0)? "짝수입니다." : "홀수입니다.";

        System.out.println("resultAB의 결과값은? :" + (resultAB));


        /* - 실습문제 4
        실수를 변수로 선언하여 점수를 저장하고, 이를 정수로 변환하여
        점수가 90점 이상이면 ”A”,
        80점 이상이면 “B”,
        70점 이상이면 “C”,
        60점 이상이면”D”,
        60점 미만이면 “F”를 출력하는 프로그램을 작성해본다.
         */


        double scoreA = 80.5;
        int scoreB = (int)scoreA;

        String total = (scoreB>=90)? "A" :
                (scoreB>=80)? "B" :
                        (scoreB>=70)? "C" :
                                (scoreB>=60)? "D" :
                                        "F";


        System.out.println("박종준의 이번 점수등급은"+ (total)+"입니다.");



        /*실습문제 5
        정수형 변수를 두개 선언하여 회원의 월(month)과 일(day)를 저장합니다.
        월이 1월부터 6월까지이면서, 일이 1일부터 15일까지인 경우 “배민 쿠폰”을,
        월이 7월부터 12월까지이면서, 일이 16일부터 31일까지인 경우 “스타벅스 커피”를
        그 외의 경우는 “사탕”이 선물로 선택되는 프로그램을 작성해본다.*/

        int month = 5;
        int day = 1;

        String Coupon = "배민 쿠폰";
        String Coffee = "스타벅스 커피";
        String candy = "사탕";

        String gift = (month <= 6 && day <= 15) ? Coupon :
                (month >= 7 && day >= 16) ? Coffee :
                        candy;

        System.out.println("박종준 선물은 " + gift + " 입니다.");




    }
}
