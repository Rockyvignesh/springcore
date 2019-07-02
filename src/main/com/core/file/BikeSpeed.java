package com.core.file;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component("Bspeed")
public class BikeSpeed implements Speed {

	
	public void speed(int speed) {
System.out.println("Bike Speed is "+ speed);		
	}

}
