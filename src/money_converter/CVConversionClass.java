package money_converter;

import javax.swing.JOptionPane;
/**
 * 
 * This block of codes also got little "textier" than desired, but again, the original propose of the challenge demanded it
 *
 */
public class CVConversionClass {
	//Initialize objects to make conversions (convert) and a object to get constant labels and strings 
	AVConvertClass convert = new AVConvertClass();
	AVLabels labels = new AVLabels();
	
	//Initialize and defines variables with String values for the valueTypes, to facilitate the entire "union"/"Synergy" of the program and the classes
	private String dollars = labels.getDriverConversionOptions()[0][0];
	private String reais = labels.getDriverConversionOptions()[0][1];
	private String euros = labels.getDriverConversionOptions()[0][2];
	private String libers = labels.getDriverConversionOptions()[0][3];
	private String yenes = labels.getDriverConversionOptions()[0][4];
	private String wons = labels.getDriverConversionOptions()[0][5];
	private String celsius = labels.getDriverConversionOptions()[1][0];
	private String kelvin = labels.getDriverConversionOptions()[1][1];
	private String fahrenheit = labels.getDriverConversionOptions()[1][2];
	
	//Method which receives initial value to transform and display it into new converted value, this method uses the converters method form AVConvertClass
	//Receives as one of the parameters the converterType, which will define the conversion to be executed
	public void cvConversion(float valueReceived, String referenceConversionType, String converterType) {
		
		//finalValue will receive the value to be showed in final dialog box
		String finalValue;
		//this method transform float to string for the method in AVConvertClass to convert correctly
		String stringValue = Float.toString(valueReceived);
		
		//Conversion of Currencies block
		if(converterType.equals(labels.getDriverConverterOptions()[0])) {
			switch (referenceConversionType){
				case "BRL to USD":
					finalValue = convert.changeValue(dollars, reais, stringValue, labels.getDriverConverterOptions()[0]);
					break;
				case "USD to BRL":
					finalValue=convert.changeValue(reais, dollars, stringValue, labels.getDriverConverterOptions()[0]);
					break;
				case "BRL to EUR":
					finalValue=convert.changeValue(euros, reais, stringValue, labels.getDriverConverterOptions()[0]);
					break;
				case "EUR to BRL":
					finalValue= convert.changeValue(reais, euros, stringValue, labels.getDriverConverterOptions()[0]);
					break;
				case "BRL to GBR":
					finalValue= convert.changeValue(libers, reais, stringValue, labels.getDriverConverterOptions()[0]);
					break;
				case "GBR to BRL":
					finalValue=convert.changeValue(reais, libers, stringValue, labels.getDriverConverterOptions()[0]);
					break;
				case "BRL to JPY":
					finalValue=convert.changeValue(yenes, reais, stringValue, labels.getDriverConverterOptions()[0]);
					break;
				case "BRL to KRW":
					finalValue=convert.changeValue(wons, reais, stringValue, labels.getDriverConverterOptions()[0]);
					break;
				default:
					finalValue="0";
			}
		}
		//Conversion of Temperatures
		else {
			switch (referenceConversionType){
			case "°C to K":
				finalValue = convert.changeValue(kelvin, celsius, stringValue, labels.getDriverConverterOptions()[1]);
				break;
			case "°C to °F":
				finalValue=convert.changeValue(fahrenheit, celsius, stringValue, labels.getDriverConverterOptions()[1]);
				break;
			case "°F to °C":
				finalValue=convert.changeValue(celsius, fahrenheit, stringValue, labels.getDriverConverterOptions()[1]);
				break;
			case "°F to K":
				finalValue= convert.changeValue(kelvin, fahrenheit, stringValue, labels.getDriverConverterOptions()[1]);
				break;
			case "K to °C":
				finalValue= convert.changeValue(celsius, kelvin, stringValue, labels.getDriverConverterOptions()[1]);
				break;
			case "K to °F":
				finalValue=convert.changeValue(fahrenheit, kelvin, stringValue, labels.getDriverConverterOptions()[1]);
				break;
			default:
				finalValue="0";
		}
		}
		
		//Creates a dialog box to show the result of the conversion
		JOptionPane.showMessageDialog(null, "O valor convertido de "+valueReceived+" em "+referenceConversionType+" é de: "+finalValue);
	}
}
