package com.ohgiraffers.test.model.dto;

public class BookDTO {

    private int bNo;
    private int category;
    private String title;
    private String author;

    public BookDTO(){}
    public BookDTO(int category, String title, String author){
        this.bNo = bNo;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString(){
        return "도서 번호 :" + bNo + "도서분류코드 :" + category + "도서제목 :" + title + " 도서 저자 :" + author;
    }

    public int getbNo() {
        return bNo;
    }

    public int getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
