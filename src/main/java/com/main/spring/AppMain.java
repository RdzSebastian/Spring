package com.main.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.main.beans.Barcelona;
import com.main.beans.Jugador;

public class AppMain {

	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

//		----------------------------- Utilizacion de Interfaces --------------------------------
		
		Jugador j = (Jugador) appContext.getBean("jugador1");
		
		j.setNombre("messi");
		j.setEquipo(new Barcelona());
		
		System.out.println(j.getNombre() + " - " + j.getId() + " - " + j.getEquipo().mostrar() + " - " + j.getCamiseta().getNumero()
				+  " - " + j.getCamiseta().getMarca().getNombre());
		
		((ConfigurableApplicationContext)appContext).close();
	}

}
