
public class MethodsDemo {
	public static final double RATE = 0.10;
	

	public static void main(String[] args) {
		
//		System.out.println("Start");
//		sayHello();
//		addNumbers(10,5);
//		int result = multiplyNumbers(10,10);
//		System.out.println("Result: " + result);
		
//		int x = 100;
//		System.out.println("before calling the method...");
//		System.out.println("x =" + x);
//		doubleNumber(x);
//		System.out.println("After calling the method...");
//		System.out.println("x =" + x);
//		System.out.println("End");
		
		double presentValue = 1000;
		int numYears = 10;
		double futureValue = calcFutureValue(presentValue, numYears);
		System.out.printf("Future value = $%.2%n", futureValue);
	}
	
	public static double calcFutureValue(double pv, int years){
		double fv = pv * Math.pow((1+RATE), years);
		return fv;
	}
	
	
	public static void doubleNumber(int x){
		int z = 500;
		
		x = x * 2;
		System.out.println("within the Method...");
		System.out.println("x = "+ x);
	}
	public static void sayHello(){
		System.out.println("Hello");
	}
	
	public static void addNumbers(int x, int y){
		int sum = x + y;
		System.out.println("sum = " + sum);
	}
	
	public static int multiplyNumbers(int x, int y){
		return x*y;
	}
}
