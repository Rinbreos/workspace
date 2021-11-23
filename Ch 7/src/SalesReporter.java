
public class SalesReporter {

			
		// set variables
		
		private double highSales;
		private double lowSales;
		private SalesAssociate[] team;
		
	public static void main(String[] args){
		SalesReporter report = new SalesReporter();
		report.init();
		report.printTeam();
		report.computeStats();
		report.displayResults();
		
	}
	
	public void init(){
		
		team = new SalesAssociate[5];
		
		SalesAssociate bob =new SalesAssociate("Bob", 1000);
		team[0] = bob;
		
		SalesAssociate fred = new SalesAssociate("Fred", 2000);
		team[1]= fred;
		
		team[2] = new SalesAssociate("Jane", 5000);
		team[3] = new SalesAssociate("James", 6000);
		team[4] = new SalesAssociate("Travis", 8000);
		
	}
		
	public void printTeam(){
		
		for(int i = 0; i < team.length; i++){
			System.out.println(team[i].toString());
		}
	}
	public void computeStats(){
		
		highSales = team[0].getSales();
		lowSales = team[0].getSales();
		
		//for(int i = 0; i < team.length; i++){			
//		// double nextSales = team[i].getSales();			
//		if(nextSale < highSales){
//			highSales = nextSale;
//			System.out.println(highSales);
//		}
//		
		for(SalesAssociate nextAssoc : team){
			double nextSales = nextAssoc.getSales();
				if(nextSales > highSales){
					highSales = nextSales;
					
				}else if(nextSales < lowSales){
					lowSales = nextSales;
				}
		}
	}
		public void displayResults(){
			String msg = ("Highest sales was " + highSales);
			
			System.out.println(msg);
		}
	}
	


