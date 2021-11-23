
public class SavingsAcct {
	
	public static final double MIN_BALANCE = 5;
	
	//instance variables
	private double balance;
	private static double interestRate = 0;
	private static int numberOfAccts = 0;

	public SavingsAcct(){
		balance = 0;
		numberOfAccts ++;
		

	}
	
	public static SavingsAcct factorySavingsAcct(){
		return new SavingsAcct();
	}
	
	public void deposit(double amount){
		balance += amount;
	}
	public double withdraw(double amount){
		if(balance - amount >= MIN_BALANCE){
			balance-=amount;
			return amount;
		}
		else{
			return 0;
		}
	}
	
	
	public static int numberOfAccts(){
		return numberOfAccts;
	}
	public static double getInterestRate() {
		return interestRate;
	}
	public static void setInterestRate(double interestRate) {
		SavingsAcct.interestRate = interestRate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
}
