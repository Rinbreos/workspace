package business_logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import data_access.GoldDA;

public class Gold {
	private long priceInCents; //prices in US cents
	private Date date;
	
	public Gold(long priceInCents, Date date){
		setPriceInCents(priceInCents);
		setDate(date);
	}
	
	/***DATA ACCESS METHODS***/
	public static List<Gold> loadDailyPricesFromCSV(File file)
			throws ParseException, FileNotFoundException{
		
		return GoldDA.loadDailyPricesFromCSV(file);
	}	
	
	/***ACCESSOR METHODS***/
	public long getPriceInCents() {
		return priceInCents;
	}

	public void setPriceInCents(long priceInCents) {
		this.priceInCents = priceInCents;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
