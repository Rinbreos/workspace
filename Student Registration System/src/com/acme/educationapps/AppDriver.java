package com.acme.educationapps;

public class AppDriver {

	public static void main(String[] args) {
		
		// Create a school
		MySchool school = new MySchool();
		
		
		// Create some courses and add them to the school
		Course history = new Course("U.S. History", 101, Departments.HISTORY);
		Course accounting = new Course("Accounting", 101, Departments.BUSINESS);// Notice that the third parameter in the Course() constructor is an ENUM
		school.addCourse(history);
		school.addCourse(accounting);
		
		
		// Enroll some students in the school
		school.enrollStudent(new Student("Bob", "Smith", 1001));
		school.enrollStudent(new Student("Sally", "Jones", 1002));
		school.enrollStudent(new Student("Paul", "Johnson", 1003));
		school.enrollStudent(new Student("Keith", "Oreilly", 1004));
		school.enrollStudent(new Student("Ray", "Stevens", 1005));
		
		// Register some of the students into the history course
		history.registerStudent(school.getStudentById(1001));
		history.registerStudent(school.getStudentById(1002));
		
		// Register some students for the accounting course
		accounting.registerStudent(school.getStudentById(1003));
		accounting.registerStudent(school.getStudentById(1004));
		
		// Dump out the state of our school
		System.out.println(school);
		
		school.saveStudentData();
		school.loadStudentData();
	}
	
	

}
