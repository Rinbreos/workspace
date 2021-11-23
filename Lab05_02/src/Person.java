import java.util.Scanner;

public class Person {
	
	//class variables for Person set to private
	private static int numberOfPeople = 0;
	private String name;
	private int age;
	//Precondition make an empty constructor
	public Person(){
		this("???", 0);
	}

	//Precondition make a constructor to set name
	public Person(String name){
		this(name, 0);
	}
	//Precondition make a condition to make a master constructor
	public Person(String name, int age){
		this.name = name;
		this.age = age;
		numberOfPeople++; 
	}
	
	// Precondition make an Adult extension
	public static Person createAdult(){
		Person adult = new Person("An Adult", 21);
		return adult;
		
	}
	//Precondition make a Toddler extension
	public static Person createToddler(){
		Person toddler = new Person("A Toddler", 2);
		return toddler;
	}
	
	//Precondition make an Adolescent extension
	public static Person createAdolescent(){
		Person adolescent = new Person("An Adolescent", 9);
		return adolescent;
	}
	//Precondition make a Teenager extension 
	public static Person createTeenager(){
		Person teenager = new Person("A Teenager", 15);
		return teenager;
	}

	//Preconditions getting the input of the name and age
	
	public void readInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Person's name: ");
		this.setName(s.nextLine());
		
		System.out.println("Enter the Person's age: ");
		this.age = s.nextInt();
	}
	//Post Condition methods to set the name and age 
	
	//Precondition make a toString Method
	public String toString(){
		String msg = "Name: " + this.getName();
		msg += "\tAge" +" " + this.getAge();
		return msg;
	}
	
	
	//Preconditions checking for the same name
	
	public boolean sameName(Person otherPerson)
	{
		if(this.name.equalsIgnoreCase(otherPerson.name)){
			return true;
		}else
			return false;
			//System.out.println("Not the same name.");	
	}
	//Post Condition method returns the outcome same name
	
	
	
	//Preconditions checking for if they have same data
	
	public boolean equals(Person otherPerson){
	
		if(this.name.equals(otherPerson.name) &&
			this.age == otherPerson.age){
			//System.out.println("These two people have the same data");
			return true;
		}else{
			//System.out.println("These two people don't have the same data");
			return false;
		}
		
	}
	//Post Condition method is returning outcome of checking name and age
	
	
	
	//Preconditions checking for age differences
	
	public int compareAge(Person otherPerson){
		return  this.age-otherPerson.age;
	}
	//Post Condition compareAge method is returning the difference of age
	
	//Precondition make a setter for a first and last name
	public void setName(String first, String last){
		String fullName = first + " " + last;
		setName(fullName);
	}
	//Preconditions setters and getters
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public static int getNumberOfPeople() {
		return numberOfPeople;
	}


	

	// Post Condition is setting and getting the age and name

}
