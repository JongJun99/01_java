package com.ohgiraffers.section03.map.run;

public class Book {
    private String title;
    private String author;
    private String publisher;

    public Book(){}

    public Book(String title, String author, String publisher){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }


    //setter


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    //getter

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String toString(){
        return title + " " + author + " " + publisher;
    }
}
