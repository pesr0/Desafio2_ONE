package money_converter;

public class AVLabels {
	private String[] driverConverterOptions = {"Coin Converter", "Temperature Converter"}; //mainConverter
	private String[] driverConverterVersions = {"Challenge Version", "My Version"}; //mainConverter & AVChooserVersion
	
	public String[] getDriverConverterOptions() { //mainConverter & AVChooserVersion
		return this.driverConverterOptions;
	}
	
	public String[] getDriverConverterVersions() { //mainConverter
		return this.driverConverterVersions;
	}
	
	
	
	private String[][] driverConversionOptions = {{"USD", "BRL", "EUR", "GBP", "JPY", "KRW"},{"°C", "K", "°F"}}; //MVConverterOptions
	
	public String[][] getDriverConversionOptions() { //MVConverterOptions
		return driverConversionOptions;
	}

	
	
	private String[] driverInputLabel = {"Original Value: ", "Original Temp: "}; //MV ConverterOptions & MVConversionFrame
	private String[] driverOutputLabel = {"Converted Value: ","Converted Temp: "}; //MV ConverterOptions & MVConversionFrame

	public String[] getDriverInputLabel() { //MV ConverterOptions & MVConversionFrame
		return this.driverInputLabel;
	}

	public String[] getDriverOutputLabel() { //MV ConverterOptions & MVConversionFrame
		return this.driverOutputLabel;
	}
	
	
}
