package money_converter;

public class AVLabels {
	private String[] driverConverterOptions = {"Coin Converter", "Second Converter --In Progress--"}; //mainConverter
	private String[] driverConverterVersions = {"Challenge Version", "My Version --In Progress--"}; //mainConverter & AVChooserVersion
	

	public String[] getDriverConverterOptions() { //mainConverter & AVChooserVersion
		return this.driverConverterOptions;
	}
	
	public String[] getDriverConverterVersions() { //mainConverter
		return this.driverConverterVersions;
	}
	
	
	
	private String[][] driverConversionOptions = {{"USD", "BRL", "EUR", "GBP", "JPY", "KRW"},{"OP1", "OP2"}}; //MVConverterOptions
	//private String[] driverScndConversionOptions = {"OP1", "OP2"}; //MVConverterOptions
	
	public String[][] getDriverConversionOptions() { //MVConverterOptions
		return driverConversionOptions;
	}

//	public String[] getDriverScndConversionOptions() { //MVConverterOptions
//		return driverScndConversionOptions;
//	}
	
	
	
	private String[] driverInputLabel = {"Original Value: ", "Original Sncd: "}; //MV ConverterOptions & MVConversionFrame
	private String[] driverOutputLabel = {"Converted Value: ","Converted Scnd: "}; //MV ConverterOptions & MVConversionFrame

	public String[] getDriverInputLabel() { //MV ConverterOptions & MVConversionFrame
		return this.driverInputLabel;
	}

	public String[] getDriverOutputLabel() { //MV ConverterOptions & MVConversionFrame
		return this.driverOutputLabel;
	}
	
	
}
