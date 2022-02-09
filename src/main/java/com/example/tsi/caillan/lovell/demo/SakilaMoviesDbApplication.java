package com.example.tsi.caillan.lovell.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;
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
	@Autowired
	private CategoryRepository categoryRepository;

	public SakilaMoviesDbApplication(LanguageRepository languageRepository, ActorRepository actorRepository,
									 CityRepository cityRepository, FilmRepository filmRepository,
									 CategoryRepository categoryRepository){
		this.languageRepository= languageRepository;
		this.actorRepository = actorRepository;
		this.cityRepository=cityRepository;
		this.filmRepository = filmRepository;
		this.categoryRepository = categoryRepository;
	}

	public static void main(String[] args){

		SpringApplication.run(SakilaMoviesDbApplication.class, args);
	}

	@PostMapping("/Languages")
	Language createLanguage(@Validated @RequestBody Language newLanguage) {
		return languageRepository.save(newLanguage);
	}

	@GetMapping("/Languages")
	public @ResponseBody
	Iterable<Language> getAllLanguages(){
		return languageRepository.findAll();
	}

	@GetMapping("/Actors")
	public @ResponseBody
	Iterable<Actor> getAllActors(){
		return actorRepository.findAll();
	}

	@PostMapping("/Actors")
	Actor createActor(@Validated @RequestBody Actor newActor) {
		return actorRepository.save(newActor);
	}

	@GetMapping("/Cities")
	public @ResponseBody
	Iterable<City> getAllCities(){
		return cityRepository.findAll();
	}

	@PostMapping("/Cities")
	City createCity(@Validated @RequestBody City newCity) {
		return cityRepository.save(newCity);
	}

	@GetMapping("/Films")
	public @ResponseBody
	Iterable<Film> getAllFilms(){
		return filmRepository.findAll();
	}

	@PostMapping("/Films")
	Film createFilm(@Validated @RequestBody Film newFilm) {
		return filmRepository.save(newFilm);
	}

	@GetMapping("/Categories")
	public @ResponseBody
	Iterable<Category> getAllCategories(){
		return categoryRepository.findAll();
	}

	@PostMapping("/Categories")
	Category createCategory(@Validated @RequestBody Category newCategory) {
		return categoryRepository.save(newCategory);
	}
}