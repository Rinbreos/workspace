package wtc.java01.stevens;

public class PersonDemo {

	public static void main(String[] args) {
		// test my Person Class
		// setting up Persons for the test
		
       Person person = new Person();
       person.setName("james");
       person.setAge(67);
       person.setName("James", "Jones");
       System.out.println(person.getName());
       
       Person otherPerson = new Person();
       otherPerson.setName("james");
       otherPerson.setAge(35);
       
       Person nextPerson = new Person();
       nextPerson.setName("Kevin");
       nextPerson.setAge(54);
       nextPerson.setAddress("789 Main St", "Holmen", "WI", "54636");
       nextPerson.setHeight(76);
       nextPerson.setWeight(175);
       
       Person num4 = new Person();
       num4.setName("Jan");
       num4.setAge(43);
       num4.setAddress(" ", "", "NY", "58962");
       num4.setHeightCm(189);
       System.out.println(num4.getName() + "'s " + num4.outputHeight());
       System.out.println(num4.getName() + "'s " +"Address is:\n" + num4.outputAddress());
       
       
       
       Person adult = Person.createAdult();
//       adult.setName("Bob");
//       adult.setAge(21);
       
       Person adolescent = Person.createAdolescent();
//       adolescent.setName("Fred");
//       adolescent.setAge(8);
       
       Person toddler =  Person.createToddler();
//       toddler.setName("Ann");
//       toddler.setAge(2);
//       
       Person teenager = Person.createTeenager();
//       teenager.setName("Lisa");
//       teenager.setAge(15);
       // check and see if they have the same data.
       

	//calling on my comparing if they have the same data
       
      // person.equals(otherPerson);
   	if(person.equals(otherPerson)){
		System.out.println("These two people have the same data.");
	}
	else{
		System.out.println("These two people don't have the same data.");	
		}
       
		// calling on my comparing of their ages
			
  
		  int ageDiff = person.compareAge(otherPerson);
		if(ageDiff > 0 ){
			
			System.out.println("This person, " + person.getName() + " is older: "+ ageDiff +" years");
	
		}else if (ageDiff < 0){			
			System.out.println("This person, " + person.getName() + " is younger by: "+ ageDiff+" years");
		}else{
			System.out.println("These two people have the same age. 0");
		}
	
		
		
		// calling to see if they have same name
		
		if(person.sameName(otherPerson)){
			System.out.println("Names are the same.");
		}else{
			System.out.println("Names are not the same.");
		}
		
		// calling sysout the persons made
		System.out.println(person.toString());
		System.out.println(otherPerson.toString());
		System.out.println(adult.toString());
		System.out.println(adolescent.toString());
		System.out.println(toddler.toString());
		System.out.println(teenager.toString());
		// calling out the number of people made
		
		System.out.println("Number of people made: " + Person.getNumberOfPeople());
		
		// calling out the address
		
		
		System.out.println(nextPerson.getName() + "'s " + nextPerson.outputHeight());
		System.out.println(nextPerson.getName() + "'s " + nextPerson.outputWeight());
		System.out.println(nextPerson.getName() + "'s\t" +"Address is:\n" + nextPerson.outputAddress());
   			
	
		
       
       
		
		

	}

}
