package money_converter;

import javax.swing.JOptionPane;

public class CVConversionClass {
	
	AVConvertClass convert = new AVConvertClass();
	AVLabels labels = new AVLabels();
	private String dollars = labels.getDriverConversionOptions()[0][0];
	private String reais = labels.getDriverConversionOptions()[0][1];
	private String euros = labels.getDriverConversionOptions()[0][2];
	private String libers = labels.getDriverConversionOptions()[0][3];
	private String yenes = labels.getDriverConversionOptions()[0][4];
	private String wons = labels.getDriverConversionOptions()[0][5];
	
//	method which receives initial value to transform and display it into new converted value	
	public void cvConversion(float value, String ref, String conversionType) {
		String finalValue;
		String stringValue = Float.toString(value);
		switch (ref){
			case "BRL p/ USD":
				finalValue = convert.changeValue(dollars, reais, stringValue, labels.getDriverConverterOptions()[0]);
				break;
			case "USD p/ BRL":
				finalValue=convert.changeValue(reais, dollars, stringValue, labels.getDriverConverterOptions()[0]);
				break;
			case "BRL p/ EUR":
				finalValue=convert.changeValue(euros, reais, stringValue, labels.getDriverConverterOptions()[0]);
				break;
			case "EUR p/ BRL":
				finalValue= convert.changeValue(reais, euros, stringValue, labels.getDriverConverterOptions()[0]);
				break;
			case "BRL p/ GBR":
				finalValue= convert.changeValue(libers, reais, stringValue, labels.getDriverConverterOptions()[0]);
				break;
			case "GBR p/ BRL":
				finalValue=convert.changeValue(reais, libers, stringValue, labels.getDriverConverterOptions()[0]);
				break;
			case "BRL p/ JPY":
				finalValue=convert.changeValue(yenes, reais, stringValue, labels.getDriverConverterOptions()[0]);
				break;
			case "BRL p/ KRW":
				finalValue=convert.changeValue(wons, reais, stringValue, labels.getDriverConverterOptions()[0]);
				break;
			default:
				finalValue="0";
		}
		JOptionPane.showMessageDialog(null, "O valor convertido de "+value+" em "+ref+" é de: "+finalValue);
	}
}
