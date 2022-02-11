package com.example.tsi.caillan.lovell.demo;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Language {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int language_id;

    @OneToMany
    @JoinColumn(name ="language_id",insertable = false,updatable = false)
    @JsonIgnore
    private Set<Film> film;

    public Set<Film>getFilm(){
        return film;
    }

    public void setFilm(Set<Film> film) {
        this.film = film;
    }

    private String name;

    public Language(String name){
        this.name=name;
    }

    public Language(){

    }

    public int getLanguage_id() {
        return language_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
