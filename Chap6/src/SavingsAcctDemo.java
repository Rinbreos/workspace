
public class SavingsAcctDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SavingsAcct.MIN_BALANCE);
		//System.out.println("# of accounts" + SavingsAcct.getNumberOfAccts());

		SavingsAcct.setInterestRate(.10);
		
		SavingsAcct mySavings = new SavingsAcct();
		
		//System.out.println(("# of accounts " + SavingsAcct.getNumberOfAccts());
		
		mySavings.deposit(100);
		mySavings.withdraw(50);
		System.out.println("My balance " + mySavings.getBalance());
		
		double min = mySavings.MIN_BALANCE;
		SavingsAcct.setInterestRate(.15);
		
		//SavingsAcct
	}

}
