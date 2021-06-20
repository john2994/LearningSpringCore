package com.spring.demo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	private String[] fortuneArray={"Today is your lucky day","Today is bad day","Today is normal day"};
	
	@Override
	public String getFortune() {
		Random dice = new Random();
		return fortuneArray[dice.nextInt(3)];
	}

}
