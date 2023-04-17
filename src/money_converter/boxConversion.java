package money_converter;

import javax.swing.JOptionPane;

public class boxConversion {
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
	
//	method which receives initial value to transform and display it into new converted value	
	public void moneyConversion(float value, String ref) {
		float reference;
		
		switch (ref){
			case "Reais p/ Dólares":
				reference=(float) (1.0/5.28);
				break;
			case "Dólares p/ Reais":
				reference=(float) 5.28;
				break;
			case "Reais p/ Euros":
				reference=(float) (1/5.64);
				break;
			case "Euros p/ Reais":
				reference= (float) 5.64;
				break;
			case "Reais p/ Libras":
				reference=(float) (1/6.43);
				break;
			case "Libras p/ Reais":
				reference=(float) 6.43;
				break;
			case "Reais p/ Yenes":
				reference=(float) (1/0.040);
				break;
			case "Reais p/ Won Coreano":
				reference=(float) (1/0.0041);
				break;
			default:
				reference=0;
		}
		String end = String.format("%.2f", reference*value); //format string to 2 decimal 
		JOptionPane.showMessageDialog(null, "O valor convertido de "+value+" em "+ref+" é de: "+end);
	}
	
	
}
