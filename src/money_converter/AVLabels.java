package money_converter;

public class AVLabels {
	
	private String[] conversionOptions = {"Coin Converter", "Second Converter --In Progress--"}; //mainConverter
	private String[] converterVersions = {"Challenge Version", "My Version --In Progress--"}; //mainConverter & AVChooserVersion
	
	public String[] getConversionOptions() { //mainConverter & AVChooserVersion
		return this.conversionOptions;
	}
	
	public String[] getConverterVersions() { //mainConverter
		return this.converterVersions;
	}
	
	
	private String[] coinsConversionOptions = {"USD", "BRL"}; //MVConverterOptions
	private String[] scndConversionOptions = {"OP1", "OP2"}; //MVConverterOptions
	
	public String[] getCoinsConversionOptions() { //MVConverterOptions
		return coinsConversionOptions;
	}

	public String[] getScndConversionOptions() { //MVConverterOptions
		return scndConversionOptions;
	}
	
	
	private String[] inputLabel = {"Original Value: ", "Original Sncd: "}; //MV ConverterOptions & MVConversionFrame
	private String[] outputLabel = {"Converted Value: ","Converted Scnd: "}; //MV ConverterOptions & MVConversionFrame

	public String[] getInputLabel() { //MV ConverterOptions & MVConversionFrame
		return this.inputLabel;
	}

	public String[] getOutputLabel() { //MV ConverterOptions & MVConversionFrame
		return this.outputLabel;
	}
	
	
}
