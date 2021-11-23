package com.raysDevelopment.datatracker;

import java.util.Date;

public class HelpDeskTicket implements Savable {
	
	private int id;
	private Date date;
	private String description;
	
	@Override
	public String toString(){
		String result = "";
		result += super.toString() + " " + id + " " + " " + date + " " + description; 
		
		return result;
		
	}
	public boolean save(){
		System.out.println("Send Email... ");
		System.out.println(this);
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
