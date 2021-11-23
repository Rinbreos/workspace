
public class ValueOfDemo {

	public static void main(String[] args) {
		// Variable for the Demo
		Integer intWrapper = Integer.valueOf("12345");
		//Converting from binary to decimal
		Integer intWrapper2 = Integer.valueOf("11011", 2);
		//Converting from hexadecimal to deciaml 
		Integer intWrapper3 = Integer.valueOf("D", 16);
		
		// Output the outcomes
		System.out.println("Value of intWrapper Object: " + intWrapper);
		System.out.println("Value of intWrapper2 Object: " + intWrapper2);
		System.out.println("Value of intWrapper3 Object: " + intWrapper3);
		System.out.println("Hex value of intWrapper: " + Integer.toHexString(intWrapper));
		System.out.println("Binary Value of intWrapper2: " + Integer.toBinaryString(intWrapper2));
		

	}

}
