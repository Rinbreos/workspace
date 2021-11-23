import java.util.Scanner;

/**
 * Date Jan 11, 2017
 * This application is to Convert Fahrenheit to Celsius
 * @author r8me4
 *
 */

public class TempConvert {
		/**
		 * TempConvert is to convert Fahrenheit to Celsius
		 * 
		 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float c;
		/**
		 * C is value that is from the method
		 */
		System.out.println("Welcome to Fahrenheit to Celsius Convert.");
		System.out.println("You will enter the Fahrenheit tempature that you want to convert to Celsius.");
		
		float f;
		/**
		 * F is the value that is inputed for Fahrenheit
		 */
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the Fahrenheit Tempature:");
		f = keyboard.nextFloat();
		
		c = ((f - 32)*5)/9;
		/**
		 * @param F
		 * @return
		 */
				
		System.out.println("Your Tempature in Celsius is: " + c);
		
		

	}

}