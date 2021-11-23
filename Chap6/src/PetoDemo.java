
public class PetoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pet lassy = new Pet();
		lassy.setPet("Lassy", 60, 80);
		System.out.println(lassy);
		
		Pet lassy2 = new Pet();
		lassy2.setPet("Lassy", 50, 80);
		System.out.println(lassy2);
		

		if(!lassy.equals(lassy2)){
			System.out.println("Error!!!");

		}
		lassy2.setAge(2);
		if(lassy.equals(lassy2)){
			System.out.println("Error!!!");

		}
		if(lassy.compareAge(lassy2) != 10){
			System.out.println("Age error");
			
		}
		lassy2.setAge(60);
		if(lassy.compareAge(lassy2) != 0)
			System.out.println("age error");
	
		lassy2.setAge(70);
		if(lassy.compareAge(lassy2) != -10)
		System.out.println("age error");
		}
	
	   	Pet defaultPet = new Pet();
	   	
	   	Pet masterPet = new Pet("Fred", 6, 20);
}
