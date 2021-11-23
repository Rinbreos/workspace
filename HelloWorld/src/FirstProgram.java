import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello out there.");
		System.out.println("I will add two numbers for you.");
		System.out.println("Enter two whole numbers on a line:");
		
		int n1, n2;
		int sum;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the first number:");
		n1 = keyboard.nextInt();
		System.out.println("Enter the second number:");
		n2 = keyboard.nextInt();
		
		sum = n1 + n2;
		
		System.out.println("The sum of the numbers is " + sum);
		
		
	}

}
