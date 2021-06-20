package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Coach theCoach = context.getBean("FootballCoach", Coach.class);
		Coach secondCoach = context.getBean("FootballCoach", Coach.class);
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		System.out.println("\ntheCoach:  " + theCoach + "\nsecondCoach:  " + secondCoach);
		// close the context
		context.close();
	}

}
