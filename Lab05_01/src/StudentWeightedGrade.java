import java.util.Scanner;

public class StudentWeightedGrade {

	public static void main(String[] args) {
	 // explain to user what the program is going to do
		
		System.out.println("Welcome to Student Weighted Grade Program. You will enter the Students name, 2 quiz scores, a midterm score and a final exam score.");
		
		
		//setup the incoming data
		
		StudentGrade sd = new StudentGrade();
		
		sd.readInput();
		sd.gradeCalc();
		sd.writeOutput();
		
		 System.out.println("Would u like to calculate another Student's weighted grade? Enter Y to run again or any other key to quit: ");
	        Scanner scan = new Scanner(System.in);
	        String reRun = scan.next();
	        if(reRun.equalsIgnoreCase("Y")){
			main(null);
			
	        }else{
	        	System.exit(0);
	        }
	        }
	        	
	        


	}
	


