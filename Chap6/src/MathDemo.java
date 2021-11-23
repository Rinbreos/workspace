
public class MathDemo {

	public static void main(String[] args) {
			
		System.out.println(Math.PI);
		
		int max = Math.max(10, 100);
		System.out.println(max);
		
		double radius = 5;
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println(area);
		
		double start = 3.4;
		int rounded = (int)Math.round(start);
		System.out.println(rounded);

		int age = -5;
		System.out.println(Math.abs(age));
		
		double random = Math.random();
		double die = (int)(6 * random) + 1;
		System.out.println(die);
		
		
		
		
	
	}

}
