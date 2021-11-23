import java.util.Scanner;

public class SpeciesFirstTry {
	//instance variables
	
	public String name;
	public int population;
	public double growthRate;
	public int species; 
	
	public void readInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter species name: ");
		this.name = s.nextLine();
		
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
//	public int getMalePopulation(){
//		return population/2;
//	}
//	public int getFemalePopulation(){
//		if(population%2 == 1){
//			population = population/2 +1;
//		}else{
//			return population /2;
//		}
//	}
	public int getPopultionIn10(){
		int futurePop = this.population;
		
		for(int i = 0; i < 11; i++){
		futurePop += (int)(population*growthRate);
		
		}
		return futurePop;
	}
}
