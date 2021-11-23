import java.util.Scanner;

public class Person {
	
	//class variables for Person set to private
	
	private String name;
	private int age;
		
	
	//Preconditions getting the input of the name and age
	
	public void readInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Person's name: ");
		this.setName(s.nextLine());
		
		System.out.println("Enter the Person's age: ");
		this.age = s.nextInt();
	}
	//Post Condition methods to set the name and age 
	
	
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

	// Post Condition is setting and getting the age and name

}
