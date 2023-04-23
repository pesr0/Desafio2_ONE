package money_converter;

import javax.swing.JOptionPane;

public class NewConverterOptions {

	private String[] converterOptions = {"Coin Converter", "Time Converter"}; //set the list of options of conversion
	private String[] coins = {"USD", "BRL"};
	private String[] times = {"+1GMT", "+2GMT"};
	private String[] options;
	
	//opens a dialog where the user chooses the converter they want
	private String converterOptionChosen = (String) JOptionPane.showInputDialog(null, "Opcoes Conversao", "Conversor BackEnd", JOptionPane.QUESTION_MESSAGE, null, this.converterOptions, null);
	
	private String labelInput; //initialize the input label 
	private String labelOutput; //initialize output label

	{
		//If the coin converter is chosen these specific labels will be displayer
		if(this.converterOptionChosen.equals("Coin Converter")) {
			this.labelInput = "Original Value:";
			this.labelOutput = "Converted Value:";
			this.options = this.coins;
		}
		//if the time converter was chosen ....
		else if (this.converterOptionChosen.equals("Time Converter")) {
			this.labelInput = "Original Time:";
			this.labelOutput = "Converted Time:";
			this.options = this.times;
		}
	}
	
	public String[] getConverterOptions() {
		return this.converterOptions;
	}
	
	public String getInput() {
		return this.labelInput; //returns input label chosen
	}
	
	public String getOutput() {
		return this.labelOutput; //returns output label chosen
	}
	
	public String[] getOptions() {
		return this.options;
	}
}
