package com.example.tsi.caillan.lovell.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Film {

    @Id
    @GeneratedValue
    private int film_id;

    private String title;

    private int releaseYear;

    public Film(String title){
        this.title=title;
    }

    public Film(){

    }

    private String rating;

    public int getFilm_id() {
        return film_id;
    }

    public String getFilm() {
        return title;
    }

    public void setFilm(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

}