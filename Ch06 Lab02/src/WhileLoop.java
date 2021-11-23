import java.util.Arrays;

public class WhileLoop {

	public static void main(String[] args) {
//		int i= 0;
//		while(i<=6){
//			System.out.println(i);
//			i++;
//		}
		int[] art = {13,5,6,7,9};
		int[] car = {2,6,4,76,13};
		int[] ray = combArr(art,car);
		System.out.println(Arrays.toString(ray));
	}
	public static int[] combArr(int[]arr, int[] arr2){
		int[] tmp = new int[arr.length + arr2.length];
		int r = 0;
		for(int i =0; i<tmp.length; i++){
			if(i<arr.length){
				tmp[i]=arr[i];
			}
			else{
				tmp[i]=arr2[r];
				r++;
			}
		}
		return tmp;
	}

}
