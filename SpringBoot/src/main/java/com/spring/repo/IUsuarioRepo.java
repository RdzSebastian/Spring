package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Usuario;

public interface IUsuarioRepo  extends JpaRepository<Usuario, Integer>{
	
	Usuario findByNombre(String nombre);
}
