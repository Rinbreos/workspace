
public class FormatTime {
				private int minutes = 0;
				private int seconds = 0;
				private String time;
				
	
		 
		public String formatTime(int seconds){
			int min = seconds/60;
			 seconds = seconds%60;
			 return time;
			
		}
		public String formatTime(int minutes, int seconds){
			int addMin = seconds/60;
			seconds = seconds%60;
			minutes = minutes + addMin;
			return time;
		}
		
		
		public  String time(){
			String time = minutes +":";
			if(seconds <10){
				time += "0" + seconds;
			}
			else{
				time += seconds;
			}
			
			return time;
		}

	}


