package com.main.beans;

import org.springframework.stereotype.Component;

import com.main.interfaces.IEquipo;

@Component
public class Juventus implements IEquipo {

	public String mostrar() {
		return "Juventus";
	}

}
