
public class BasicMathDemo {

	public static void main(String[] args) {
		// Precondition to make the variables
		double a = -191.635;
		double b = 43.74;
		int c = 16, d = 45;
		
		// Precondition make a random number generator
		//make a loop to output 10 random numbers between 1 and 100
	
		for(int i = 0; i < 11; i++){
			int numb = (int)(Math.random() * 100) + 1;
			System.out.println("Random number is: " + numb);
		}

		

		//Precondition the output of the variables in Math
		System.out.printf("The absoltute value " + "of %.3f is %3fn", a, Math.abs(a));
		
		System.out.printf("The ceiling of " + "%.2f is %.0f%n", b, Math.ceil(b));
		
		System.out.printf("The floor of " + "%.2f is %.0f%n", b, Math.floor(b));
		
		System.out.printf("The rint of %.2f" + "is %.0f%n", b, Math.rint(b));
		
		System.out.printf("The max of %d and " + "%d is %d%n", c, d, Math.max(c, d));
		
		System.out.printf("The min of %d " +  "and %d is %d%n", c,d, Math.min(c, d));
	}
	
}
