package money_converter;

import javax.swing.JOptionPane;

public class ChooseVersion {
	private String[] versionOptions = {"Challenge Version", "Evolved Version"};
	
	
	public String getVersion() {
	return (String) JOptionPane.showInputDialog(null, "\"Escolha a função desejada:",  "BackEnd Converter", JOptionPane.QUESTION_MESSAGE, null, this.versionOptions, null);
	}
}
