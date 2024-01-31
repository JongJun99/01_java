package com.ohgiraffers.test1;

import java.util.Random;
import java.util.Scanner;

public class TestMethod {


    /*Calculator 메소드를 하나 생성하여 매개변수를 정수형으로 2개 선언 후 매개변수끼리의 연산을
    * 복합 대입 연산자로 종류별로 출력되도록 작성. (단, 리턴값은 없는 메소드로 작성.)
    * 출력 예시 : 두 수를 더한 값은 ~~ 입니다.*/
    public void Calculator(int a, int b){

//        int a = 1;
//        int b = 2;

        int sum = a+=b;
        int min = a-=b;
        int nanugi = a/=b;
        int G = a*=b;
        int S = a%=b;

        System.out.println("두 수를 더한 값은" + sum);
        System.out.println("두 수를 뺀 값은" + min);
        System.out.println("두 수를 나눈 값은" + nanugi);
        System.out.println("두 수를 곱한 값은" + G);
        System.out.println("두 수의 나머지 값은" + S);


    }

    /*2. CircleArea 메소드를 하나 생성. (리턴값이 있으며 리턴값은 double형)
    원주율을 상수로 선언하고 초기화(3.14)

     반지름을 입력받아서 원의 부피를 구하는 결과값을 변수로 저장하고 그 결과값을 리턴해준다.
      ( 부피를 구하는 공식 :  원주율 * 반지름 * 반지름 )*/

    public static double CircleArea(){

        final float YUL = 3.14f; // 3.14(상수)

        Scanner sc = new Scanner(System.in);
        System.out.println("반지름을 입력해주세요 :");
        double radius = sc.nextDouble();

        double result = YUL * radius * radius;

        System.out.println("원의 부피는" + result + "입니다.");

        return result;


    }


    /* TestRandom 메소드를 생성 ( static 으로 생성해준다 ) (리턴값 있음)
    1~10까지의 난수를 생성해주고 변수에 저장해준다.
    생성된 난수값이 뭔지 알려주는 출력문을 알맞는 자료형으로 result 변수에 저장해준다.
    리턴값을 result로 해준다.*/

    public static int TestRandom(){

        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        int result = randomNumber;


        return result;
    }


}
