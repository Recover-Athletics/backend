package com.recover.backend.recover.controllers.repos;

import com.recover.backend.recover.controllers.recover_users.models.Users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepo extends JpaRepository<Users, Integer> {

}