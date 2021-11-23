package com.raysDevelopment.datatracker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AppDriver {
	

	public static void main(String[] args) {
		
		Person Joe = new Person();
		Student Bill = new Student();
		Employee Theodore = new Employee();
		HelpDeskTicket badHardDrive = new HelpDeskTicket();
	
		
		
		
		Joe.setFirstName("Joe");
		Joe.setLastName("Smith");
		System.out.println(Joe.toString());
		Bill.setFirstName("Bill");
		Bill.setLastName("Preston");
		Bill.setId(1);
		Bill.addClass("music");
		System.out.println(Bill.toString());
		Theodore.setFirstName("Theodore");
		Theodore.setLastName("Esquire");
		Theodore.setId(2);
		Theodore.setDepartment("guitar");
		System.out.println(Theodore.toString());
		badHardDrive.setId(3);
		Date date = new Date();
		badHardDrive.setDate(date);
		badHardDrive.setDescription("needs a new hard drive");
		System.out.println(badHardDrive.toString());
		
		ArrayList<Savable> wildStallions = new ArrayList<Savable>();
		wildStallions.add(Bill);
		wildStallions.add(Theodore);
		wildStallions.add(badHardDrive);
		for(Savable drums : wildStallions){
			System.out.println(drums.save());
		}
		
		
		
		

	}

}
