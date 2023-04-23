package money_converter;

import javax.swing.JOptionPane;

public class conversionClass {
	
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
