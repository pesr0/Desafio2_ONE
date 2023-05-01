package money_converter;
/**
 * This Class got more "textier" than expected, but the original propose for the program demanded it, for "My Version" program, Classes tend to be more optimized
 */

import javax.swing.JOptionPane;

public class CVBoxInputs {
	
	//Initialize object to receive constant labels and String
	private AVLabels labels = new AVLabels();
	
	//Defines variables with String values from label to minimize text on code and make the visualization easier
	private String dollars = labels.getDriverConversionOptions()[0][0];
	private String reais = labels.getDriverConversionOptions()[0][1];
	private String euros = labels.getDriverConversionOptions()[0][2];
	private String libers = labels.getDriverConversionOptions()[0][3];
	private String yenes = labels.getDriverConversionOptions()[0][4];
	private String wons = labels.getDriverConversionOptions()[0][5];
	private String c = labels.getDriverConversionOptions()[1][0];
	private String k = labels.getDriverConversionOptions()[1][1];
	private String f = labels.getDriverConversionOptions()[1][2];
	
	//Initialize Strings with options of conversions (for Currency and Temperatures)
	private String[][] currencyConversionOptions = {
			{reais, " to ", dollars}, {reais, " to ", euros}, 
			{reais, " to ", libers}, {reais, " to ", yenes}, 
			{reais, " to ", wons}, {dollars, " to ", reais}, 
			{euros, " to ", reais}, {libers, " to ", reais}
			};
	
	private String[][] tempConversionOptions = {
			{c, " to ", k}, {c, " to ", f},
			{k, " to ", c}, {k, " to ", f},
			{f, " to ", c}, {f, " to ", k}
	};
	
	//Initialize variables to receive String[] from both Conversion options to make it able to display on a "InputDialog". 
	//These Strings were made this way to receive more easily data from labels class
	private String [] stringCurrencyConversionOptions = new String[8];
	private String [] stringTempConversionOptions = new String[6];
	
	//Method to concatenate Strings
	public void concatenateConversionOptions() {
		
		for(int i = 0; i<8; i++) {
			StringBuilder sbCoin = new StringBuilder();
			StringBuilder sbTemp = new StringBuilder();
			for(int j = 0; j<3; j++) {
				sbCoin.append(currencyConversionOptions[i][j]);
				if(i>5) continue;
				sbTemp.append(tempConversionOptions[i][j]);
			}
			stringCurrencyConversionOptions[i] = sbCoin.toString();
			if(i>5) continue;
			stringTempConversionOptions[i] = sbTemp.toString();
		}
	}
	
	//Method which calls the first dialog box, to user choose between conversion options, according to previously converterType chosen in main
	public String cvConvertionOptions(String chosenCoverterType) {
		
		//Concatenate Strings as method defined before
		this.concatenateConversionOptions();
		
		if(chosenCoverterType == labels.getDriverConverterOptions()[0]) {
			return (String) JOptionPane.showInputDialog(null, "Conversion Options", "Conversor BackEnd", JOptionPane.QUESTION_MESSAGE, null, this.stringCurrencyConversionOptions, null);
		}
		else {
			return (String) JOptionPane.showInputDialog(null, "Conversion Options", "Conversor BackEnd", JOptionPane.QUESTION_MESSAGE, null, this.stringTempConversionOptions, null);
		}
	}
	
	//Method which calls the second box to insert the value and return its value to variable in main
	public float currencyValueConverter() {
		String input = JOptionPane.showInputDialog("Inserted the value to be converted:");
	
		//	verifies inserted value, return when it is a number		
		while(true) {
			try {
				float returner = Float.parseFloat(input);
				return returner;
			} catch(NumberFormatException e){
				input = JOptionPane.showInputDialog("Value Must be a Number:");
			}
		}
	}
}
