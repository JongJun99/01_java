package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManger;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.List;
import java.util.Scanner;

public class BookMenu {

    private Scanner scanner = new Scanner(System.in);
    private BookManger bm = new BookManger();

    public BookMenu(){}
    public void mainMenu(){}
    public BookDTO inputBook(){};
    public int inputBookNo(){};
    public String inputBookTitle(){};
    public void selectSortedBook(List<BookDTO>)

}
