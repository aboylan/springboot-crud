package com.aboylan.curso.springboot.app.springboot_crud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.aboylan.curso.springboot.app.springboot_crud.entities.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

}
