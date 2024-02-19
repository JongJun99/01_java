package com.ohgiraffers.test.controller;

import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.List;




public class BookManger {

    public class BookManager {

        List<BookDTO> bookDTOList = new ArrayList<>();
        public void BookManager(){

        }
        public void addBook(BookDTO book){
            bookDTOList.add(book);

        };
        public void deleteBook(int index){
            for(int i = 0; i < bookDTOList.size(); i++){
                if(bookDTOList.get(i).getbNo() == index) {
                    bookDTOList.remove(i);
                }
            }
        }

        public int searchBook(String Title){
            for(int i = 0; i < bookDTOList.size(); i++){
                if(bookDTOList.get(i).getTitle().equals(title)){
                    System.out.println(bookDTOList.get(i));
                }
            }
        }
        public void printBook(int index){}
        public void idsplayAll(){}
        public ArrayList<BookDTO> sortedBookList(int select){}
    }
}