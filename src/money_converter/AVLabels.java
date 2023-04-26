package money_converter;

public class AVLabels {
	
	private String[] conversionOptions = {"Coin Converter", "Second Converter"}; //mainConverter
	private String[] converterVersions = {"Challenge Version", "My Version"}; //mainConverter & AVChooserVersion
	
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
	
	
}
