package com.example.tsi.caillan.lovell.demoTest;

import com.example.tsi.caillan.lovell.demo.LanguageRepository;
import com.example.tsi.caillan.lovell.demo.SakilaMoviesDbApplication;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MokitoTest {
    private SakilaMoviesDbApplication sakilaMoviesDbApplication;
    @Mock
    private LanguageRepository languageRepository;
}
