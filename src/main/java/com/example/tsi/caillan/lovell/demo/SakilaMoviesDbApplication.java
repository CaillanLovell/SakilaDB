package com.example.tsi.caillan.lovell.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

	public SakilaMoviesDbApplication(LanguageRepository languageRepository,
									 FilmRepository filmRepository,
									 ActorRepository actorRepository,
									 CategoryRepository categoryRepository,
									 CityRepository cityRepository) {
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

	@GetMapping("/findActors/{actor_id}")
	public @ResponseBody
	Optional<Actor> getActorByID(@PathVariable int actor_id){

		return actorRepository.findById(actor_id);
	}

	@PostMapping("/addActors")
	public @ResponseBody
	String addActor(@RequestParam String first_name, String last_name){
		Actor addActor = new Actor(first_name,last_name);
		actorRepository.save(addActor);
		return save;
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

	@PostMapping("/addFilms")
	public @ResponseBody
	String addFilms(@RequestParam int release_year, String rating, String title, int language_id){
		Film addFilms = new Film(release_year, rating, title, language_id);
		filmRepository.save(addFilms);
		return save;
	}

	@PostMapping("/addCategories")
	public @ResponseBody
	String addCategory(@RequestParam String name) {
		Category addCategory = new Category(name);
		categoryRepository.save(addCategory);
		return save;
	}


	@GetMapping("/Categories")
	public @ResponseBody
	Iterable<Category> getAllCategories(){
		return categoryRepository.findAll();
	}

}