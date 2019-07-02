package com.core.file;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSecond {

public static void main(String n[]) {
		
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(JavaConf.class);
		vehicle veh=(vehicle)ac.getBean("car");
	System.out.println("veh"+veh);
		veh.displayName();
		
		vehicle veh1=(vehicle)ac.getBean("car");
		System.out.println("veh1"+veh1);

		veh1.displayName();
		
	}

}
