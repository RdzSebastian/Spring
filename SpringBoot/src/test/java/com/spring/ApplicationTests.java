package com.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.spring.model.Usuario;
import com.spring.repo.IUsuarioRepo;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private IUsuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	void crearUsuarioTest() {
		Usuario us = new Usuario();
		us.setId(2);
		us.setNombre("pity");
		us.setClave(encoder.encode("123"));
		Usuario usRetorno = repo.save(us);
		assertEquals(usRetorno.getClave(), us.getClave());
	}

}
