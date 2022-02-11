package com.example.tsi.caillan.lovell.demoTest;


import com.example.tsi.caillan.lovell.demo.Actor;
import com.example.tsi.caillan.lovell.demo.City;
import com.example.tsi.caillan.lovell.demo.Film;
import com.example.tsi.caillan.lovell.demo.Language;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


class SakilaMoviesDbApplicationTests {
    private Language language = new Language();
    private Film film = new Film();
    private City city = new City();
    private Actor actor = new Actor();
    private int film_id;
    private int release_year;
    private int language_id;
    private String rating;

    @Test
    public void test_getLanguage(){
        language.setName("testname");
        assertEquals("testname",language.getName());

    }

    @Test
    public void test_getfilm(){
        film.setTitle("testfilm");
        assertEquals("testfilm",film.getTitle());

    }

    @Test
    public void test_getcity(){
        city.setCity("testcity");
        assertEquals("testcity",city.getCity());

    }

    @Test
    public void test_getactorfirstname(){
        actor.setFirst_name("testfirstname");
        assertEquals("testfirstname",actor.getFirst_name());

    }

    @Test
    public void test_getactorlastname(){
        actor.setLast_name("testlastname");
        assertEquals("testlastname",actor.getLast_name());

    }

    @Test
    public void test_getfilmid(){
        film.getFilm_id();
        assertEquals(film_id, film.getFilm_id());

    }

    @Test
    public void test_getRelease_year(){
        film.getRelease_year();
        assertEquals(release_year, film.getRelease_year());
    }

    @Test
    public void test_setRelease_year(){
        film.setRelease_year(release_year);
        assertEquals(release_year, film.getRelease_year());
    }

    @Test
    public void test_getRating(){
        film.getRating();
        assertEquals(rating, film.getRating());
    }

    @Test
    public void test_setRating(){
        film.setRating(rating);
        assertEquals(rating, film.getRating());
    }

    @Test
    public void test_getLanguage_id(){
        film.getLanguage_id();
        assertEquals(language_id, film.getLanguage_id());
    }

    @Test
    public void test_setLanguage_id(){
        film.setLanguage_id(language_id);
        assertEquals(language_id, film.getLanguage_id());
    }
}
