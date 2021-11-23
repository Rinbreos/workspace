import java.util.Scanner;

public class SpeciesFirstTry2 {
	//instance variables
	
	private String name;
	private int population;
	private double growthRate;
	private int species; 
	
	
	public boolean equals(SpeciesFirstTry2 otherSpeciesFirstTry2){
		return this.name.equals(otherSpeciesFirstTry2.name)&&
				this.population == otherSpeciesFirstTry2.population;
		
//		if(this.name.equals(otherSpeciesFirstTry2.name)){
//			return true;
//		}else{
//		return false;
//		}
	}
	
	public int compareTo(SpeciesFirstTry2 otherSpeciesFirstTry2){
		if( this.SpeciesFirstTry2.population > otherSpeciesFirstTry2.population){
			return 1;
		}else if(this.SpeciesFirstTry2.population< otherSpeciesFirstTry2.population){
			return -1;
		}else {
			return 0;
		}
	}
	
	
	public void setName(String name){
		this.name= name;		
	}
	public String getName(){
		return  name;
	}
	
	public void setPopulation(int pop){
		if(pop <=0){
			System.out.println("Pop must be greater than zero");
			System.exit(0);
		}
		
	}
	
	public int getPopluation(){
		return population;
	}
			
	public void readInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter species name: ");
		this.name = s.nextLine();
		
		System.out.println("Enter a popluation: ");
		population = s.nextInt();
		
		System.out.println("Enter growth rate: ");
		setGrowthRate(s.nextDouble());
	}
	public void writeOutput(){
		System.out.println(toString());
	}
	public String toString(){
		String msg = "Species Name: " + name;
		msg += "\nPopulation = " + population;
		msg += "\nGrowth Rate = " + getGrowthRate();
		
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
		futurePop += (int)(population*getGrowthRate());
		
		}
		return futurePop;
	}
	public int getSpecies() {
		return species;
	}
	public void setSpecies(int species) {
		this.species = species;
	}
	public double getGrowthRate() {
		return growthRate;
	}
	public void setGrowthRate(double growthRate) {
		this.growthRate = growthRate;
	}
}
