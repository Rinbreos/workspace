
public class InterestTeable {

	public static void main(String[] args) {
			
		double startBal = 1000;
		double baseRate = 0.05;
		double deltaRate = 0.005;
		
		//first index rep years and second rep rate
		
		double[][] table = new double[10][6];
		
		// iterating through years
		for(int r = 0; r < table.length; r++){
			//iterating each interest rate
							
			for(int c = 0; c < table[r].length; c++){
				double intEarn = 0;
				double curTotal = 0;
				double rate = baseRate +(deltaRate * c);
			
			
			if(r == 0){
				 intEarn = startBal * rate;
				 curTotal = startBal + intEarn;
				
				
			}else{
				 double lastAmt = table[r-1][c];
				 intEarn = lastAmt * rate;
				 curTotal = lastAmt + intEarn;
				
			}
			table[r][c] = curTotal;

			}
			
			
			}
		String msg;
		for(int r = 0; r < table.length; r++){
			for(int c = 0; c <table[r].length; c++){
				String val = String.format("$%.2f", table[r][c]);
				
				
					System.out.print(val + "\t");
				
			}
			System.out.println();
			
			
		}
	}
}
