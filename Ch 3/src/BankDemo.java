
public class BankDemo {
	
	public static final double OVERDRAW_FEE = 10;
	
	public static void main(String[] args) {
		// Write an if statement
		
		double balance = 100;
		double checkAmt = 150;
		
		System.out.println("Your starting balance is $" + balance);
		System.out.println("You wrote a check for $" + checkAmt);
		
		balance -= checkAmt;
		
		if(balance <0){
			balance = balance - OVERDRAW_FEE;
		}
		
		System.out.println("Your new balance is $" + balance);
	}

}
