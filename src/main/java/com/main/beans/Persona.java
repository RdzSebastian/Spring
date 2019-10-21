package com.main.beans;

public class Persona {

	int id;
	String nombre;
	String apellido;
	Pais pais;
	
	private void init() {
		System.out.println("Antes de iniciar el bean");
	}
	
	private void destroy() {
		System.out.println("Antes de destruir el bean");
		
	}
	
	public Persona(int id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Persona(int id, String nombre, String apellido, Pais pais) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pais = pais;
	}
	
	public Persona() {
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
}
