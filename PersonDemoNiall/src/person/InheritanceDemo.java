package person;

public class InheritanceDemo {

	public static void main(String[] args) {
			
		Student s = new Student();
		s.setName("Fred Flintstone");
		s.setStudentNumber(895848523);
		
		s.reset("Greg Steele", 123456789);
		
		s.writeOutput();
		
		

	}

}
