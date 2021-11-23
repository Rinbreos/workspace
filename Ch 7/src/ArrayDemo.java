
public class ArrayDemo {

	public static void main(String[] args) {
		// make an array
		
		double[] gasPrices = new double[5];
		
		gasPrices[0] = 1.96;
		gasPrices[1] = 1.977;
		gasPrices[2] = 2.018;
		gasPrices[3] = 2.022;
		gasPrices[4] = 2.025;
		
		printArray(gasPrices);
		printArrayStats(gasPrices);
		
//		int[] agesArr = new int[2];
//		
//		String[] names = new String[2];
//		names[0] = "Ray";
// 		
//		
	}
	
	public static void printArrayStats(double[] arr){
		
		
		//double smallPrice  = Double.MAX_VALUE;
		
		//double smallPrice = arr[0];
		double largPrice = arr[0];
		double sum = 0;
		// find the smallest value in the array
		//than print it
		for(int i = 0; i < arr.length; i++){
			double curr = arr[i];
			sum += curr;
			if(curr > largPrice){
				largPrice = curr;
			}
		}
		double avg = sum/ arr.length;
		System.out.println("The average is: " + avg);
		System.out.println("Largest Price is: " + largPrice);
		
//		for(int i = 0; i < arr.length; i++){
//			double curPrice = arr[i];
//			if(curPrice<smallPrice){
//				smallPrice = curPrice;
//			}
//		}
//		System.out.println("Smallest Value is: " + smallPrice);
//		
		
	}
	public static void printArray(double[] arr){
		
		
		
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		
		
	}

}
