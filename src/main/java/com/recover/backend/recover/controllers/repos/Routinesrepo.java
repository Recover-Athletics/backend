package com.recover.backend.recover.controllers.repos;

import com.recover.backend.recover.controllers.recover_routines.model.Routines;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Routinesrepo extends JpaRepository<Routines, Integer> {

}