import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float C;
		
		System.out.println("Welcome to Fahrenheit to Celsius Convert.");
		System.out.println("You will enter the Fahrenheit tempature that you want to convert to Celsius.");
		
		int F;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the Fahrenheit Tempature:");
		F = keyboard.nextInt();
		
		C = ((F - 32)*5)/9;
				
		System.out.println("Your Tempature in Celsius is: " + C);
		
		

	}

}
