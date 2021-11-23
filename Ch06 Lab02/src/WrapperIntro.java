

public class WrapperIntro {

	public static void main(String[] args) {
		// Precondition set up for the variables
		Integer intObj1 = new Integer (25);
		Integer intObj2 = new Integer ("25");
		Integer intObj3 = new Integer (35);
		
		//compareTo demo
		System.out.println("Comparing using compareTo Obj1 and Obj2: " + intObj1.compareTo(intObj2));
		System.out.println("Comparing using compareTo Obj1 and Obj3: " + intObj1.compareTo(intObj3));
		
		//the equals demo
		System.out.println("Comparing using equals obj1 and Obj2: " + intObj1.equals(intObj2));
		System.out.println("Comparing using equals Obj1 and Obj3: " + intObj1.equals(intObj3));
		
		//Float variables 
		Float f1 = new Float("2.25f");
		Float f2 = new Float("20.43f");
		Float f3 = new Float(2.25f);
		//comparing the floats 
		System.out.println("comparing using compare f1 and f2: " + Float.compare(f1,f2));
		System.out.println("comparing using compare f1 and f3: " + Float.compare(f1, f3));
		//Addition of the integer with Float
		Float f = intObj1.floatValue() + f1;
		System.out.println("Addition of intObj1 and f1: " + intObj1 + " + " + f1 + " = " + f);
		
		// the min value and the max value Integers
		System.out.println("Integer Max Value: "+Integer.MAX_VALUE);
		
        System.out.println("Integer Min Value: "+Integer.MIN_VALUE);

		

	}

}
