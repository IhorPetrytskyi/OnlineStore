package org.ip.demo;

public class Movie {

    private final String name;
    private final int year;
    private String category;


    public Movie(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Movie(String name, int year, String category) {
        this.name = name;
        this.year = year;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
