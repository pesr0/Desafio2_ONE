package money_converter;

import javax.swing.JOptionPane;

public class MVConverterOptions {
	
	AVLabels labels = new AVLabels();

	private String[] coins = labels.getCoinsConversionOptions(); //brings coins conversion possibility
	private String[] scnd = labels.getScndConversionOptions(); //brings second converter possibilities
	private String[] options;
	private String labelInput; //initialize the input label 
	private String labelOutput; //initialize output label
	
	//opens a dialog where the user chooses the converter they want
	private String converterOptionChosen;
	
	public void makeOption(String[] converterOptions) {
		converterOptionChosen = (String) JOptionPane.showInputDialog(null, "Conversion Options", "BackEnd Converter", JOptionPane.QUESTION_MESSAGE, null, converterOptions, null);
	
		//If the coin converter is chosen these specific labels will be displayer
		if(this.converterOptionChosen.equals(labels.getConversionOptions()[0])) { //coin converter
			this.labelInput = "Original Value:";
			this.labelOutput = "Converted Value:";
			this.options = this.coins;
		}
		//if the time converter was chosen ....
		else if (this.converterOptionChosen.equals(labels.getConversionOptions()[1])) { //second converter
			this.labelInput = "Original scnd:";
			this.labelOutput = "Converted scnd:";
			this.options = this.scnd;
		}
	}

	public String getInput() {
		return this.labelInput; //returns input label chosen
	}
	
	public String getOutput() {
		return this.labelOutput; //returns output label chosen
	}
	
	public String[] getOptions() {
		return this.options; //return the options of conversion 
	}
}
