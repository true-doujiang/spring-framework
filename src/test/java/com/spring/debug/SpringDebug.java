package com.spring.debug;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDebug {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);

		Animal animal = (Animal)ctx.getBean("animal");
		System.out.println(animal.getName());

		Animal bean = ctx.getBean(Animal.class);
		System.out.println("bean = " + bean);

		System.out.println(animal == bean);
//		ctx.close();

	}


}
