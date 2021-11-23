
public class Pet {
	
	private String name;
	private int age;
	private double weight;
	
	public Pet(){
		this("???", 0, 0);
		
	}
	public Pet(double weight){
		this("???", 0, weight);
	}
	public Pet(int age){
		this("???", age);
	}
	
	public Pet(String name, int age){
		this(name, age, 0);
	}
	public Pet(String name, int age, double weight){
		setPet(name, age, weight);
	}
	
	public int compareAge(Pet otherPet){
		return age - otherPet.age;
	}
	
	public boolean equals(Pet otherPet){
		 return this.name.equals(otherPet.name)&&
				this.age == otherPet.age &&
				this.weight == otherPet.weight;
		}
		
	
	
	public String toString(){
		String msg = "Name = " + name;
		msg += "\nAge = " + age;
		msg += "\nWeight = " + weight;
		return msg;
	}
	
	public void setPet(String name, int age, double weight){
		
		setName(name);
		setAge(age);
		setWeight(weight);
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
