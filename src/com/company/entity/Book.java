package com.company.entity;

/**
 * Created by Maxim_Ozarovskiy on 21.12.2016.
 */
public class Book {
    private final String author;
    private final String body;

    public Book(String author , String body) {
        this.author = author ;
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
