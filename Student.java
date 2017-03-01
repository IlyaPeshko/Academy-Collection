package com.sort.collection.domain;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by ilyalees on 20/02/2017.
 */
public class Student implements Comparable <Student>, Comparator <Book>{
    private String name;
    private Date dateBirth;
    private String course;
    private String faculty;
    private String gender;

    public Student (){}

    public Student(String name, Date dateBirth, String course, String faculty, String gender) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.course = course;
        this.faculty = faculty;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        return "Student{" +
                "name='" + name + '\t' +
                "dateBirth=" + format.format(dateBirth) +
                ", course='" + course + '\'' +
                ", faculty='" + faculty + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
