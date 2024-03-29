package com.ohgiraffers.section03.map.run;

public class AniBook extends Book{
    private int accessAge;

    public AniBook() {}
    public AniBook(String title, String author, String publisher, int accessAge){
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    //getter
    public static int getAccessAge() {
        return accessAge;
    }

    //setter

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }

    public String toString(){
        return toString() + " " + accessAge;
    }
}
