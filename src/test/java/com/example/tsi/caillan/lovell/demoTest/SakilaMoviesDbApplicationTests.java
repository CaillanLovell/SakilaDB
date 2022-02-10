package com.example.tsi.caillan.lovell.demoTest;


import com.example.tsi.caillan.lovell.demo.Language;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


class SakilaMoviesDbApplicationTests {
    private Language language = new Language();

    @Test
    public void test_getName(){
        language.setName("testname");
        assertEquals("testname",language.getName());

    }


}
