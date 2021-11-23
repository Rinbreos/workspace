import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
			
		int score = 100; 
		char grade = 'A';
		
		System.out.println("Enter your score: ");
		
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		
		if(score >= 90 ){
			grade = 'A';
		}else if(score >= 80){
			grade = 'B';
		}else if(score >= 70){
			grade = 'C';
		}else if(score >= 60){
			grade = 'D';
		}else if(score < 60){
			grade = 'F';
		}else{
			System.out.println("You are out of bounds!");
			main(null);
			System.exit(0);
		}
		scan.close();
		
		System.out.printf("Score = %d \n", score);
		System.out.printf("Grade = %s", grade);
	}

}
