/**
 * 
 */
package com.learn.demo;

import org.springframework.stereotype.Component;

import com.learn.demo.interfaces.FortuneService;

/**
 * @author skj000b
 *
 */
@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "It's happy fortune today for you";
	}

}
