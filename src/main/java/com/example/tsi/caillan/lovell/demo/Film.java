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

    public Film(String title, String rating){
        this.title=title;
    }

    private String rating;

    public Film(){

    }

    public int getFilm_id() {
        return film_id;
    }

    public String getFilm() {
        return title;
    }

    public void setFilm(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

}