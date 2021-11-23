
public class DogDemo {

	public static void main(String[] args) {
		
		//created an object of an instance
		Dog fido = new Dog();
		fido.name = "Fido";
		String name = fido.name;
		fido.age = 5;
		fido.breed= "lab";
		//System.out.println("Dogs age in human years: " +fido.getAgeInHumanYears());
		
		System.out.println();
		
		Dog max = new Dog();
		max.name = "Max";
		max.age = 7;
		max.breed = "mutt";
		int humanAge = max.getAgeInHumanYears();
		//System.out.println("Human years: " + humanAge);
		System.out.println(max.toString());
		
		fido.writeOutput();

	}

}
