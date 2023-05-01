package money_converter;

/**
 * 
 * Class organized in the order:
 * Variables
 * Methods to get these variables
 * 
 * Other Variables
 * Other methods ....
 *
 */

public class AVLabels {
	private String[] driverConverterOptions = {"Currency Converter", "Temperature Converter"}; 
	private String[] driverConverterVersions = {"Challenge Version", "My Version"};
	
	public String[] getDriverConverterOptions() {
		return this.driverConverterOptions;
	}
	
	public String[] getDriverConverterVersions() {
		return this.driverConverterVersions;
	}
	
	
	
	private String[][] driverConversionOptions = {
			{"USD", "BRL", "EUR", "GBP", "JPY", "KRW"},
			{"°C", "K", "°F"}
	};
	
	public String[][] getDriverConversionOptions() {
		return driverConversionOptions;
	}

	
	
	private String[] driverInputLabel = {"Original Value: ", "Original Temp: "};
	private String[] driverOutputLabel = {"Converted Value: ","Converted Temp: "};
	
	public String[] getDriverInputLabel() {
		return this.driverInputLabel;
	}

	public String[] getDriverOutputLabel() {
		return this.driverOutputLabel;
	}
	
	
}
