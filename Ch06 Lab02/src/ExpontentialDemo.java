
public class ExpontentialDemo {

	public static void main(String[] args) {
		//Precondition the variables for the demo
				double x = 11.635;
				double y = 2.76;
				
				System.out.printf("The value of " + "e is %.4f%n", Math.E);
				
				System.out.printf("exp (%.3f) " + "is %.3f%n", x, Math.exp(x));
				
				System.out.printf("log (%.3f) is " + "%.3f%n", x, Math.log(x));
				
				System.out.printf("pow (%.3f) is " + "%.3f%n", x, y, Math.pow(x,  y));
				
				System.out.printf("sqrt (%.3f) is " + "%.3f%n", x, Math.sqrt(x));
				
		
			
		//Set up a compound interest as per the instructions
				double principal = 1000;
				double time = 10;
				double interest = 5;
				double compInt = 0;
				
				compInt = principal * Math.pow((1 + interest/100), time);
				
		//Print the outcome
				System.out.printf("The compounded interest is: $%.2f", compInt);
				
				

	}

}
