
public class SalesAssociate {

	
		
		//make instance variables 
		
		private String name;
		private double sales;
		
		public SalesAssociate()
		{
			name = "???";
			sales = 0;
		}
		
		public SalesAssociate(String name, double sales)
		{
			this.name = name;
			this.sales = sales;
		}
		
		public String toString(){
			
			String msg = "\nName: " + name;
			msg += String.format("\nSales: $%.2f", + sales);
			
			return msg;
			
		}
		public double getSales() {
			return sales;
		}
		public void setSales(double sales) {
			this.sales = sales;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		

	}


