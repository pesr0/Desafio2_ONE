package money_converter;

public class converter {

	
	public static void main(String[] args) {
		
		int continueProgramMain; //initialize variable which will control the loop
		
		do{
			String chosen = new OpenCloseChoices().firstChooser();
		
		switch(chosen){
			case "Conversor de Moeda":
				boxInputs mainBox = new boxInputs(); //creates object which will invoke dialog boxes
				String reference = mainBox.opcoesConversao(); //calls conversion options dialog
				if(reference==null) return; //stop program if cancel button is clicked
				float value = mainBox.currencyValueConverter(); // calls dialog box which the value will be inserted. also attribute that value to a string
				new boxConversion().moneyConversion(value, reference); //calls method which converts the initial value and display it
				break;
			
			case "Conversor de Horários":
				System.out.println("Conversos de Horários");
				break;
				
			case "new":
				NewConverterOptions conversionOption = new NewConverterOptions();
				NewConversionFrame windowFrame = new NewConversionFrame(conversionOption);
				windowFrame.setVisible(true);
				break;
				
		}
		
		continueProgramMain = new OpenCloseChoices().keepGoin(); //change the variable to get out of the loop if wanted
		new OpenCloseChoices().showsChoice(continueProgramMain); //shows final message
		}while(continueProgramMain == 0);
		
	
	}
		
} 