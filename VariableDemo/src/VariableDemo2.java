
public class VariableDemo2 {
	
	public static final int DAYS_PER_WEEK = 7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//int balance = 100;
	//double newBalance = balance;
	//System.out.println(newBalance);
	
	double balance2 = 100.55;
	int newBalance2 = (int)balance2;
	System.out.println(newBalance2);
	
	double cost = 99.99;
	int newCost = (int)cost;
	System.out.println(newCost);
	
	double d1 = .2;
	double d2 = .1;
	double result = d1 + d2;
	System.out.println(result);
	
	char grade = 'A';
	System.out.println(grade);
	
	char grade2 = 65;
	System.out.println(grade2);
	
	boolean isSkyBlue = true;
	boolean hasFeathers = false;
	
	
	
	double daysPerYear = 365.242;
	int year = 4;
	double totalDays = daysPerYear * year;
	System.out.println("Total Days: " + totalDays);
	
	int x = 13;
	int y = 5;
	int z = x / y;
	System.out.println(z);
	int rem = x % y;
	System.out.println(rem);
	
	double amount = 1000.0;
	double adjustment = 100.50;
	amount = amount + adjustment;
	System.out.println(amount);
	
	double balance = 1000.00;
	double rate = .10;
	double newBalance = balance + (balance * rate);
	System.out.println(newBalance);
	
	int distance = 1000;
	distance += 100;
	System.out.println(distance);
	
	int count = 0;
	System.out.println(count);
	System.out.println(++count);
	System.out.println(count++);
	System.out.println(count);
	
	
	

	}

}
