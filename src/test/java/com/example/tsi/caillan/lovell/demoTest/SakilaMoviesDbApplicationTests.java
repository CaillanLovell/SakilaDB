package com.example.tsi.caillan.lovell.demoTest;


import com.example.tsi.caillan.lovell.demo.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


class SakilaMoviesDbApplicationTests {
    private Language language = new Language();
    private Film film = new Film();
    private City city = new City();
    private Actor actor = new Actor();
    private Category category = new Category();
    private int film_id;
    private int release_year;
    private int language_id;
    private String rating;
    private List testreview;
    private String title;
    private String testFirst_name;
    private String testLast_name;
    private int category_id;
    private Set testFilm;
    private Set testActor;

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
        assertEquals(language_id, film.getLanguage_id());
    }

    @Test
    public void test_setLanguage_id(){
        film.setLanguage_id(language_id);
        assertEquals(language_id, film.getLanguage_id());
    }

    @Test
    public void test_getReviews(){
        film.setReviews(testreview);
        assertEquals(testreview, film.getReviews());
    }

    @Test
    public void test_getactorid(){
        assertEquals(0,actor.getActor_id());
    }

    @Test
    public void test_Filmconstructor(){
        Film testFilm = new Film(release_year, rating, title, language_id);
        assertEquals(release_year, testFilm.getRelease_year());
        assertEquals(rating, testFilm.getRating());
        assertEquals(title, testFilm.getTitle());
        assertEquals(language_id, testFilm.getLanguage_id());
    }

    @Test
    public void test_ActorConstructor(){
        Actor testActor = new Actor(testFirst_name,testLast_name);
        assertEquals(testFirst_name, testActor.getFirst_name());
        assertEquals(testLast_name, testActor.getLast_name());
    }

    @Test
    public void test_getFilminActor(){
        actor.setFilm(testFilm);
        assertEquals(testFilm, actor.getFilm());
    }

    @Test
    public void test_getActorinFilm(){
        film.setActor(testActor);
        assertEquals(testActor, film.getActor());
    }

    @Test
    public void test_getFilminLanguage(){
        language.setFilm(testFilm);
        assertEquals(testFilm, language.getFilm());
    }

    @Test
    public void test_languageid(){
        assertEquals(language_id, language.getLanguage_id());
    }

    @Test
    void emptyConstructorTest() {
        assertTrue("This test has failed", category instanceof Category);
    }

    @Test
    public void test_categoryid(){
        assertEquals(category_id, category.getCategory_id());
    }

    @Test
    public void test_getCategory(){
        category.setCategory(rating);
        assertEquals(rating, category.getCategory());
    }

    @Test
    public void test_getCountryid(){
        city.setCountry_id(language_id);
        assertEquals(language_id, city.getCountry_id());
    }
    @Test
    public void test_getCityid(){
        assertEquals(language_id, city.getCity_id());
    }

}
