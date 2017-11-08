package com.codeclan.topmovieslist;


public class Movie {

    private int ranking;
    private String title;
    private int year;
    private int id;

    public Movie(Integer ranking, String title, Integer year) {
        this.ranking = ranking;
        this.title = title;
        this.year = year;
    }

    public Movie(int id, Integer ranking, String title, Integer year){
        this.id = id;
        this.ranking = ranking;
        this.title = title;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

}
