package com.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.beans.AppConfig;
import com.test.beans.Mundo;

public class App {

	public static void main(String[] args) {

//		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/test/xml/beans.xml");
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		Mundo m = (Mundo) appContext.getBean("mundo");
		
		System.out.println(m.getSaludo());
		
		((ConfigurableApplicationContext)appContext).close();
	}

}
