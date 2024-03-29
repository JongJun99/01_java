package com.ohgiraffers.Dajeong.controller;

import com.ohgiraffers.Dajeong.comparator.AscPrice;
import com.ohgiraffers.Dajeong.comparator.AscTitle;
import com.ohgiraffers.Dajeong.comparator.DescPrice;
import com.ohgiraffers.Dajeong.comparator.DescTitle;
import com.ohgiraffers.Dajeong.model.dto.Member;
import com.ohgiraffers.Dajeong.model.dto.stockDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class stockManager {
    private Scanner sc = new Scanner(System.in);
    private Member mem = null;
    private stockDTO[] stockList = new stockDTO[10];
    {
        stockList [0] = new stockDTO("삼성전자", 73300);
        stockList [1] = new stockDTO("SK하이닉스", 149600);
        stockList [2] = new stockDTO("LG에너지솔루션", 404000);
        stockList [3] = new stockDTO("삼성바이오로직스", 818000);
        stockList [4] = new stockDTO("삼성전자우", 62900);
        stockList [5] = new stockDTO("현대차", 242000);
        stockList [6] = new stockDTO("기아", 116100);
        stockList [7] = new stockDTO("셀트리온", 179900);
        stockList [8] = new stockDTO("POSCO홀딩스", 440000);
        stockList [9] = new stockDTO("LG화학", 506000);
    }
    private ArrayList<stockDTO> account;
    public stockManager(){account = new ArrayList<>();}
    public void displayAll(){
        for (stockDTO i : stockList){
            System.out.println(i);
        }
    }
    public void insertInfo(Member mem){
        this.mem = mem;
    }
    public void myInfo(){
        System.out.println(this.mem);
        myAccount();
    }
    public void myAccount(){
        if(account.size() == 0) {
            System.out.println("보유 주식이 없습니다.");
            return;
        }
        if(account.size() > 1){
            sortedBookList();
        }
        for(int i=0; i<account.size(); i++){
            System.out.println("보유 종목명 : " + account.get(i).getTitle() + ", 개수 : " + account.get(i).getCount() + ", 현재가 : " + account.get(i).getPrice() + "원");
        }
    }
    public ArrayList<stockDTO> sortedBookList(){
        label : while (true){
            System.out.print("정렬 방식 선택(1.종목명 오름차순 / 2.종목명 내림차순 / 3.현재가 오름차순 / 4.현재가 내림차순) : ");
            int type = sc.nextInt();
            sc.nextLine();

            switch (type){
                case 1 :
                    Comparator<stockDTO> ascTtl = new AscTitle();
                    account.sort(ascTtl);
                    break;
                case 2 :
                    Comparator<stockDTO> descTtl = new DescTitle();
                    account.sort(descTtl);
                    break;
                case 3 :
                    Comparator<stockDTO> ascNo = new AscPrice();
                    account.sort(ascNo);
                    break;
                case 4 :
                    Comparator<stockDTO> descNo = new DescPrice();
                    account.sort(descNo);
                    break;
                default:
                    System.out.println("보기중에서 선택해주세요.");
                    continue label;
            }
            break;
        }

        return account;
    }

    public void addMoney(int num){
        mem.setMoney(mem.getMoney() + num);
        System.out.println("현재 보유금액 : " + mem.getMoney());
    }
    public boolean buyStock(String ttl, int num){
        boolean isTrue = false;
        int price = 0;

        for (int i=0; i<stockList.length; i++){
            if(stockList[i].getTitle().equals(ttl)){
                price = stockList[i].getPrice();
            }
        }

        System.out.println("가격 : " + price);
        int needs = price * num;
        stockDTO dto = new stockDTO(ttl, num, price);

        if(needs < mem.getMoney()) {
            isTrue = true;
            account.add(dto);
            mem.setMoney(mem.getMoney() - needs);
        }

        return isTrue;
    }
    public int sellStock(String ttl, int num){
        int result = 0;
        int present = 0;

        for(int i=0; i<account.size(); i++){
            if(account.get(i).getTitle().equals(ttl)){
                present = account.get(i).getPrice();
            }
        }

        present = calcPercent(present);

        if(present == 0) return result;

        System.out.println(ttl + " 주식의 현재가는 " + present + "원 입니다.");
        System.out.print("매도 하시겠습니까?(1.네 / 2.아니오): ");
        int index = sc.nextInt();
        sc.nextLine();

        if(index == 2){
            result = 2;
            for(int i=0; i<account.size(); i++){
                if(account.get(i).getTitle().equals(ttl)){
                    account.get(i).setPrice(present);
                }
            }
        }else if(index == 1){
            result = 1;
            for(int i=0; i<account.size(); i++){
                if(account.get(i).getTitle().equals(ttl)){
                    int earn = present * num;
                    mem.setMoney(mem.getMoney() + earn);

                    int count = account.get(i).getCount() - num;
                    if(count == 0){
                        account.remove(i);
                    }else if(count > 0){
                        account.get(i).setCount(count);
                        account.get(i).setPrice(present);
                    }

                }
            }
        }

        return result;
    }
    public int randomPercent(){
        int number = (int)(Math.random()*100);
        int sign = (int)(Math.random()*2);
        int percent = 0;

        if(sign == 0){
            percent = -number;
        }else{
            percent = number;
        }

        return percent;
    }
    public int calcPercent(int num){
        int percent = randomPercent();

        int money = (int)(num+(num*(percent*0.01)));

        return money;
    }
}
