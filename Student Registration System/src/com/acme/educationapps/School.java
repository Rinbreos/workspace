package com.acme.educationapps;

import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;


abstract class School {
	
	public abstract void saveStudentData();
	
	public abstract void loadStudentData();
	
	private ArrayList<Course> courses = new ArrayList<Course>();
	protected ArrayList<Student> students = new ArrayList<Student>();
	
	
	
	public void addCourse(Course course){
		this.courses.add(course);
	}
		
	public boolean enrollStudent(Student student){
		for(Student s : this.students){
			if(student.equals(s)){
				System.out.println("There is already a student with that ID in the system.");
				return false;
			}
		}
		
		this.getStudents().add(student);
		return true;
			
	}
	

	
	public ArrayList<Student> getStudents() {
		// TODO Auto-generated method stub
		    	
	   return students;
		
	}
	public Student getStudentById(int id){
		for(Student s : this.students){
			if(s.getId() == id){
				return s;
			}
		}
		return null;
	}
	
	public int getNumberOfEnrolledStudents(){
		return this.students.size();
	}
	
	@Override
	public String toString(){
		
		String str = "STUDENTS:\n";
		for(Student s : this.students){
			str += s.toString() + "\n";
		}
		
		str += "\nCOURSES:\n";
		for(Course c : this.courses){
			str += c.toString() + "\n";
		}
		
		return str;
	}
	
}
