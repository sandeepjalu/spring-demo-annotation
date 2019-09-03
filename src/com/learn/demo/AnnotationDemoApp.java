/**
 * 
 */
package com.learn.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.demo.interfaces.Coach;

/**
 * @author skj000b
 *
 */
public class AnnotationDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getGameFortune());
		
		context.close();
		
	}

}
