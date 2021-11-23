package com.acme.educationapps;

import java.util.ArrayList;





public class MySchool extends School {
	
	public static final String STUDENT_FILE = "student.dat";
	public static int MAX_STUDENTS = 4;

	@Override
	public void saveStudentData(){
		FileManager fm = new FileManager();
		fm.saveObject(STUDENT_FILE, super.students);
	}
	
	@Override
	public void loadStudentData(){
		FileManager fm = new FileManager();
		ArrayList<Object> objects = fm.deserializeObjects(STUDENT_FILE);

	}
	
	@Override
	public boolean enrollStudent(Student student) {
		
			if(MAX_STUDENTS > students.size()){
				super.enrollStudent(student);
				return true;
			}else{
				System.out.println("You have reached the max amount of students for this school");
				return false;
				
			}
				
	}

}