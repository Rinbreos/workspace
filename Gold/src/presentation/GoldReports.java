package presentation;

import java.awt.Font;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

import business_logic.Gold;

public class GoldReports extends ApplicationFrame {
	private static final String PATH_TO_GOLD_CSV = "./csv/daily_gold_prices.csv";
	private static final DateFormat df = SimpleDateFormat.getDateInstance(SimpleDateFormat.SHORT);
	private List<Gold> dailyGoldList;
		
	public GoldReports(String applicationTitle, String chartTitle){
		super(applicationTitle);
		init();
		
		JFreeChart lineChart = ChartFactory.createTimeSeriesChart(
		         chartTitle,
		         "Year","Price",
		         createYearlyGoldDataset(),
		         false,false,false);
		
				         
		ChartPanel chartPanel = new ChartPanel(lineChart);
		chartPanel.setPreferredSize(new java.awt.Dimension(1000 , 600));
		setContentPane(chartPanel);
	}
	
	private void init()
	{
		
		System.out.println("Starting initialization....");
		
		try{
			dailyGoldList = Gold.loadDailyPricesFromCSV(new File(PATH_TO_GOLD_CSV));
		}
		catch(FileNotFoundException fnf){
			System.out.println("Gold CSV file was not found in path " + this.PATH_TO_GOLD_CSV);
			System.exit(0);
		}
		catch(ParseException pe){
			System.out.println("Problems encountered while parsing Gold CSV file.");
			pe.getStackTrace();
			System.exit(0);
		}
		catch(Exception e){
			System.out.println("Unknown anticipated error while parsing Gold CSV file.");
			e.printStackTrace();
			System.exit(0);
		}
		
		System.out.println("Finished initialization....");
	}
	
	private XYDataset createYearlyGoldDataset()
	{	
		
		TimeSeries s1 = new TimeSeries("Years");
		
		ArrayList<Gold> yearlyGold = findYearlyGoldPrices();

		for(Gold g : yearlyGold){
			//convert the price to dollars
			int dollars = (int)(g.getPriceInCents() / 100);
						
			s1.add(new Year(g.getDate()), dollars);	
			
			//System.out.println("Year: " + df.format(g.getDate()) + " Price: " + g.getPriceInCents());
		}
		
		TimeSeriesCollection dataset = new TimeSeriesCollection();
		dataset.addSeries(s1);

	    return dataset;
	}
	
	
	//TODO: Revise this method as discussed in the lab instructions
	private ArrayList findYearlyGoldPrices(){
		
		ArrayList yearlyGoldList = new ArrayList();		
		
		yearlyGoldList.add(dailyGoldList.get(0));
		yearlyGoldList.add(dailyGoldList.get(dailyGoldList.size() - 1));
		
		Calendar c = Calendar.getInstance();
		for(int i=0; i < dailyGoldList.size(); i++){
			Gold nextGold = dailyGoldList.get(i);
			Date nextDate = nextGold.getDate();
			c.setTime(nextDate);
			int dayOfYear =c.get(Calendar.DAY_OF_YEAR);
			
			if(dayOfYear == 365){
				yearlyGoldList.add(nextGold);
			}
		}
		
		
//		for(int i =0; i< dailyGoldList.size(); i++){
//			Gold nextGold = dailyGoldList.get(i);;
//			
//			Date nextDate = nextGold.getDate();
//					
//			nextGold.getDate();
//			if(nextDate.getMonth() == 11 && nextDate.getDate() == 31){
//				yearlyGoldList.add(nextGold);
//			}
//		}
		
		return yearlyGoldList;
	}
	
	//TODO: Revise this method as discussed in the lab instructions
	public int getNumberOfPrices(){
		return dailyGoldList.size();
	}
	
	//TODO: Revise this method as discussed in the lab instructions
	public Gold getLatestPrice(){
		return new Gold(0, Calendar.getInstance().getTime());
	}
	
	//TODO: Revise this method as discussed in the lab instructions
	public Gold getMaxPrice(){
		return new Gold(0, Calendar.getInstance().getTime());
	}		
}
