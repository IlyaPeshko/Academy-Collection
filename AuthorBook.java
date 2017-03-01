package com.sort.collection.comparator;

import com.sort.collection.domain.Book;

import java.util.Comparator;

/**
 * Created by ilyalees on 22/02/2017.
 */
public class AuthorBook implements Comparator <Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
