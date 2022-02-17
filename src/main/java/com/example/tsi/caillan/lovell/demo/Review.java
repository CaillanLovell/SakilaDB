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
    private double review_rating;

    @ManyToOne
    @JsonIgnore
    @JoinColumn (name = "film_id", referencedColumnName = "film_id",
            updatable = false, insertable = false)
    private Film film;

    public Review(int film_id, String review, double review_rating){
        this.film_id= film_id;
        this.review = review;
        this.review_rating = review_rating;
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

    public double getReview_rating() {
        return review_rating;
    }

    public void setReview_rating(double review_rating) {
        this.review_rating = review_rating;
    }
}
