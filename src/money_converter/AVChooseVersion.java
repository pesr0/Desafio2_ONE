package money_converter;

import javax.swing.JOptionPane;

public class AVChooseVersion {
	
	AVLabels labels = new AVLabels();
	
	private String[] versionOptions = labels.getConverterVersions(); //string with challenge version and my version from AVLabels
	
	
	public String getVersion() {
	return (String) JOptionPane.showInputDialog(null, "\"Choose the program version:",  "BackEnd Converter", JOptionPane.QUESTION_MESSAGE, null, this.versionOptions, null);
	}
}
