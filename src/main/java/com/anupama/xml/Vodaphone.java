package com.anupama.xml;

public class Vodaphone implements Sim {
	
	public Vodaphone() {
		System.out.println("Vodaphone constructor called");
	}

	@Override
	public void calling() {
		System.out.println("Vodaphone calling");
	}

}
