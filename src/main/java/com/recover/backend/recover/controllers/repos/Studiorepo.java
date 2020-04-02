package com.recover.backend.recover.controllers.repos;

import com.recover.backend.recover.controllers.recover_studio.models.Studiocomponent;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Studiorepo extends JpaRepository<Studiocomponent, Integer> {

}