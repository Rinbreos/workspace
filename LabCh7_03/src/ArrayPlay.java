
public class ArrayPlay {

	public static void main(String[] args) {

		int[] playArr = playArr(10, 100);
		int[] bubbArr = playArr(10,100);
		int[] selArr = playArr(10,100);
		int[] decArr = playArr(10,100);
		// int [] playArr = {12,5,8};
		// Preconditions of each sort method to fill the arrays and sort them
		bubbleSort(bubbArr);
		selectSort(selArr);
		decendSort(decArr);
		// Preconditions print methods for each different sorter 
		// comment out each sort to print out the sorted arrays separately 
		//printArr(playArr);
		printArr(bubbArr);
		printArr(selArr);
		printArr(decArr);
		ArrayPlay.roachPop();
	}
	//PRecondition make a method far a random number generator to fill the 10 number array
	public static int[] playArr(int size, int maxRange){
		int[] arr = new int[size];
		//Precondition make a loop to make the numbers to fill array
		for(int i= 0; i < arr.length; i++){
			int rand = (int)(Math.random() * maxRange)+ 1;
			arr[i] = rand;
					
		}
		return arr;
	}
	public static void printArr(int[] playArr) {
		// set up print out for the sorts

		for (int i = 0; i < playArr.length; i++) {
			System.out.println("arr[" + i + "] = " + playArr[i] );
		}
		//Precondition inserting a line break to seperate the array outputs
		System.out.println("\n");
	}
	
	public static void bubbleSort(int[] bubbArr) {
		// Precondition create boolean bubble sort loop....
		
		boolean wasSwapped = true;
		// Precondition make a variable to start the loop with
		int i = 0;
		// Precondition make a loop that runs through and compares the index
		// values
		while (wasSwapped) {
			wasSwapped = false;
			for (int j = 1; j < bubbArr.length - i; j++) {
				int prev = bubbArr[j - 1];
				int cur = bubbArr[j];
				if (prev > cur) {
					// swap the numbers
					int tmp = bubbArr[j];
					bubbArr[j] = bubbArr[j - 1];
					bubbArr[j - 1] = tmp;
					wasSwapped = true;
				}

			}
			i++;
		}
	}

	public static void selectSort(int[] selectArr) {
		// Precondition create loop for running through the index length of the
		// array
		for (int i = 0; i < selectArr.length - 1; i++) {
			// create start variable
			int smallIndex = i;

			// Precondition create a loop to compare the index values
			for (int j = i + 1; j < selectArr.length; j++) {
				// Precondition make a variable for first compare index
				int nextVal = selectArr[j];
				// Precondition make an if statement to check the values against
				// one another to set in ascending order
				if (nextVal < selectArr[smallIndex]) {
					smallIndex = j;
				}

			}
			// swap the indexes values
			int tmp = selectArr[i];
			selectArr[i] = selectArr[smallIndex];
			selectArr[smallIndex] = tmp;
		}
	}

	public static void decendSort(int[] decendArr) {
		// Precondition create loop for running through the index length of the
		// array
		for (int i = 0; i < decendArr.length - 1; i++) {
			// create start variable
			int largeIndex = i;

			// Precondition create a loop to compare the index values
			for (int j = i + 1; j < decendArr.length; j++) {
				// Precondition make a variable for first compare index
				int nextVal = decendArr[j];
				// Precondition make an if statement to check the values against
				// one another and to set in decending order
				if (nextVal > decendArr[largeIndex]) {
					largeIndex = j;
				}

			}
			// swap the indexes values
			int tmp = decendArr[i];
			decendArr[i] = decendArr[largeIndex];
			decendArr[largeIndex] = tmp;
		}
	}

	public static void roachPop() {
		// Precondition variables needed to find roach population
		int startPop = 0;
		
		// Precondition make a multi array to represent a table
		int[][] roachPop = new int[10][6];
		// first loop for setting up the outer loop to fill the rows
		for (int r = 0; r < roachPop.length; r++) {

			// iterating each population increase
			// also to set up the inner loop for the columns
			for (int c = 0; c < roachPop[r].length; c++) {

				if (c == 1) {
					startPop = 10;
				}
				if (c == 2) {
					startPop = 100;
				}
				if (c == 3) {
					startPop = 500;
				}
				if (c == 4) {
					startPop = 1000;
				}
				if (c == 5) {
					startPop = 5000;
				}
				
				if(c == 0){
				//	System.out.println(r);
					roachPop[r][c] = r;
				}else{
				//Precondition the math for figuring out the Population of the roaches
				int newPop = (int) (Math.pow(2, r) * startPop);
				roachPop[r][c] = newPop;
				}
			}

		}
		// Precondition Print out the 2D Array of Roaches
		
		System.out.println("2D Roach Array");
		System.out.println("Week" +"\t"+"Pop 1"+"\t"+"Pop 2"+"\t"+"Pop 3"+"\t"+"Pop 4"+"\t"+"Pop 5");
		for (int r = 0; r < roachPop.length; r++) {
			for (int c = 0; c < roachPop[r].length; c++) {
				
				System.out.print(roachPop[r][c] + "\t");

			}
			System.out.println();

		}

	}

}
