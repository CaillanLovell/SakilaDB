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

    @Test
    public void test_getLanguage(){
        language.setName("testname");
        assertEquals("testname",language.getName());

    }

    @Test
    public void test_getfilm(){
        film.setFilm("testfilm");
        assertEquals("testfilm",film.getFilm());

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


}
