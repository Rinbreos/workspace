package com.acme.educationapps;

import java.io.Serializable;

public class Student implements Serializable {
	
	// INSTANCE VARIABLES
	private String firstName;
	private String lastName;
	private int id;
	
	
	// SETTERS/GETTERS
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


	public int getId() {
		return this.id;
	}


	public void setId(int id) {
		this.id = id;
	}
		
	// CONSTRUCTORS
	public Student(String firstName, String lastName, int id){
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	
	// METHODS
	public boolean equals(Student s){
		if(s.id == id){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public String toString(){
		return "Name: " + firstName + " " + lastName + " ID: " + this.id;
	}
	
	

}
