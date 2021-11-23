package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;

import org.jfree.ui.RefineryUtilities;

import business_logic.Gold;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	private static final DateFormat df = SimpleDateFormat.getDateInstance(SimpleDateFormat.SHORT);
	
	private JFrame frmGold;
	private JTextField txtLatestPrice;
	private JTextField txtNumPrices;
	private JTextField txtMaxPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmGold.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGold = new JFrame();
		frmGold.setTitle("Gold");
		frmGold.setBounds(100, 100, 325, 246);
		frmGold.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGold.getContentPane().setLayout(null);
		frmGold.setLocationRelativeTo(null);
		frmGold.setLocation(0, 0);
		
		JButton btnGenReport = new JButton("Generate Report");
		btnGenReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				generateReport();
			}
		});
		btnGenReport.setBounds(91, 38, 131, 39);
		frmGold.getContentPane().add(btnGenReport);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(26, 101, 265, 92);
		frmGold.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblMostRecentQuote = new JLabel("Latest Price:");
		lblMostRecentQuote.setBounds(10, 36, 100, 14);
		panel.add(lblMostRecentQuote);
		
		JLabel lblNumberOfPrices = new JLabel("Number of Prices:");
		lblNumberOfPrices.setBounds(10, 11, 119, 14);
		panel.add(lblNumberOfPrices);
		
		JLabel lblMaxPrice = new JLabel("Max Price:");
		lblMaxPrice.setBounds(10, 61, 119, 14);
		panel.add(lblMaxPrice);
		
		txtLatestPrice = new JTextField();
		txtLatestPrice.setEditable(false);
		txtLatestPrice.setBounds(120, 33, 135, 20);
		panel.add(txtLatestPrice);
		txtLatestPrice.setColumns(10);
		
		txtNumPrices = new JTextField();
		txtNumPrices.setEditable(false);
		txtNumPrices.setColumns(10);
		txtNumPrices.setBounds(120, 8, 135, 20);
		panel.add(txtNumPrices);
		
		txtMaxPrice = new JTextField();
		txtMaxPrice.setEditable(false);
		txtMaxPrice.setColumns(10);
		txtMaxPrice.setBounds(120, 58, 135, 20);
		panel.add(txtMaxPrice);
	}
	
	private void generateReport(){
		GoldReports reports = new GoldReports("Gold Reports", "Gold");
		reports.pack();
		RefineryUtilities.centerFrameOnScreen(reports);
	    reports.setVisible(true);
	    
	    //update the metrics...
	    NumberFormat nf = NumberFormat.getInstance();
	    txtNumPrices.setText(nf.format(reports.getNumberOfPrices()));
	    
	    //latest price...
	    Gold latestGold = reports.getLatestPrice();
	    String strLatest = df.format(latestGold.getDate());
	    NumberFormat cf = NumberFormat.getCurrencyInstance();
	    strLatest += "  " + cf.format(latestGold.getPriceInCents() / 100);
	    txtLatestPrice.setText(strLatest);
	    
	    //max price...
	    Gold maxGold = reports.getMaxPrice();
	    String strMax = df.format(maxGold.getDate());
	    strMax += "  " + cf.format(maxGold.getPriceInCents() / 100);
	    txtMaxPrice.setText(strMax);
	}
}
