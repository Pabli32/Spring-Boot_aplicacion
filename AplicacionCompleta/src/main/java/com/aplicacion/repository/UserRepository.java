package com.aplicacion.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aplicacion.entity.User;

public class UserRepository extends CrudRepository<User, Long> {
	
	public Optional<User> findByUsername(String username);
}
