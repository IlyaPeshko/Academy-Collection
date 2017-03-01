package com.sort.collection.domain;

/**
 * Created by ilyalees on 23/02/2017.
 */
public class Category {
    private String category;
    private Integer item;

    public Category(String category, Integer item) {
        this.category = category;
        this.item = item;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Category{" +
                "category='" + category + '\'' +
                ", item=" + item +
                '}';
    }
}
