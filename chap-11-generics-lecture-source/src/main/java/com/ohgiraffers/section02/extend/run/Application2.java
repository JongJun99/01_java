package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application2 {
    public static void main(String[] args) {

        /*[와일드 카드]
        * 제네릭 클래스 타입의 객체를 메소드의 메개변수로 받을 때,
        * 그 객체의 타입 변수를 제한할 수 있다.
        *
        * <?> : 제한없음
        * <? extends Type> : 와일드카드의 상한제한(Type과 Type의 후손을 이욯해 생성한 인스턴스만 인자로 사용가능)
        * <? super Type> : 와일드카드의 하한 제한 (Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용가능)*/


        WildCardFArm wildCardFArm = new WildCardFArm();

        /* <?> */
//        wildCardFArm.anyType(new RabbitFarm<Mammal>(new Mammal()));
//        WildCardFArm.anyType(new RabbitFarm<Raptile>(new Raptile()));
//        WildCardFArm.anyType((new RabbitFarm<Rabbit>(new Rabbit())));
//        WildCardFArm.anyType((new RabbitFarm<Bunny>(new Bunny())));
//        WildCardFArm.anyType((new RabbitFarm<DrunkenBunny>(new DrunkenBunny())));

        /*<? extends Bunny >*/
//        wildCardFArm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFArm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFArm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        /*<? super Bunny >*/
        wildCardFArm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFArm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFArm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
    }
}
