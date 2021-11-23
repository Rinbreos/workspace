import java.util.Scanner;

public class WhileDemo {
	public static final double GROWTH_RATE = 0.95;
	public static final double ONE_BUG_VOL = 0.002;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int count = 0;
		
		while(count <10){
			System.out.println("count = "+ count);
			count++;
		}
*/
		System.out.println("Enter volume of house: ");
		Scanner s = new Scanner(System.in);
		double houseVolume = s.nextDouble();
		
		//get starting pop
		System.out.println("Enter starting roach pop: ");
		int startPop = s.nextInt();
		
		// other var
		int weeks = 0;
		int totalPop = startPop;
		double totRoachVol = totalPop * ONE_BUG_VOL;
		while(totRoachVol < houseVolume){
			weeks++;
			int newPop = (int)(totalPop * GROWTH_RATE);
			totalPop += newPop;
			
			totRoachVol = totalPop * ONE_BUG_VOL; 
			System.out.println("After "+ weeks + " weeks we have " + totRoachVol + " roach volume.");
			
			System.out.println("After "+ weeks + " weeks we have "+ totalPop + " roaches.");
			
			// calc percent filled
			double percFilled = totRoachVol / houseVolume;
			if(percFilled >= .10){
				System.out.println("Evacuate!!!");
			}
		}
		
	}

}
