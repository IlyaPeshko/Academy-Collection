package com.sort.collection.domain;

import java.util.Comparator;

/**

 */
public class Book implements Comparable <Book>{
    private String title;
    private String author;

    public Book () {}

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\t' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return title.hashCode()-o.title.hashCode();
    }
}
