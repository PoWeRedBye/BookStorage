package com.company;

import com.company.db.MemDB;
import com.company.entity.Book;
import com.company.event.EventType;

import java.util.List;


/**
 * Created by Maxim_Ozarovskiy on 21.12.2016.
 */
public class Utils {

    public static void addMockBooks() {
        MemDB.books.add(new Book("a1", "bla bla bla1"));
        MemDB.books.add(new Book("a2", "bla bla bla2"));
        MemDB.books.add(new Book("a3", "bla bla bla3"));
        MemDB.books.add(new Book("a4", "bla bla bla4"));
        MemDB.books.add(new Book("a5", "bla bla bla5"));
        MemDB.books.add(new Book("a6", "bla bla bla6"));
        MemDB.books.add(new Book("a7", "bla bla bla7"));
    }

    public static void renderMenu(String[] stringList) {
        for (String s : stringList) {
            System.out.println(s);
        }
    }

    public static void eventProcessor(int point, List<EventType> eventTypes) {
        Menu.eventMap.get(eventTypes.get(point)).doSomething();
    }

}
