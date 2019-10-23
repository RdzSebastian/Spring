package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Persona;

public interface IPersonaRepo  extends JpaRepository<Persona, Integer>{
	
}
