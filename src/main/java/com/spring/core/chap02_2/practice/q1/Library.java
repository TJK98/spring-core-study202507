package com.spring.core.chap02_2.practice.q1;

import java.util.List;

public class Library {

    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void printBooks() {
        books.forEach(System.out::println);
    }
}