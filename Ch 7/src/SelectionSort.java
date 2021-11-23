
public class SelectionSort {

	public static void main(String[] args) {

		int [] arr = {3,9,1,7,4};
		
		selectionSort(arr);
		
		printArr(arr);

	}
	public static void printArr(int[] arr){
			
		for(int i = 0; i < arr.length; i++){
			System.out.println("arr[" +i + "] = " + arr[i]);
		}
	}
	public static void selectionSort(int[] arr){
		
		for(int i = 0; i < arr.length - 1; i++){
			int smallIndex = i;
			
			for(int j = i + 1; j < arr.length; j++ ){
				int nextVal = arr[j];
				if(nextVal < arr[smallIndex]){
					smallIndex = j;
					
				}
			}
			
			//swap 
			int tmp = arr[i];
			arr[i] = arr[smallIndex];
			arr[smallIndex] = tmp;
		}
		
	}

}
