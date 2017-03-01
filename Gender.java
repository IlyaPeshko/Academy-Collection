package com.sort.collection.comparator;

import com.sort.collection.domain.Student;

import java.util.Comparator;

/**
 * Created by ilyalees on 22/02/2017.
 */
public class Gender implements Comparator <Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGender().compareTo(o2.getGender());
    }
}
