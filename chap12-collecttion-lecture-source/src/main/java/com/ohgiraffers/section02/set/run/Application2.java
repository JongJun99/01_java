package com.ohgiraffers.section02.set.run;

import java.util.LinkedList;
import java.util.TreeSet;

public class Application2 {
    public static void main(String[] args) {

        /*[ LinkedHashSet 클래스]
        * 추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
        * JDK 1.4 부터 제공하고 있다.*/

        LinkedList<String> lset = new LinkedList<>();

        lset.add("java");
        lset.add("oracle");
        lset.add("jdbc");
        lset.add("html");
        lset.add("css");

        System.out.println("lset :" + lset);

        TreeSet<String> tset = new TreeSet<>(lset);     //Treeset 오름차순 정렬
        System.out.println("tset :" + tset);
    }
}
