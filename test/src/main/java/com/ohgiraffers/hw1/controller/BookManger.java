package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.awt.print.Book;
import java.util.*;

public class BookManger {

        private List<BookDTO> bookDTOList = new ArrayList<>();
        private Scanner scanner = new Scanner(System.in);

        public BookManger(){};
        public void addBook(BookDTO book){
            bookDTOList.add(book);
            System.out.println("도서 추가 :");
        };
        public void deleteBook(int key){
            for(int i =0; i < bookDTOList.size(); i++){
                if(bookDTOList.get(i).getbNo() == key){
                    bookDTOList.remove(i);
                    System.out.println("도서 삭제 :");
                    return;
                }
            }
        }
        public void searchBook(String title){
            for(int i = 0; i < bookDTOList.size(); i++){
                if(bookDTOList.get(i).getTitle().equals(title)){
                    System.out.println(bookDTOList.get(i));
                }else {
                    System.out.println("찾는 도서가 없습니다.");
                }
            }
        };
        public void displayAll(){
            if(bookDTOList.isEmpty()){
                System.out.println("조회결과가 없습니다.");
            } else {
                System.out.println("도서 전체목록 출력 :");
                for(int i = 0; i < bookDTOList.size(); i++){
                    System.out.println(bookDTOList.get(i));
                }

            }
        };
        public List<BookDTO> sortedBookList(int type){
                switch (type) {
                    case 1 :
                        bookDTOList.sort(Comparator.comparingInt(BookDTO::getbNo));
                        break;

                    case 2 :
                        bookDTOList.sort(Comparator.comparingInt(BookDTO::getbNo).reversed());
                        break;

                    case 3 :
                        bookDTOList.sort(Comparator.comparing(BookDTO::getTitle));
                        break;

                    case 4 :
                        bookDTOList.sort(Comparator.comparing(BookDTO::getTitle).reversed());
                        break;


            }
        }




}
