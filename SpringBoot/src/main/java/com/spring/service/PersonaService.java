package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.repository.IPersonaRepo;

@Service
public class PersonaService implements IPersonaService{

	@Autowired
	private IPersonaRepo repo;
	
	@Override
	public void registar(String nombre) {
		repo.registrar(nombre);
	}
}
