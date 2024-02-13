package com.ohgiraffers.section01.list.dto;

public class BookDTO {

    private int number;
    private String title;
    private String author;
    private int place;

    public BookDTO() {}

    public BookDTO(int number, String title, String author, int place) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.place = place;
    }
    //getter

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPlace() {
        return place;
    }
    //setter

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", place=" + place +
                '}';
    }
}
