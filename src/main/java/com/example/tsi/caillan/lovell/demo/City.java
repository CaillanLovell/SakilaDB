package com.example.tsi.caillan.lovell.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class City {

    @Id
    @GeneratedValue
    private int city_id;

    private String city;

    public City(String city){
        this.city=city;
    }

    public City(){

    }

    private int country_id;

    public int getCity_id() {
        return city_id;
    }

    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

}