package com.anupama.di.literal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentSetterDemo test = context.getBean("studentSet", StudentSetterDemo.class);
		test.displayName();
		
		StudentSetterDemo lax = context.getBean("laxmi", StudentSetterDemo.class);
		lax.displayName();
	}

}
