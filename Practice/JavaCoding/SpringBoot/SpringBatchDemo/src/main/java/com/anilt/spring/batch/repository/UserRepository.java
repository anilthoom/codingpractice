package com.anilt.spring.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anilt.spring.batch.model.User;;

public interface UserRepository extends JpaRepository<User, Integer>{
}
