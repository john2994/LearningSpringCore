package com.spring.demo;

public class BaseballCoach implements Coach {

	// Define private field
	private FortuneService fortuneService;

	// Define constructor for dependency injection
	public BaseballCoach(FortuneService thefortuneService) {
		this.fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// Use FortuneService
		return fortuneService.getFortune();
	}
}
