package com.core.file;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class main {

	public static void main(String n[]) {
		
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
		vehicle veh=(vehicle)ac.getBean("car");
		veh.displayName();
		
		HelloWorld hw=(HelloWorld)ac.getBean("HelloWorld");
		hw.setMessage("Hiiiiiiiiii");
	System.out.println(hw.getMessage());
	HelloWorld hw1=(HelloWorld)ac.getBean("HelloWorld");
	//hw.setMessage("Hiiiiiiiiii");
System.out.println(hw1.getMessage());
	}

}
