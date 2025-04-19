package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {

		// 1 Launch a Spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		// 2 configure things that we want spring to manage - @Configuration
//		System.out.println(context.getBean("name"));
//		
//		System.out.println(context.getBean("MyName"));

//		System.out.println(context.getBean("person"));

		// Calling Bean by Type
//		System.out.println(context.getBean(Address.class));

//		System.out.println(context.getBean("person2ByMethodCall"));

		System.out.println(context.getBean("person3ByParameters"));
	}

}
