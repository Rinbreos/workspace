package cars;

public class EnchancedCar extends Car {
	
	public String color;
	
	public EnchancedCar(int vin) {
		super(vin);
			
	}
	
	@Override
	public void accelerate() {
		
		super.accelerate();
		System.out.println("Accelerating to " + this.currentSpeed);
		
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " Color: " + this.color;
		
	}
	
	

}
