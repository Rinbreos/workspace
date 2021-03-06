package com.r8me4.weatherapp;

public class AppDriver {

	public static void main(String[] args) {
		
		 final int MAX_UPDATE = 5;
		 
		 WeatherReader wr = new WeatherReader();
		
		 class weatherread extends WeatherReader implements WeatherListener{
			 @Override 
			 public void onUpdate(int temp){
				 System.out.println("The temp is " +  temp);
				 if(wr.getNumberOfUpdates()>= MAX_UPDATE){
					 wr.off();
					 System.out.println("The weather reader has been turned off!");
				 }
				
			 }
			 
		 }
		 wr.setListener(new weatherread(){

		 });
		 wr.on();
	}

}
