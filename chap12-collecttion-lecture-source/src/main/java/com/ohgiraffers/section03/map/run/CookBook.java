package com.ohgiraffers.section03.map.run;

public class CookBook extends Book{
    private boolean coupon;
    public CookBook(){}
    public CookBook(String title, String author, String publisher, boolean coupon ){
        super(title, author, publisher);
        this.coupon = coupon;

    }



    //setter
    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    //getter

    public boolean isCoupon() {
        return coupon;
    }


    public String toString(){
        return super.toString() + "  " + coupon;
    }


}
