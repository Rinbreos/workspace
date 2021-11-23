
public class SpeciesDemo2 {

	public static void main(String[] args) {
		
//		SpeciesFirstTry2 klingonOx = new SpeciesFirstTry2();	
//		klingonOx.setName("Klingon Ox");
//		String name = klingonOx.getName();
//		System.out.println(klingonOx.getName());
//		
//		klingonOx.setPopulation(100);
//		System.out.println(klingonOx.getPopulation());
//		
		SpeciesFirstTry2 dog = new SpeciesFirstTry2();
		dog.setName("Lab");
		dog.setPopulation(1000000);
		dog.setGrowthRate(0.10);
		
		SpeciesFirstTry2 otherDog = new SpeciesFirstTry2();
		otherDog.setName("Lab");
		otherDog.setPopulation(1000000);
		otherDog.setGrowthRate(0.10);
		
		if(dog == otherDog){
			System.out.println("Same memory or object???");
		}
		else{
			System.out.println("Not same memory or object???");
		}
		if(dog.equals(otherDog)){
			System.out.println("These dogs have the same data");
		}else{
			System.out.println("The dogs dont have the same data");
		}
		
		if (dog.compareTo(otherDog)){
			System.out.println();
		}
	}

}
