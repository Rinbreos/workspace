package com.acme.educationapps;

import java.util.ArrayList;



public class Course {
	
	private String name;
	private int number;
	private Departments department;
	private ArrayList<Student> students = new ArrayList<Student>();	
	
	
	public Course(String name, int number, Departments department){
		this.name = name;
		this.number = number;
		this.department = department;
	}
	
	
	public boolean registerStudent(Student student){
		
		for(Student s : this.students){
			if(s.equals(student)){
				System.out.println("The student is already registered for this course");
				return false;
			}
		}
		
		this.students.add(student);
		return true;
		
	}
	
	@Override
	public String toString(){
		String str = "Name: " + this.name + " " + this.number + "\n";
		str += "REGISTERED STUDENTS:\n";
		
		for(Student s : this.students){
			str += s.toString() + "\n";
		}
		
		return str;
		
	}
	
	

}
