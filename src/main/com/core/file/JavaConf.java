package com.core.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.core.file")
public class JavaConf {
	
	@Bean(name="car")
	public vehicle getCar() {
		return new Bike();
	}

}
