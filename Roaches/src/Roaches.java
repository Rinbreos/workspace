
public class Roaches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Precondition variables needed to find roach population
				int startPop = 10;
				int newPop = 0;
				int[] popArr = new int[10];
				int totPop; 
				for(int r = 0; r < popArr.length; r++){
					
				newPop = (int)Math.pow(2, r)*10;
				
				popArr[r] = newPop;
				
				
				System.out.println(popArr[r]);
				}
				//Precondition make a multi array to represent a table
				
	}
}