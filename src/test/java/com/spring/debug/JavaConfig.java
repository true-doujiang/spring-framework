package com.spring.debug;

import com.spring.debug.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class JavaConfig {

	@Bean
	public Animal animal() {
		Animal animal = new Animal();
		animal.setAddress("上海");
		animal.setAge(new Date());
		animal.setName("上海大妈");
		return animal;
	}

}
