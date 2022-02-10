package com.example.tsi.caillan.lovell.demo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "film")
public class Film {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int film_id;

    private String title;

    private int release_year;

    private String rating;

    private int language_id;

    public Film(int release_year, String rating, String title, int language_id){
        this.title=title;
        this.release_year = release_year;
        this.rating = rating;
        this.language_id = language_id;
    }

    public Film(){

    }

    @ManyToOne
    @JoinColumn (name = "language_id", insertable = false, updatable = false)
    private Language language;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "film_actor",
            joinColumns = {
                    @JoinColumn(name = "film_id", referencedColumnName = "film_id",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "actor_id", referencedColumnName = "actor_id",
                            nullable = false, updatable = false)})

    private Set<Actor> actor = new HashSet<>();


    public Set<Actor> getActor() {
        return actor;
    }

    public void setActors(Set<Actor> actors) {
        this.actor = actors;
    }

    public int getFilm_id() {
        return film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }
}