import java.util.Scanner;

public class StudentGrade {
	
	// variables for the Student Grades
	
	private String name;
	private double quiz1;
	private double quiz2;
	private double midTerm;
	private double finalExam;
	public static final double QUIZ_TOTAL = 20;
	public static final double MIDTERM_TOTAL = 100;
	public static final double FINALEXAM_TOTAL = 100;
	public static final double QUIZ_WEIGHTED = .25;
	public static final double MIDTERM_WEIGHTED = .25;
	public static final double FINALEXAM_WEIGHTED = .5;
	public double overallTot;
	public String letterGrade;
	public String reRun;
	
	
		
	// calculate the weighted grades as a double
	
	public void gradeCalc(){
		
		
		double quizTot = ((getQuiz1() + getQuiz2())/ QUIZ_TOTAL)*QUIZ_WEIGHTED;
		System.out.println("Your total weighted Quiz score is: " + quizTot);
		double midTermTot= (getMidTerm()/MIDTERM_TOTAL)*MIDTERM_WEIGHTED;
		System.out.println("Your Midterm weighted score is: " + midTermTot);
		double finalExamTot = (getFinalExam()/FINALEXAM_TOTAL)*FINALEXAM_WEIGHTED;
		System.out.println("Your Final Exam weighted score is: " + finalExamTot);
		this.overallTot = quizTot + midTermTot + finalExamTot;
		System.out.println("Your Overall Weighted score is: " + overallTot);
		this.letterGrade();
		
	}
		
	//assign the grade a letter
	
	public void letterGrade(){
			
		if(overallTot >= .90 ){
			this.letterGrade = "A";
		}else if(overallTot >= .80){
			this.letterGrade = "B";
		}else if(overallTot >= .70){
			this.letterGrade = "C";
		}else if(overallTot >= .60){
			this.letterGrade = "D";
		}else if(overallTot < .60){
			this.letterGrade = "F";
		}else{
			System.out.println("What the heck!");
			//main(null);
			System.exit(0);}
		}
	
	// show the calculation of the output to the user
	
	public void writeOutput(){

		String msg = toString();
		System.out.println(msg);
	}
	public String toString(){
		String msg = "Name: " + name;
		msg += "\nWeighted Grade is: " + overallTot;
		msg += "\nLetter grade is: " + letterGrade;
		
		return msg;
	}
	
	public void readInput(){
			// get user input
			
			Scanner s = new Scanner(System.in);
			System.out.println("Please enter your Student's Name: ");
			this.name = s.nextLine();
			System.out.println("Please enter Quiz 1's possible score 0 to 10: ");
			this.quiz1 = s.nextDouble();
			if(quiz1 >= 0 && quiz1 <= 10){
				
			}else{
				System.out.println("Please valid score between 0 and 10.");
				this.quiz1 = s.nextDouble();
			}
			
			System.out.println("Please enter Quiz 2's possible score 0 and 10: ");
			this.quiz2 = s.nextDouble();
			if(quiz2 >= 0 && quiz2 <= 10){
				
			}else{
				System.out.println("Please valid score between 0 and 10.");
				this.quiz2 = s.nextDouble();
			}
			System.out.println("Please enter the Midterm's possible score between 0 and 100: ");
			this.midTerm = s.nextDouble();
			if(midTerm >= 0 && midTerm<= 100){
				
			}else{
				System.out.println("Please valid score between 0 and 100.");
				this.midTerm = s.nextDouble();
			}
			System.out.println("Please enter the Final Exam's possible score 0 to 100: ");
			this.finalExam = s.nextDouble();
			if(finalExam >= 0 && finalExam<= 100){
				
			}else{
				System.out.println("Please valid score between 0 and 100.");
				this.finalExam = s.nextDouble();
			}
			
			
		}

	public String getName() {
			return name;
		}

	public void setName(String name) {
			this.name = name;
		}

	public double getQuiz1() {
			return quiz1;
		}

	public void setQuiz1(double quiz1) {
			this.quiz1 = quiz1;
		}

	public double getQuiz2() {
			return quiz2;
		}

	public void setQuiz2(double quiz2) {
			this.quiz2 = quiz2;
		}

	public double getMidTerm() {
			return midTerm;
		}

	public void setMidTerm(double midTerm) {
			this.midTerm = midTerm;
		}

	public double getFinalExam() {
			return finalExam;
		}

	public void setFinalExam(double finalExam) {
			this.finalExam = finalExam;
		}
		
//	public void reRun(){
//		
//		System.out.println("Would you like to calculate another Student again? Enter Y to play or any other key to quit: ");
//	    String this.reRun = s.nextLine();
//	      if(this.reRun == "Y" || this.reRun == "y"){
//	            continue;
//	        }else{
//	        	break;
//	        }
//		
//	public boolean reRun(){
//        System.out.println("Would u like to calculate another Student's weighted grade? Enter Y to play or any other key to quit: ");
//        Scanner scanner = new Scanner(System.in);
//        if(this.reRun == "Y" || this.reRun == "y"){
//            this.reRun = true;
//        }else{
//        	break;
//        }
     //   boolean response = scanner.nextBoolean();

       // return response;
    }
	
	


