package com.sort.collection.comparator;

import com.sort.collection.domain.Student;

import java.util.Comparator;

/**
 * Created by ilyalees on 22/02/2017.
 */
public class Birth implements Comparator <Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getDateBirth().compareTo(o2.getDateBirth());
    }
}
