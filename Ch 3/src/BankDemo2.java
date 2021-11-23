
public class BankDemo2 {
	public static final double STD_RATE = 0.01;
	public static final double PRM_RATE = 0.02;
	
	public static void main(String[] args){
		double balance = 1000;
		
		System.out.println("Your starting balance is $" + balance);
		
		if(balance >= 1000){
			balance = balance +(balance * PRM_RATE);
		}else{
			balance = balance + (balance * STD_RATE);
		}
		
		
		System.out.printf("Your ending balance is $%.2f \n", balance);
	}

}
