package data_access;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import business_logic.Gold;

public class GoldDA {
	
	private static final SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
	
	
	public static List<Gold> loadDailyPricesFromCSV(File file) throws ParseException, FileNotFoundException{
		
		ArrayList<Gold> goldList = new ArrayList();
		
		Scanner s = new Scanner(file);
		
		int lineNo = 0;
		
		while(s.hasNextLine()){
			//System.out.println("Processing Line : " + ++lineNo);
			
			String line = s.nextLine();
			String[] tokens = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
			
			Date date = df.parse(tokens[0]);
			
			//strip any commas from prices
			tokens[1] = tokens[1].replace(",", "");
			//strip quotes from prices
			tokens[1] = tokens[1].replace("\"", "");
			
			
			//System.out.println("Year: " + df.format(date) + " Price: " + tokens[1]);
			
			double price = Double.parseDouble(tokens[1]);
			long priceInCents = (long)(price * 100);
			
			Gold g = new Gold(priceInCents, date);
			goldList.add(g);
			
			
		}
		
		return goldList;
	}
}
