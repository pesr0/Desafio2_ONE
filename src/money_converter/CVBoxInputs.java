package money_converter;

import javax.swing.JOptionPane;

public class CVBoxInputs {
	private String[] options = {"Reais p/ Dólares", "Reais p/ Euros", "Reais p/ Libras", "Reais p/ Yenes", "Reais p/ Won Coreano", "Dólares p/ Reais", "Euros p/ Reais", "Libras p/ Reais"};
	
	//	method which calls the first dialog box, with conversion options
	public String opcoesConversao() {
		return (String) JOptionPane.showInputDialog(null, "Opcoes Conversao", "Conversor BackEnd", JOptionPane.QUESTION_MESSAGE, null, this.options, null);
	}
	
//	method which calls the second box to insert the value and return its value
	public float currencyValueConverter() {
		String input = JOptionPane.showInputDialog("Insira o Valor Numerico a ser Convertido:");
	
//	verifies inserted value, return when it is a number		
		while(true) {
			try {
				float returner = Float.parseFloat(input);
				return returner;
			} catch(NumberFormatException e){
				input = JOptionPane.showInputDialog("O valor precisa ser um numero:");
			}
		}
	}
}
