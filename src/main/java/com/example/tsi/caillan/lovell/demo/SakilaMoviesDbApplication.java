package com.example.tsi.caillan.lovell.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/Home")
public class SakilaMoviesDbApplication {

	@Autowired
	private LanguageRepository languageRepository;
	@Autowired
	private ActorRepository actorRepository;
	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private FilmRepository filmRepository;

	public SakilaMoviesDbApplication(LanguageRepository languageRepository, ActorRepository actorRepository,
									 CityRepository cityRepository, FilmRepository filmRepository){
		this.languageRepository= languageRepository;
		this.actorRepository = actorRepository;
		this.cityRepository=cityRepository;
		this.filmRepository = filmRepository;
	}

	public static void main(String[] args){

		SpringApplication.run(SakilaMoviesDbApplication.class, args);
	}

	@GetMapping("/AllLanguages")
	public @ResponseBody
	Iterable<Language> getAllLanguages(){
		return languageRepository.findAll();
	}

	@GetMapping("/AllActors")
	public @ResponseBody
	Iterable<Actor> getAllActors(){
		return actorRepository.findAll();
	}

	@GetMapping("/AllCities")
	public @ResponseBody
	Iterable<City> getAllCities(){
		return cityRepository.findAll();
	}

	@GetMapping("/AllFilms")
	public @ResponseBody
	Iterable<Film> getAllFilms(){
		return filmRepository.findAll();
	}
}