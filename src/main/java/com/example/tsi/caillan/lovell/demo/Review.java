package com.example.tsi.caillan.lovell.demo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int review_id;
    private int film_id;
    private String review;

    @ManyToOne
    @JsonIgnore
    @JoinColumn (name = "film_id", referencedColumnName = "film_id",
            updatable = false, insertable = false)
    private Film film;

    public Review(int film_id, String review){
        this.film_id= film_id;
        this.review = review;
    }

    public Review(){

    }

    public int getFilm_id() {
        return film_id;
    }

    public int getReview_id() {
        return review_id;
    }

    public void setReview_id(int review_id) {
        this.review_id = review_id;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }
}
