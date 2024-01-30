package com.ohgriaffers.section02.package_and_import;

public class Application1 {
    public static void main(String[] args) {

        //패키지란 ?

        /*패키지란 ?
        * 서로 관련 있는 클래스 또는 인터페이스 등을 모아서 하나의 단위를 구성하는 것
        * 같은 패지키 내에서는 동일한 이름의 클래스를 만들 수 없지만, 패키지가 다르면 동일한 이름을 가진 클래스를 만들 수 있다.
        * 클래스명은 원래 패키지명을 포함하고 있기 때문. 예) com.ohgiraffers.section01.method.Calculators (이게 클래스명)
        * 그렇기 때문에 다른 패키지에 존재하는 크래스를 사용하는 경우네는 클래스명 앞에 패키지명을 명시해 줘야한다. */

        com.ohgriaffers.section01.method.Calculator calc = new com.ohgriaffers.section01.method.Calculator();
        int min = calc.minNumber0f(30, 20);
        System.out.println("30과 20중 작은 수 ? " + min);

        /*static 메소드의 경우*/
        int max = com.ohgriaffers.section01.method.Calculator.maxNumberOf(30, 20);
        System.out.println("30과 20중 큰 수 ?" + max);

    }
}
