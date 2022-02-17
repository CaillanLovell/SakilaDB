package com.example.tsi.caillan.lovell.demo;

import org.apache.catalina.valves.rewrite.RewriteCond;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReviewTest {

    private Review review = new Review();
    private int film_id;
    private int review_id;
    private String testreview;
    private double testrating;

    @Test
    void getFilm_id() {
        review.getFilm_id();
        assertEquals(film_id, review.getFilm_id());
    }

    @Test
    void getReview_id() {
        review.setReview_id(review_id);
        assertEquals(review_id,review.getReview_id());
    }

    @Test
    void setReview_id() {
        review.setReview_id(review_id);
        assertEquals(review_id,review.getReview_id());
    }

    @Test
    void getReview() {
        review.setReview(testreview);
        assertEquals(testreview, review.getReview());
    }

    @Test
    void setReview() {
        review.setReview(testreview);
        assertEquals(testreview, review.getReview());
    }

    @Test
    void getReview_rating(){
        review.setReview_rating(testrating);
        assertEquals(testrating, review.getReview_rating());

    }

    @Test
    void setReview_rating(){
        review.setReview_rating(testrating);
        assertEquals(testrating, review.getReview_rating());
    }
}