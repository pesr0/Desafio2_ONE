package money_converter;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MVConverterOptions {
	
	AVLabels labels = new AVLabels();

	private String[] chosenConvertionOptions;
	private String chosenLabelInput; //initialize the input label 
	private String chosenLabelOutput; //initialize output label
	private String[][] importedConversionOptions = labels.getDriverConversionOptions(); //brings coins conversion possibility
	//private String[] importedScndConversionOptions = labels.getDriverScndConversionOptions(); //brings second converter possibilities
	
	//opens a dialog where the user chooses the converter they want
	private String converterOptionChosen;
	
	public void chooseConverter() {
		String[] converterOptions = labels.getDriverConverterOptions();
		converterOptionChosen = (String) JOptionPane.showInputDialog(null, "Conversion Options", "BackEnd Converter", JOptionPane.QUESTION_MESSAGE, null, converterOptions, null);
		
		int index = Arrays.asList(converterOptions).indexOf(converterOptionChosen);
		//If the coin converter is chosen these specific labels will be displayer
			this.chosenLabelInput = labels.getDriverInputLabel()[index];
			this.chosenLabelOutput = labels.getDriverOutputLabel()[index];
			this.chosenConvertionOptions = importedConversionOptions[index]; //brings conversion possibility

	}

	public String getChosenInputLabel() {
		return this.chosenLabelInput; //returns input label chosen
	}
	
	public String getChosenOutputLabel() {
		return this.chosenLabelOutput; //returns output label chosen
	}
	
	public String[] getChosenConvertionOptions() {
		return this.chosenConvertionOptions; //return the options of conversion 
	}
}
