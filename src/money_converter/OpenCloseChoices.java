package money_converter;

import javax.swing.JOptionPane;

public class OpenCloseChoices {
	private String[] firstOptions = {"Conversor de Moeda", "TBD" };
	
	public String firstChooser() {		
		return (String) JOptionPane.showInputDialog(null, "\"Escolha a função desejada:",  "BackEnd Converter", JOptionPane.QUESTION_MESSAGE, null, this.firstOptions, null);
	}
	
	public int keepGoin() {
		return JOptionPane.showConfirmDialog(null, "Deseja Continuar?");
	}
	
	public void showsChoice(int continueProgram) {
		if (continueProgram == 1)
		JOptionPane.showMessageDialog(null, "Programa Finalizado");
		else if (continueProgram == 2)
		JOptionPane.showMessageDialog(null, "Programa Concluido");
		return;
	}
}
