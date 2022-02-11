package com.example.tsi.caillan.lovell.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int review_id;
    private int film_id;
    private String review;

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
}
