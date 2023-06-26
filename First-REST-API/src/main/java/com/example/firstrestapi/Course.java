package com.example.firstrestapi;

public class Course {
    private long id;
    private String course;
    private  String author;

    //Constructor
    public Course(long id, String course, String author) {
        this.id = id;
        this.course = course;
        this.author = author;
    }

    //Setters


    public void setId(long id) {
        this.id = id;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //Getters

    public long getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public String getAuthor() {
        return author;
    }

    //toString

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", course='" + course + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
