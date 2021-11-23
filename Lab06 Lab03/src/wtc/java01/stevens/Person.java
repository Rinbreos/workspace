package wtc.java01.stevens;
import java.util.Scanner;

public class Person {
	
	//class variables for Person set to private
	private static int numberOfPeople = 0;
	private String name;
	private int age;
	//Precondition set up variables for address
	private String street;
	private String city;
	private String state;
	private String zip;
	// Precondition make variables to hold height and weight
	
	private double height = 0;
	private double weight = 0; 
	private double pounds = 0;
	private double kilograms = 0;
	private int ft = 0;
	private int inches = 0;
	
	
	
	//Precondition make a method for Height
	public void setHeight(int inches){
		this.height = inches;
	}
	public void setHeight(double inches){
		this.height = inches;
	}
	public void setHeight(int ft, int inches){
		
		this.height = (ft * 12) + inches;
					
	}
	public void setHeightCm(double centimeters){
		//this.height = centimeters;
		this.height = centimeters/2.54;
	}
	//Precondition make a method for weight
	public void setWeight(int pounds){
		this.weight = (double)pounds;
	}
	public void setWeight(double pounds){
		this.weight = pounds;
	}
	public void setWeight(Double kilograms){
		//this.weight = kilograms;
		this.weight = kilograms*2.2;
	}
	
	//Precondition make a method for address with state and zip
	public void setAddress(String state, String zip){
		setAddress("???", "???", state, zip);
	}
	
	//Precondition make a method for address with city state and zip
	public void setAddress(String city, String state, String zip){
		setAddress("???",city, state, zip);
		
	}
	//Precondition make a master method for address
	public void setAddress(String street, String city, String state, String zip){
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		//Precondition have street and city throw out unknown if null or empty
		if(street == null || street == "" || street == " "){
			this.street = "unknown";
		}
		if(city == null || city == "" || city == " "){
			this.city = "unknown";
		}
		//Precondition make it exit if no state or zip is entered
		if(state == null || state == " " || state == ""){
			System.out.println("A state needs to be enter.");
			System.exit(0);
		}
		if(zip == null || zip == " " || zip == ""){
			System.out.println("A zip code needs to be enter.");
			System.exit(0);
		}
		
	}
	//Precondition make a method to output the address
	public String outputAddress(){
		
	   String address = "Street: " + street ;
		address += "\nCity: " + city;
		address += "\nState: " + state;
		address += "\nZip: " + zip;
		
		return address; 
		
	}
	//Precondition make a method to output Height
	public String outputHeight(){
		this.ft = (int)(height/12);
		this.inches = (int)(height %12);
		String tall = "Height: " + ft + "' " + inches + "''";
		
		return tall;
	}
	
	//Precondition make a method to output Weight
	public String outputWeight(){
	
		String perWeight = "Weight: %.2f lbs.";
		String msg2 = String.format(perWeight, weight);
		return msg2;
	}
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

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public double getPounds() {
		return pounds;
	}
	public void setPounds(double pounds) {
		this.pounds = pounds;
	}
	public double getKilograms() {
		return kilograms;
	}
	public void setKilograms(double kilograms) {
		this.kilograms = kilograms;
	}


	
	// Post Condition is setting and getting the age and name
	// Post Condition is setting and getting the address

}
