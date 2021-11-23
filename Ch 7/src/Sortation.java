import java.util.Arrays;

public class Sortation {

	public static void main(String[] args) {
		int [] arr = { 6, 5, 3, 1, 2};
		
		// bubble sort....
		boolean wasSwapped = true;
		int i = 0;
		while(wasSwapped){
			wasSwapped = false;
			for(int j = 1; j < arr.length - i; j++){
				int prev = arr[j - 1];
				int cur = arr[j];
				if(prev > cur){
				   //swap them 
					int tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j-1] = tmp;
					wasSwapped = true;
				}
				
			}
			i++;
		}
//		for(int i = 0; i < arr.length - 1; i++){
//			for(int j = 1; j < arr.length - i; j++){
//				int prev = arr[j - 1];
//				int cur = arr[j];
//				if(prev > cur){
//				   //swap them 
//					int tmp = arr[j];
//					arr[j] = arr[j - 1];
//					arr[j-1] = tmp;
//				}
//				
//			}
//		}
		//print it 
		
//		for(int i = 0; i < arr.length; i++){
//			System.out.println(arr[i]);
//		}
		System.out.println(Arrays.toString(arr));

	}

}
