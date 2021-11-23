package cars;

public class Car {

	public int currentSpeed = 0;
	private int vin;
	
	public Car(int vin) {
		this.vin = vin;
	}
	
	public void accelerate() {
		this.currentSpeed += 10;
	}
	
	@Override
	public String toString() {
		return "VIN: " + this.vin + " SPEED: " + this.currentSpeed;
	}
}
