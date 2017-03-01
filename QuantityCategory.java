package com.sort.collection.comparator;

import com.sort.collection.domain.Category;

import java.util.Comparator;

/**
 * Created by ilyalees on 23/02/2017.
 */
public class QuantityCategory implements Comparator <Category> {
    @Override
    public int compare(Category o1, Category o2) {
        return o1.getItem().compareTo(o2.getItem());
    }
}
