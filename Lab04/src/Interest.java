import java.util.Scanner;

public class Interest {
	
	//public static final double INTEREST_RATE = 0.05;

	public static void main(String[] args) {
		// This program is to calculate the interest earned in the amount of years and amount specified by the user
		
		
		System.out.println("Welcome this program will help you determine how much interest you will accumulate "
				+ " over the amount of years you want to know.");
		System.out.println("Please enter the amount of years of your investment: ");
		Scanner s = new Scanner(System.in);
		int timeInvest = s.nextInt();
		System.out.println("Enter starting investment amount: ");
		int startAmt = s.nextInt();
		System.out.println("Enter the interest rate: ");
		double intRate = s.nextInt();
		System.out.println("You have entered "+ intRate+ " as the interest rate.");
		
		System.out.println("You have chosen " + timeInvest + " years " + intRate+"% and $"+startAmt + " to calculate.");
		//my variables 
		int years = 0;
		double totInvest = startAmt;
		int cMon = 0;
		int months = timeInvest * 12;
		int cDays = 0;
		int days = timeInvest * 365;
		
		//yearly interest method
		while(years < timeInvest){
			 years++; 
			 double newInvest = startAmt * intRate/100;
			 totInvest += newInvest;				 
		}
		 System.out.printf("Your new yearly investment amount is: $%.2f \n", totInvest);
		 totInvest = startAmt;
		//monthly interest method
		while(cMon < months){
			cMon++;
			double newInvest = totInvest * ((intRate/100)/12);
			totInvest += newInvest;
		}
		 System.out.printf("Your new monthly investment amount is: $%.2f \n", totInvest);
		 totInvest = startAmt;
		//daily interest method
		while(cDays < days){
			cDays++;
			double newInvest = totInvest * ((intRate/100)/365);
			totInvest += newInvest;
		}
		 System.out.printf("Your new daily investment amount is $%.2f", totInvest);
		 //System.out.printf("Your new yearly investment amount is: $%.2f \n", totInvest);
		 //System.out.printf("Your new monthly investment amount is: $%.2f \n", totInvest);
		 //System.out.printf("Your new daily amount is $%.2f", totInvest);
/*		 int months = timeInvest * 12;
		 int newTiInvest = months;
		 double montInvest = startAmt;
		 for(i = 0; i < timeInvest; i++){
			 
			 double newInvest = startAmt * i;
			 montInvest += newInvest;
			 
			 System.out.printf("Your new monthly investment amount is: $%.2f \n", montInvest);
			} 
*/		 
	}

}
