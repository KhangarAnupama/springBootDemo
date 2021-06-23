package com.anupama.di.literal;

public class StudentConstDemo {
	
	private int id;
	private String nameStudent;
	
	public StudentConstDemo(int id, String nameStudent) {
		this.id =id;
		this.nameStudent = nameStudent;
	}
	

	public void displayInfo() {
		System.out.println("Id is ="+id+" Name is ="+nameStudent);
	}
}
