
import java.util.Scanner;
public class SpeciesDemo {
	//instance variables
	
	private String name;
	private int population;
	private double growthRate;
	private int species;
	
	public void readInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter species name: ");
		name =s.nextLine();
		
		System.out.println("Enter a popluation: ");
		population = s.nextInt();
		
		System.out.println("Enter growth rate: ");
		growthRate = s.nextDouble();
	}
	public void writeOutput(){
		System.out.println(toString());
	}
	public String toString(){
		String msg = "Species Name: " + name;
		msg += "\nPopulation = " + population;
		msg += "\nGrowth Rate = " + growthRate;
		
		return msg;
	}
}



