package com.core.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
@
Scope(value="prototype", proxyMode=ScopedProxyMode.TARGET_CLASS)  
public class car implements vehicle {
	
	@Autowired		
	Speed Cspeed;
	
	public void displayName() {
		System.out.println("Car Class");
		Cspeed.speed(85);
	}
}
