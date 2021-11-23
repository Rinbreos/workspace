import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		// This program is a Rock Paper Scissors game
		
		// tracks wins, losses, and ties
		
	    //int wins = 0;
	    //int lose = 0;
	    //int ties = 0;
		
			
		// Announce the game and what is needs to be done
		
		String greeting = "This is Rock, Paper, Scissors you will have to put in the first intial for what you want to play.";
		System.out.println(greeting);
		String playInst = "Type in R for Rock, P for Paper or S for Scissors.";
		System.out.println(playInst);
		Scanner input = new Scanner(System.in);	
		
		String user1 = "User 1 Please enter your choice of play.";
		System.out.println(user1);
		String input1 = input.next();
		System.out.println("User 1 played: " + input1);
		
		String user2 = "User 2 Please enter your choice of play.";
		System.out.println(user2);
		String input2 = input.next();
		System.out.println("User 2 played: " + input2);
		
		
		// you will want to implement an ignore case prior to checking the input
		// == not just = for strings
		if(input1.equalsIgnoreCase(input2)){
			System.out.println("Both of you are tied!");
		}else if(input1.equalsIgnoreCase("r") && input2.equalsIgnoreCase("s")){
			System.out.println("Rock breaks Scissors, User 1 has won!");
		}else if(input1.equalsIgnoreCase("r") && input2.equalsIgnoreCase("p")){
			System.out.println("Paper covers Rock, User 2 has won!");
		}else if(input1.equalsIgnoreCase("s") && input2.equalsIgnoreCase("p")){
			System.out.println("Scissors cuts Paper, User 1 has won!");
		}else if(input1.equalsIgnoreCase("s") && input2.equalsIgnoreCase("r")){
			System.out.println("Rock breaks Scissors, User 2 has won!");
		}else if(input1.equalsIgnoreCase("p") && input2.equalsIgnoreCase("r")){
			System.out.println("Paper covers Rock, User 1 has won!");
		}else if(input1.equalsIgnoreCase("p") && input2.equalsIgnoreCase("s")){
			System.out.println("Scissors cuts Paper, User 2 has won!");
		}else{
			System.out.println("What the heck!");
			main(null);
			System.exit(0);
		}
		
		input.close();		
		

	}

}
