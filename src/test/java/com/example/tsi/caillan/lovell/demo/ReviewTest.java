package com.example.tsi.caillan.lovell.demo;

import org.apache.catalina.valves.rewrite.RewriteCond;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReviewTest {

    private Review review = new Review();
    private int film_id;
    private int review_id;

    @Test
    void getFilm_id() {
        review.getFilm_id();
        assertEquals(film_id, review.getFilm_id());
    }

    @Test
    void getReview_id() {
    }

    @Test
    void setReview_id() {
    }

    @Test
    void getReview() {
    }

    @Test
    void setReview() {
    }
}