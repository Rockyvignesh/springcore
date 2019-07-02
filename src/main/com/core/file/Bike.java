package com.core.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.*;

@Component
public class Bike implements vehicle {
	
	  
	
	@Autowired
	Speed Bspeed;
	
	public Bike() {
		 
	}
	 @PostConstruct
	    private void postConstruct() {
		 Bspeed.speed(60);	
	    }
	 
	 public void displayName() {
		System.out.println("Bikeee");	
		
	}
	

}
