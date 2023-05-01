package money_converter;

import javax.swing.JOptionPane;

public class CVBoxInputs {
	private AVLabels labels = new AVLabels();
	private String dollars = labels.getDriverConversionOptions()[0][0];
	private String reais = labels.getDriverConversionOptions()[0][1];
	private String euros = labels.getDriverConversionOptions()[0][2];
	private String libers = labels.getDriverConversionOptions()[0][3];
	private String yenes = labels.getDriverConversionOptions()[0][4];
	private String wons = labels.getDriverConversionOptions()[0][5];
	private String c = labels.getDriverConversionOptions()[1][0];
	private String k = labels.getDriverConversionOptions()[1][1];
	private String f = labels.getDriverConversionOptions()[1][2];
	
	
	private String[][] currencyConversionOptions = {
			{reais, " p/ ", dollars}, {reais, " p/ ", euros}, 
			{reais, " p/ ", libers}, {reais, " p/ ", yenes}, 
			{reais, " p/ ", wons}, {dollars, " p/ ", reais}, 
			{euros, " p/ ", reais}, {libers, " p/ ", reais}
			};
	
	private String[][] tempConversionOptions = {
			{c, " to ", k}, {c, " to ", f},
			{k, " to ", c}, {k, " to ", f},
			{f, " to ", c}, {f, " to ", k}
	};
	
	private String [] stringCurrencyConversionOptions = new String[8];
	private String [] stringTempConversionOptions = new String[6];
	
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
	
	//	method which calls the first dialog box, with conversion options
	public String cvConvertionOptions(String chosenCoverterType) {
		this.concatenateConversionOptions();
		if(chosenCoverterType == labels.getDriverConverterOptions()[0]) {
			return (String) JOptionPane.showInputDialog(null, "Conversion Options", "Conversor BackEnd", JOptionPane.QUESTION_MESSAGE, null, this.stringCurrencyConversionOptions, null);
		}
		else {
			return (String) JOptionPane.showInputDialog(null, "Conversion Options", "Conversor BackEnd", JOptionPane.QUESTION_MESSAGE, null, this.stringTempConversionOptions, null);
		}
	}
	
//	method which calls the second box to insert the value and return its value
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
