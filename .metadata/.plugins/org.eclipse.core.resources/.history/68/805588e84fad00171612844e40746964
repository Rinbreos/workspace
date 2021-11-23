package com.r8me4.weatherapp;

import java.util.Random;

public class WeatherReader {

	private WeatherListener listener;
	private boolean running;
	public static final int UPDATE_INCREMENT = 5000; 
	private int numberOfUpdates = 0;
	
	public int getNumberOfUpdates() {
		return numberOfUpdates;
	}

	public void setListener(WeatherListener listener) {
		this.listener = listener;
	}
	private void doTemperatureReadings(){
		
		while(running){
			// Generate a random number between 30 and 60 
			// that represents the current temperature reading
			Random rand = new Random();
			int temp = rand.nextInt((60 - 30) + 1) + 30;
			
			if(listener != null){
				// notify the listener of the new temp reading
				listener.onUpdate(temp);
				
			}else{
				System.out.println("Nobody is listening for updates!!!");
			}
			// increment the count of updates that have occurred 
			// since 'this' instance of WeatherReader has been turned on
			numberOfUpdates++;
			
			// put the thread to sleep for a while
			// (requires a try/catch block) 
			try {
				Thread.sleep(UPDATE_INCREMENT);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	public void on(){
		running = true;
		doTemperatureReadings();
		
	}

	public void off(){
		running = false;
		numberOfUpdates = 0;
	}
	
	
	
	
	
	
	
	
	
}
