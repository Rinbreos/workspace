package person;

public final class Student extends Person {
	
	private int studentNumber;
	
	public Student() {
		super();
		studentNumber = 0;
	}
	
	public Student(String name, int studentNumber) {
		super(name);
		this.studentNumber = studentNumber;
	}
		
	public int getStudentNumber() {
		return studentNumber;
	}
	
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public void reset(String name, int studentNumber) {
		setName(name);
	}
	
	public void writeOutput() {
		System.out.println("Name: " + getName());
		System.out.println("Student Number: " + studentNumber);
	}
	
	public boolean equals(Student otherStudent) {
		return this.hasSameName(otherStudent) &&
				this.studentNumber == otherStudent.studentNumber;
	}

}
