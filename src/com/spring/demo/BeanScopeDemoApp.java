package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// Load Spring configuration files
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// Retrieve beans from Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		// Check if they are the same
		boolean result = (theCoach == alphaCoach);

		// Print results
		System.out.println("\nPointing on the same object?: " + result);

		// Close context
		context.close();
	}

}
