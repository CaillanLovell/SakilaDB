package com.example.tsi.caillan.lovell.demoTest;


import com.example.tsi.caillan.lovell.demo.Film;
import com.example.tsi.caillan.lovell.demo.Language;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


class SakilaMoviesDbApplicationTests {
    private Language language = new Language();
    private Film film = new Film();

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


}
