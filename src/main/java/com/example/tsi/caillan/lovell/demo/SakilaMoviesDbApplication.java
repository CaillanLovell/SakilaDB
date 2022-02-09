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
	private String save = "save";

	public SakilaMoviesDbApplication() {
		this.languageRepository = languageRepository;
		this.actorRepository = actorRepository;
		this.cityRepository = cityRepository;
		this.filmRepository = filmRepository;
		this.categoryRepository = categoryRepository;
	}
	public static void main(String[] args) {
		SpringApplication.run(SakilaMoviesDbApplication.class, args);
	}

	@PostMapping("/addLanguages")
	public @ResponseBody
	String addLanguage(@RequestParam String name) {
		Language addLanguage = new Language(name);
		languageRepository.save(addLanguage);
		return save;
	}

	@GetMapping("/Languages")
	public @ResponseBody
	Iterable<Language> getAllLanguages() {
		return languageRepository.findAll();
	}

	@GetMapping("/Actors")
	public @ResponseBody
	Iterable<Actor> getAllActors() {
		return actorRepository.findAll();
	}

	@PostMapping("/Actors")
	Actor createActor(@Validated @RequestBody Actor newActor) {
		return actorRepository.save(newActor);
	}

	@GetMapping("/Cities")
	public @ResponseBody
	Iterable<City> getAllCities() {
		return cityRepository.findAll();
	}

	@PostMapping("/addCities")
	public @ResponseBody
	String addCities(@RequestParam String name) {
		City addCity = new City(name);
		cityRepository.save(addCity);
		return save;
	}

	@GetMapping("/Films")
	public @ResponseBody
	Iterable<Film> getAllFilms() {
		return filmRepository.findAll();
	}

	@PostMapping("/Films")
	Film createFilm(@Validated @RequestBody Film newFilm) {
		return filmRepository.save(newFilm);
	}

	@PostMapping("/addCategories")
	public @ResponseBody
	String addCategory(@RequestParam String name) {
		Category addCategory = new Category(name);
		categoryRepository.save(addCategory);
		return save;
	}
//	Category createCategory(@Validated @RequestBody Category newCategory) {
//		return categoryRepository.save(newCategory);
//}

	@GetMapping("/Categories")
	public @ResponseBody
	Iterable<Category> getAllCategories(){
		return categoryRepository.findAll();
	}

}