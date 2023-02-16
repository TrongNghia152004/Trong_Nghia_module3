package com.example.ss11_mvc.model;

public class Student {
    private int id;
    private String name;
    private double score;
    private String className;

    public Student() {
    }

    public Student(int id, String name, double score, String className) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.className = className;
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
