package money_converter;

import javax.swing.JOptionPane;

public class AVChooseVersion {
	
	//Initialize object to control labels and choices
	AVLabels labels = new AVLabels(); 
	
	//string with challenge version and my version from AVLabels
	private String[] versionOptions = labels.getDriverConverterVersions(); 
	
	//Method to receive from user the chosen version of the program
	public String getVersion() {
	return (String) JOptionPane.showInputDialog(null, "\"Choose the program version:",  "BackEnd Converter", JOptionPane.QUESTION_MESSAGE, null, this.versionOptions, null);
	}
}
