/**
 * 
 */
package com.learn.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.learn.demo.interfaces.FortuneService;

/**
 * @author skj000b
 *
 */
@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "It's lucky day today";
	}

}
