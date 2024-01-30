package com.ohgriaffers.section03.math;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Random;

public class Application3 {
    public static void main(String[] args) {
        //java.util.random 클래스

        /*java.util.Random 클래스를 활영하여 난수 발생
        * java.util.Random 클래스의 nextInt() 메소드를 이용한 난수 발생
        * nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시켜 정수로 반환 */

        /*random.nexInt(구하려는 난수 갯수) + 구하려는 난수 최소값*/

        Random random = new Random();

        int randomNum1 = random.nextInt(10);  //0~9까지의 난수 발생
        System.out.println("0~9의 난수 :" + randomNum1);

        int randomNumber2=random.nextInt(26) + 20;     //20~45까지의 난수발생
        System.out.println("20~45난수 :" + randomNumber2);




    }
}
