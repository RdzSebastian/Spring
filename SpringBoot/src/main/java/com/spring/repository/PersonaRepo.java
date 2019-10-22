package com.spring.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.spring.Application;

@Repository
public class PersonaRepo implements IPersonaRepo{

	private static Logger LOG = LoggerFactory.getLogger(Application.class);

	@Override
	public void registrar(String nombre) {
		LOG.info("Se registro a " + nombre);
		
	}

}
