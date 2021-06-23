package com.anupama.di.literal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentConstDemo constDemo = context.getBean("constStudent", StudentConstDemo.class);
		constDemo.displayInfo();
	}

}
