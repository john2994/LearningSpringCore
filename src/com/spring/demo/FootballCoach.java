package com.spring.demo;

import java.util.Iterator;

public class FootballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("FootaballCoach class: setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	public FootballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public FootballCoach() {
		System.out.println("FootaballCoach class: no arg const");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Hit the ball";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
