package com.main.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main.beans.Jugador;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/main/xml/beans.xml");
		
//		----------------------------- Utilizacion de Interfaces --------------------------------
		
		Jugador j = (Jugador) appContext.getBean("jugador1");
		
		System.out.println(j.getNombre() + " - " + j.getId() + " - " + j.getEquipo().mostrar() + " - " + j.getCamiseta().getNumero()
				+  " - " + j.getCamiseta().getMarca().getNombre());
		
		((ConfigurableApplicationContext)appContext).close();
	}

}
