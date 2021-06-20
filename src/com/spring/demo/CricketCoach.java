package com.spring.demo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	//Setter for emailAddress
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	//Getter for emailAddress
	public String getEmailAddress() {
		return emailAddress;
	}
	
	//Setter for team
	public void setTeam(String team) {
		this.team = team;
	}
	//Getter for team
	public String getTeam() {
		return team;
	}
	
	//No args constractor
	public CricketCoach() {
		System.out.println("CricketCoach class: no arg const");
	}
	//Setter for FortuneService
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach class: setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
