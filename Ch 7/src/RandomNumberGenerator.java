//import java.lang.reflect.Array;
//import java.util.*;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] genArr = genArr(1000, 100);
		printArr(genArr);
	}	
			
		public static int[] genArr(int size, int maxRange){
			int[] arr = new int[size];
			for(int i= 0; i < arr.length; i++){
				int rand = (int)(Math.random() * maxRange)+ 1;
				arr[i] = rand;
						
			}
			return arr;
		}
	public static void printArr(int[] genArr){
		for (int i = 0; i < genArr.length; i++) {
			System.out.println("arr[" + i + "] = " + genArr[i]);
		}
	}
//	int []arr = {1,2,3};
//	int []newArr = copyArray(arr);
//	
//	foreach(int i : newArray){
//		System.out.println(i);
//	}
	
	public static int [] copyArray(int[] arr){
		
		int [] newArray = new int [arr.length];
		
		for(int i = 0; i < newArray.length; i++){
			newArray[i] = arr[i];
		}
		return newArray;
		
		
	}
	}


