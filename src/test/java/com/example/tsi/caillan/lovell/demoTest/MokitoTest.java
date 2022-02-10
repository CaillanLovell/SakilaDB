package com.example.tsi.caillan.lovell.demoTest;

import static org.mockito.Mockito.verify;
import com.example.tsi.caillan.lovell.demo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

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
    @BeforeEach
    void Setup(){
        sakilaMoviesDbApplication = new SakilaMoviesDbApplication(languageRepository,
                filmRepository,
                actorRepository,
                categoryRepository,
                cityRepository);
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


}
