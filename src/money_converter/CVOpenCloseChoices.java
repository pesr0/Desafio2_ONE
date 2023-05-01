package money_converter;

import javax.swing.JOptionPane;

public class CVOpenCloseChoices {
	
	//Initialize objecto to receive constant labels and String
	AVLabels labels = new AVLabels();
	
	//String variable to get converter Options ("Currency Converter" or "Temperature Converter") from labels
	String[] converterOptions = labels.getDriverConverterOptions();
	
	//Creates dialog to return chosen converter option
	public String firstChooser() {		
		return (String) JOptionPane.showInputDialog(null, "\"Choose the desired function:",  "BackEnd Converter", JOptionPane.QUESTION_MESSAGE, null, this.converterOptions, null);
	}
	
	//Creates Dialog to confirm program continuation
	public int keepGoin() {
		return JOptionPane.showConfirmDialog(null, "Continue?");
	}
	
	//Method to show if te program as whether finalized or don't
	public void showsChoice(int continueProgram) {
		if (continueProgram == 1)
		JOptionPane.showMessageDialog(null, "Program Finished");
		else if (continueProgram == 2)
		JOptionPane.showMessageDialog(null, "Program Done");
		return;
	}
}
