package com.core.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Cspeed")
public class CarSpeed implements Speed {
	
	
	public void speed(int speed) {
		
		System.out.println("Car Speed is "+ speed);		
	
		
	}

}
