package com.example.tsi.caillan.lovell.demoTest;

import com.example.tsi.caillan.lovell.demo.*;

import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class menuCucumberStepsDef {

    private SakilaMoviesDbApplication sakila;
    @Mock
    private LanguageRepository languageRepository; // Fake language table

    @Mock
    private FilmRepository filmRepository;

    @Mock
    private ActorRepository actorRepository;

    @Mock
    private CityRepository cityRepository;

    @Mock
    private CategoryRepository categoryRepository;

    @Mock
    private ReviewRepository reviewRepository;

    @BeforeEach
    void setup()
    {
        languageRepository = mock(LanguageRepository.class);
        actorRepository = mock(ActorRepository.class);
        filmRepository = mock(FilmRepository.class);
        categoryRepository = mock(CategoryRepository.class);
        reviewRepository = mock(ReviewRepository.class);
        cityRepository = mock(CityRepository.class);
        sakila = new SakilaMoviesDbApplication(languageRepository, filmRepository, actorRepository, categoryRepository, cityRepository, reviewRepository);
    }

    Language savedLanguage;
    @Given("I want to add a language")
    public void i_want_to_add_a_language() {
        setup();
        savedLanguage = new Language("test language");
    }

    String actual;
    @When("I put a post request to add the language")
    public void i_put_a_post_request_to_add_the_language() {
        actual = sakila.addLanguage(savedLanguage.getName());
    }


    @Then("I should be told {string}")
    public void i_should_be_told(String save) {

        String expected = "save";
        Assertions.assertEquals(expected, actual, "Save failed");

        // Verify that the save occured
        ArgumentCaptor<Language> languageArgumentCaptor = ArgumentCaptor.forClass(Language.class);
        verify(languageRepository).save(languageArgumentCaptor.capture());
        languageArgumentCaptor.getValue();
    }

    Category savedCategory;
    @Given("I want to add a category")
    public void i_want_to_add_a_category() {
        setup();
        savedCategory = new Category("test category");
    }

    String proper;
    @When("I put a post request to add the category")
    public void i_put_a_post_request_to_add_the_category() {
        proper = sakila.addCategory(savedCategory.getCategory());
    }


    @Then("I should have returned {string}")
    public void i_should_have_returned(String save) {

        String expected = "save";
        Assertions.assertEquals(expected, actual, "Save failed");

        // Verify that the save occured
        ArgumentCaptor<Category>categoryArgumentCaptor = ArgumentCaptor.forClass(Category.class);
        verify(categoryRepository).save(categoryArgumentCaptor.capture());
        categoryArgumentCaptor.getValue();
    }

    Actor savedActor;
    @Given("I want to add an actor")
    public void i_want_to_add_an_actor() {
        setup();
        savedActor = new Actor("test first name", "test last name");
    }

    String example;
    @When("I put a post request to add an actor")
    public void i_put_a_post_request_to_add_an_actor() {
        example = sakila.addActor(savedActor.getFirst_name(), savedActor.getLast_name());
    }


    @Then("I should be told {string}")
    public void i_have_returned(String save) {

        String expected = "save";
        Assertions.assertEquals(expected, example, "Save failed");

        // Verify that the save occured
        ArgumentCaptor<Category>categoryArgumentCaptor = ArgumentCaptor.forClass(Category.class);
        verify(categoryRepository).save(categoryArgumentCaptor.capture());
        categoryArgumentCaptor.getValue();
    }

}
