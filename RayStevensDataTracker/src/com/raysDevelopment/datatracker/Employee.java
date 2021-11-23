package com.raysDevelopment.datatracker;

public class Employee extends Person implements Savable {
	
	private int id;
	private String department;
	
	@Override
	public String toString(){
		String result = "";
		result += super.toString() + " " + this.id + " " + this.department ;
			
		return result;
	}
	public boolean save(){
		System.out.println("Save to database... ");
		System.out.println(this);
		return true;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

}
