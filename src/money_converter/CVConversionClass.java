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
	private String c = labels.getDriverConversionOptions()[1][0];
	private String k = labels.getDriverConversionOptions()[1][1];
	private String f = labels.getDriverConversionOptions()[1][2];
	
//	method which receives initial value to transform and display it into new converted value	
	public void cvConversion(float value, String ref, String converterType) {
		String finalValue;
		String stringValue = Float.toString(value);
		
		if(converterType == labels.getDriverConverterOptions()[0]) {
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
		}
		else {
			switch (ref){
			case "°C to K":
				finalValue = convert.changeValue(k, c, stringValue, labels.getDriverConverterOptions()[1]);
				break;
			case "°C to °F":
				finalValue=convert.changeValue(f, c, stringValue, labels.getDriverConverterOptions()[1]);
				break;
			case "°F to °C":
				finalValue=convert.changeValue(c, f, stringValue, labels.getDriverConverterOptions()[1]);
				break;
			case "°F to K":
				finalValue= convert.changeValue(k, f, stringValue, labels.getDriverConverterOptions()[1]);
				break;
			case "K to °C":
				finalValue= convert.changeValue(c, k, stringValue, labels.getDriverConverterOptions()[1]);
				break;
			case "K to °F":
				finalValue=convert.changeValue(f, k, stringValue, labels.getDriverConverterOptions()[1]);
				break;
			default:
				finalValue="0";
		}
		}
		JOptionPane.showMessageDialog(null, "O valor convertido de "+value+" em "+ref+" é de: "+finalValue);
	}
}
