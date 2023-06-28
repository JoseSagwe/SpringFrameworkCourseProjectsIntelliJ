package com.springboot.jpahibernate.learningjpaandhibernate.Course;

import org.springframework.stereotype.Component;


@Component
public class CourseSpecificationsClass {

    private long id;
    private String name;
    private String author;

    public CourseSpecificationsClass() {
    }

    public CourseSpecificationsClass(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "CourseSpecificationsClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

