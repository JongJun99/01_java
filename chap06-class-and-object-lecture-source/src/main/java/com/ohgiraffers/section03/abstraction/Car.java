package com.ohgiraffers.section03.abstraction;

public class Car {

    private boolean isOn;       //초기에는 시동이 꺼진 false 상태
    private int speed;

    public void startUp() {
        if(isOn) {
            System.out.println("이미 시동이 걸려있습니다.");
        } else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다. 출발 준비완료!");
        }
    }
    public void go() {
        if(isOn) {
            System.out.println("차가 앞으로 움직입니다.");
            this.speed += 10;
            System.out.println("현재 차의 시속은 :" + this.speed  + "km/h 입니다.");
        } else {
            System.out.println("차의 시동이 꺼져있습니다. 시동을 먼저 걸어주세요 ");
        }
    }

    public void stop() {
        if(isOn) {
            if(this.speed > 0) {
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");
            } else {
                System.out.println("차는 이미 멈춰있는 상태입니다.");
            }
        } else {
            System.out.println("차의 시동이 꺼져있습니다. 시동을 걸어주세요.");
        }
    }

    public void turnOff() {
        if(isOn) {
            if(this.speed > 0) {
                System.out.println("달리는 상태에서는 시동을 끌 수 없습니다.");
            } else {
                this.isOn = false;
                System.out.println("시동을 끕니다.");
            }
        } else {
            System.out.println("이미 시동이 꺼져있는 상태입니다.");
        }
    }
}
