package com.example.tsi.caillan.lovell.demo;

import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<Actor, Integer> {

    void delete(Actor actor);
}
