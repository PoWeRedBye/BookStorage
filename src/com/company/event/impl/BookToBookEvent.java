package com.company.event.impl;

import com.company.Menu;
import com.company.Utils;
import com.company.event.Event;

import java.util.Scanner;

/**
 * Created by Maxim_Ozarovskiy on 21.12.2016.
 */
public class BookToBookEvent implements Event{

    private static BookToBookEvent instance;

    public static BookToBookEvent getInstance(){
        if(instance == null) instance = new BookToBookEvent();
        return instance;
    }

    public void doSomething() {
        Scanner scanner = new Scanner(System.in);
        Utils.renderMenu(Menu.BOOK_TO_BOOK_MENU);
        int point = scanner.nextInt();
        Utils.eventProcessor(point -1,Menu.EVENT_TYPES_BOOK_TO_BOOK_MENU);
    }

    private BookToBookEvent(){

    }
}
