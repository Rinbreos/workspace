import java.util.Scanner;

public class BMR {

	public static final double chocoBar = 230;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to my BMR program.");
		System.out.println("You be using Harris-Benedict equation in this program to determine how much calories your body will need when you exercise.");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your height in inches: ");
		double height = keyboard.nextDouble();
		System.out.println("Enter your weight in pounds: ");
		double weight = keyboard.nextDouble();
		System.out.println("Enter your age: ");
		double age = keyboard.nextInt();
	
		double femaleBMR = 655 + 4.3 * weight + 4.7 * height - 4.7 * age;
		
		double maleBMR = 66 + 6.3 * weight + 12.9 * height - 6.8 * age;
		
		float femaleBMRF = (float)femaleBMR;
		float maleBMRF = (float)maleBMR;
		
		double chocoBarFemaleAmt = femaleBMR / chocoBar;
		
		double chocoBarMaleAmt = maleBMR / chocoBar;
		
		float chocoBarFemaleAmtShort = (float)chocoBarFemaleAmt;
		float chocoBarMaleAmtShort = (float)chocoBarMaleAmt;
		System.out.printf("Your FemaleBMR is: %.2f \n", femaleBMRF);
		System.out.printf("As a female you would have to eat: %.2f chocolate bars to match your calorie burning. \n", chocoBarFemaleAmtShort);
		
		System.out.printf("Your MaleBMR is : %.2f \n", maleBMRF);
		System.out.printf("As a male you would have to eat: %.2f chocolate bars to match your calorie burning. ", chocoBarMaleAmtShort );
	}

}
