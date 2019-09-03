package com.learn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.learn.demo.interfaces.Coach;
import com.learn.demo.interfaces.FortuneService;


@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">>> default constractor TennisCoach");
	}
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">>> inside setFortuneService() method");
		this.fortuneService = fortuneService;
	}*/
	
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice backhand for 30 mins";
	}

	@Override
	public String getGameFortune() {
		return fortuneService.getFortune();
	}
}
