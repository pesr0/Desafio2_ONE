package money_converter;

import javax.swing.JOptionPane;

public class CVOpenCloseChoices {
	
	AVLabels labels = new AVLabels();
	String[] converterOptions = labels.getDriverConverterOptions();
	
	public String firstChooser() {		
		return (String) JOptionPane.showInputDialog(null, "\"Choose the desired function:",  "BackEnd Converter", JOptionPane.QUESTION_MESSAGE, null, converterOptions, null);
	}
	
	public int keepGoin() {
		return JOptionPane.showConfirmDialog(null, "Continue?");
	}
	
	public void showsChoice(int continueProgram) {
		if (continueProgram == 1)
		JOptionPane.showMessageDialog(null, "Program Finished");
		else if (continueProgram == 2)
		JOptionPane.showMessageDialog(null, "Program Done");
		return;
	}
}
