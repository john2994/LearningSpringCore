package com.spring.demo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
	}

	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}
	//Add an init method
	public void doMyStartupStaff() {
		System.out.println("TrackCoach: inside method doMyStartupStaff");
	}
	
	//Add a destroy method
	public void doMyCleanupStaff() {
		System.out.println("TrackCoach: inside method doMyCleanupStaff");
	}
}
