package com.company.event.impl;

import com.company.db.MemDB;
import com.company.entity.Book;
import com.company.event.Event;


/**
 * Created by Maxim_Ozarovskiy on 21.12.2016.
 */
public class AllBookEvent implements Event {
    public static AllBookEvent getInstance(){
        if(instance == null) instance = new AllBookEvent();
        return instance;
    }

    private static AllBookEvent instance;

    public void doSomething() {
        for(Book book:MemDB.books){
            System.out.println(book);
        }
    }

    private AllBookEvent() {
    }
}
