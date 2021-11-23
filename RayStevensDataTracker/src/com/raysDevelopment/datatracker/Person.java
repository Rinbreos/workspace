package com.raysDevelopment.datatracker;

public class Person {

	private String firstName;
	private String lastName;
	

	public String toString(){
		
		return this.getClass()+ "-" + firstName + " " + lastName;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
