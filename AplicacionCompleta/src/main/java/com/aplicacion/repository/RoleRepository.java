package com.aplicacion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aplicacion.entity.Role;

@Repository
public class RoleRepository extends CrudRepository<Role, Long>{
	
	public Role findByName(String role);
}
