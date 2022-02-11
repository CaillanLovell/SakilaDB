package com.example.tsi.caillan.lovell.demo;

import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
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
	private String deleted = "deleted";

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

	@DeleteMapping ("/removeLanguages/{language_id}")
	public Map <String, Boolean> deleteLanguage (@PathVariable(value = "language_id") int language_id)
			throws ResourceNotFoundException {
		Language language = languageRepository.findById(language_id).orElseThrow(() ->new ResourceNotFoundException("Language not found"));
		languageRepository.delete(language);
		Map<String,Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
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

//	@DeleteMapping ("/removeActors/{actor_id}")
//	public Map <String, Boolean> deleteActor (@PathVariable(value = "actor_id") int actor_id)
//	throws ResourceNotFoundException {
//		Actor actor = actorRepository.findById(actor_id).orElseThrow(() ->new ResourceNotFoundException("Actor not found"));
//		actorRepository.delete(actor);
//		Map<String,Boolean> response = new HashMap<>();
//		response.put("deleted", Boolean.TRUE);
//		return response;
//	}

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

//	@DeleteMapping ("/removeFilms/{film_id}")
//	public Map <String, Boolean> deleteFilm (@PathVariable(value = "film_id") int film_id)
//			throws ResourceNotFoundException {
//		Film film = filmRepository.findById(film_id).orElseThrow(() ->new ResourceNotFoundException("Film not found"));
//		filmRepository.delete(film);
//		Map<String,Boolean> response = new HashMap<>();
//		response.put("deleted", Boolean.TRUE);
//		return response;
//	}

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