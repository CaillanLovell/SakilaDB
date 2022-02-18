package com.example.tsi.caillan.lovell.demoTest;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.tsi.caillan.lovell.demo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class MokitoTest {
    private SakilaMoviesDbApplication sakilaMoviesDbApplication;
    @Mock
    private LanguageRepository languageRepository;
    @Mock
    private ActorRepository actorRepository;
    @Mock
    private CityRepository cityRepository;
    @Mock
    private CategoryRepository categoryRepository;
    @Mock
    private FilmRepository filmRepository;
    @Mock
    private ReviewRepository reviewRepository;
    @BeforeEach
    void Setup(){
        sakilaMoviesDbApplication = new SakilaMoviesDbApplication(languageRepository,
                filmRepository,
                actorRepository,
                categoryRepository,
                cityRepository,
                reviewRepository);
    }

    @Test
    public void testAddLanguage(){
        Language saveLanguage = new Language("testlanguage");
        String expected = "save";
        String actual = sakilaMoviesDbApplication.addLanguage(saveLanguage.getName());
        ArgumentCaptor<Language>langugageArguemenetCaptor = ArgumentCaptor.forClass(Language.class);
        verify(languageRepository).save(langugageArguemenetCaptor.capture());
        langugageArguemenetCaptor.getValue();
        Assertions.assertEquals(expected, actual, "Data hasnt been added");
    }

    @Test
    public void testAddCategories(){
        Category saveCategory = new Category("testcategory");
        String expected = "save";
            String actual = sakilaMoviesDbApplication.addCategory(saveCategory.getCategory());
        ArgumentCaptor<Category>categoryArgumentCaptor = ArgumentCaptor.forClass(Category.class);
        verify(categoryRepository).save(categoryArgumentCaptor.capture());
        categoryArgumentCaptor.getValue();
        Assertions.assertEquals(expected, actual, "Data hasnt been added");
    }

    @Test
    public void testAddReviews(){
        Review saveReview = new Review (1, "testreview", 5.0);
        String expected = "save";
        String actual = sakilaMoviesDbApplication.addReview(saveReview.getReview_id(), saveReview.getReview(), saveReview.getReview_rating());
        ArgumentCaptor<Review>reviewArgumentCaptor = ArgumentCaptor.forClass(Review.class);
        verify(reviewRepository).save(reviewArgumentCaptor.capture());
        reviewArgumentCaptor.getValue();
        Assertions.assertEquals(expected, actual, "Data hasnt been added");
    }

    @Test
    public void testAddActors(){
        Actor saveActor = new Actor ("testfirstname", "testlastname");
        String expected = "save";
        String actual = sakilaMoviesDbApplication.addActor(saveActor.getFirst_name(), saveActor.getLast_name());
        ArgumentCaptor<Actor>actorArgumentCaptor = ArgumentCaptor.forClass(Actor.class);
        verify(actorRepository).save(actorArgumentCaptor.capture());
        actorArgumentCaptor.getValue();
        Assertions.assertEquals(expected, actual, "Data hasnt been added");
    }

    @Test
    public void testAddCities(){
        City saveCity = new City ("testcity");
        String expected = "save";
        String actual = sakilaMoviesDbApplication.addCities(saveCity.getCity());
        ArgumentCaptor<City>cityArgumentCaptor = ArgumentCaptor.forClass(City.class);
        verify(cityRepository).save(cityArgumentCaptor.capture());
        cityArgumentCaptor.getValue();
        Assertions.assertEquals(expected, actual, "Data hasnt been added");
    }

    @Test
    public void testAddFilms(){
        Film saveFilm = new Film (1999,  "PG", "filmtitle", 1);
        String expected = "save";
        String actual = sakilaMoviesDbApplication.addFilms(saveFilm.getRelease_year(), saveFilm.getRating(),saveFilm.getTitle(), saveFilm.getLanguage_id());
        ArgumentCaptor<Film>filmArgumentCaptor = ArgumentCaptor.forClass(Film.class);
        verify(filmRepository).save(filmArgumentCaptor.capture());
        filmArgumentCaptor.getValue();
        Assertions.assertEquals(expected, actual, "Data hasnt been added");
    }

    @Test
    public void testGetLanguages(){
        Language lang1 = new Language("Spanish");
        Language lang2 = new Language("German");
        List<Language> languageList = new ArrayList<>();
        languageList.add(lang1);
        languageList.add(lang2);
        when(sakilaMoviesDbApplication.getAllLanguages()).thenReturn(languageList);
        Assertions.assertEquals(languageList, sakilaMoviesDbApplication.getAllLanguages(), "Languages data was not retreived from Language database table.");
    }

    @Test
    public void testGetActors(){
        Actor actor1 = new Actor("testfirstname", "testlastname");
        Actor actor2 = new Actor("testfirstname", "testlastname");
        List<Actor> actorList = new ArrayList<>();
        actorList.add(actor1);
        actorList.add(actor2);
        when(sakilaMoviesDbApplication.getAllActors()).thenReturn(actorList);
        Assertions.assertEquals(actorList, sakilaMoviesDbApplication.getAllActors(), "Actors data was not retreived from Actor database table.");
    }

    @Test
    public void testGetFilms(){
        Film film1 = new Film( 1999,"testrating", "testtitle", 1);
        List<Film> filmList = new ArrayList<>();
        filmList.add(film1);
        when(sakilaMoviesDbApplication.getAllFilms()).thenReturn(filmList);
        Assertions.assertEquals(filmList, sakilaMoviesDbApplication.getAllFilms(), "Actors data was not retreived from Actor database table.");
    }

    @Test
    public void testGetCities(){
        City city1 = new City("testcity");
        List<City> cityList = new ArrayList<>();
        cityList.add(city1);
        when(sakilaMoviesDbApplication.getAllCities()).thenReturn(cityList);
        Assertions.assertEquals(cityList, sakilaMoviesDbApplication.getAllCities(), "Actors data was not retreived from Actor database table.");
    }

    @Test
    public void testGetCategories(){
        Category category1 = new Category("testcategory");
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(category1);
        when(sakilaMoviesDbApplication.getAllCategories()).thenReturn(categoryList);
        Assertions.assertEquals(categoryList, sakilaMoviesDbApplication.getAllCategories(), "Actors data was not retreived from Actor database table.");
    }

    @Test
    public void testGetReviews(){
        Review review1 = new Review(1,"testreview",10.0);
        List<Review> reviewList = new ArrayList<>();
        reviewList.add(review1);
        when(sakilaMoviesDbApplication.getAllReviews()).thenReturn(reviewList);
        Assertions.assertEquals(reviewList, sakilaMoviesDbApplication.getAllReviews(), "Actors data was not retreived from Actor database table.");
    }

}
