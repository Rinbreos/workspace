package cars;

public class AppDriver {

	public static void main(String[] args) {
		
		Car c1 = new Car(111);
		c1.accelerate();
		System.out.println(c1.toString());
		
		EnchancedCar c2 = new EnchancedCar(112);
		
		c2.accelerate();
		c2.color = "red";
		System.out.println(c2.toString());
		
	}

}
