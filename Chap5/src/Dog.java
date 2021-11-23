
public class Dog {
	// attributes
	//instant variables
	public String name;
	public String breed;
	public int age;
	
	public void writeOutput(){
//		String msg = "Name = " + name;
//		msg+= "\nBreed = " + breed;
//		msg+= "\nAge = " + age;
		String msg = toString();
		System.out.println(msg);
	}
	public String toString(){
		String msg = "Name = " + name;
		msg+= "\nBreed = " + breed;
		msg+= "\nAge = " + age;
		msg+= "\nHuman years: " + getAgeInHumanYears();
		return msg;
	}
	public int getAgeInHumanYears(){
		//age <= 2, the dog is age * 11 in human years 
		//otherwise,  the dog age is 22 + ((age -2)*5)
		int humanAge = 0;
		if(age<= 2){
			return  age * 11;
		}
		else{
			//
			return 22+((age-2)*5);
		}
	}

}
