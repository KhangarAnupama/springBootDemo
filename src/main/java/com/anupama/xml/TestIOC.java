package com.anupama.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
	
	public static void oldApproach() {
		Sim sim = new Idea();
		sim.calling();
	}
	
	/**
	 * Using inversion of control, we can create beans
	 * Here, 2 ways to call beans
	 */
	public static void newApproach() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Sim sim = (Sim) context.getBean("idea");
		sim.calling();
		
		sim = context.getBean("voda", Vodaphone.class);
		sim.calling();
		
	}
	
	
	public static void main(String[] args) {
		oldApproach();
		System.out.println("-------------------------------------------");
		newApproach();
	}

}
