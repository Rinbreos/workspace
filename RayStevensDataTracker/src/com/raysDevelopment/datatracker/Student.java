package com.raysDevelopment.datatracker;

import java.util.ArrayList;

public class Student extends Person implements Savable{
	
	private int id;
	private ArrayList<String> classes = new ArrayList<String>();
	
	public void addClass(String c){
		classes.add(c);
	}
	
	@Override
	public String toString(){
		String result = "";
		result += super.toString() + " " +  this.id + " ";
		for(int x= 0; x < classes.size(); x++){
			result += classes.get(x);
		}
		return result;
	}
	
	public boolean save(){
		System.out.println("Save to CSV file on network share .. ");
		System.out.println(this);
		return true;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


}
