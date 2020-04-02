package com.recover.backend.recover.controllers.repos;

import com.recover.backend.recover.controllers.recover_exercises.models.Exercises;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Exercisesrepo extends JpaRepository<Exercises, Integer> {

}