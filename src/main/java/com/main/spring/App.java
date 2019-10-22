package com.main.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main.beans.Jugador;
import com.main.beans.Mundo;
import com.main.beans.Persona;
import com.main.interfaces.IEquipo;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/main/xml/beans.xml");
		
//		----------------------------- Utilizacion de Interfaces --------------------------------
		
		Jugador j = (Jugador) appContext.getBean("messi");
		System.out.println(j.getNombre() + " - " + j.getNumero() + " - " + j.getEquipo().mostrar());
		
//		IEquipo e = (IEquipo) appContext.getBean("barcelona");
//		System.out.println(e.mostrar());
//
//		e = (IEquipo) appContext.getBean("juventus");
//		System.out.println(e.mostrar());
		
		((ConfigurableApplicationContext)appContext).close();
	}

}
