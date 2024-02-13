package com.ohgiraffers.hw1.run;

import com.ohgiraffers.model.dto.Employee;
import com.ohgiraffers.model.dto.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Student[] students = new Student[3];    //3명의 학생정보 객체 배열 할당

        /*위의 사용데이터 참고하여 3명의 학생 정보 초기화 */
        students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        for(Student student : students) {   //향상된 for문으로 학생정보 모두 출력
            System.out.println(student.information());
        }
        Employee[] employees = new Employee[10]; // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        Scanner scanner = new Scanner(System.in);

        int employeeCount = 0;

        while(true) {
            System.out.println("사원들의 정보를 추가합니까 ? (y)");
            String answer = scanner.next();
        }
        if(answer.equals('y')) {
            System.out.println("이름을 입력하세요 :");
            String name = scanner.next();

            System.out.println("나이를 입력하세요 :");
            int age = scanner.nextInt();

            System.out.println("키를 입력하세요 :");
            double height = scanner.nextDouble();

            System.out.println("몸무게를 입력하세요 :");
            double weight = scanner.nextDouble();

            System.out.println("월급을 입력하세요 :");
            int salary = scanner.nextInt();

            System.out.println("과를 입력하세요 :");
            String dept = scanner.next();


        }







    }
}
