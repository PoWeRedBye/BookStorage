package com.company;

import com.company.event.Event;
import com.company.event.EventType;
import com.company.event.impl.AllBookEvent;
import com.company.event.impl.BookToBookEvent;

import java.util.*;

import static com.company.event.EventType.BOOK_TO_BOOK;
import static com.company.event.EventType.WRITE_ALL_BOOK;

/**
 * Created by Maxim_Ozarovskiy on 21.12.2016.
 */
public class Menu {
    public static final String[] MAIN_MENU = {
            "1:Все книги",
            "2:Зарезервировать книгу",
            "3:Снять резервацию",
            "*:Выход",
    };
    public static final String[] WRITE_BOOK = {
            "1:Выберете книгу",
            "2:Выход",
    };
    public static final String[] BOOK_TO_BOOK_MENU = {
            "1:Выберете книгу для резервации",
            "2:Выход",
    };
    public static final String[] CANCEL_BOOK_MENU = {
            "1:Выберете книгу для отмены резервации",
            "2:Выход",
    };

    public static final Map<EventType, Event> eventMap = new HashMap<EventType, Event>();

    public static final List<EventType> EVENT_TYPES_MAIN_MENU = new ArrayList<EventType>();
    public static final List<EventType> EVENT_TYPES_BOOK_TO_BOOK_MENU = new ArrayList<EventType>();

    static {
        initAllEventMap();
        initMainMenuEventTypes();
        initBookToBookMenuEventTypes();
    }

    private static void initAllEventMap() {
        eventMap.put(WRITE_ALL_BOOK, AllBookEvent.getInstance());
        eventMap.put(BOOK_TO_BOOK, BookToBookEvent.getInstance());
    }

    private static void initMainMenuEventTypes(){
        EVENT_TYPES_MAIN_MENU.add(WRITE_ALL_BOOK);
        EVENT_TYPES_MAIN_MENU.add(BOOK_TO_BOOK);
    }
    private static void initBookToBookMenuEventTypes(){
        EVENT_TYPES_BOOK_TO_BOOK_MENU.add(WRITE_ALL_BOOK);
    }



}
