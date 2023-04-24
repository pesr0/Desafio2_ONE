package money_converter;

public class Converter {

	
	public static void main(String[] args) {
		
		String [] converterOptions = {"Coin Converter", "TBD"};
		
		String version = new ChooseVersion().getVersion(); 
		
		if(version == "Challenge Version") { //challlenge proposed program
			
			int continueProgramMain; //initialize variable which will control the loop
			do{
				String chosen = new OpenCloseChoices().firstChooser(converterOptions);
			
			switch(chosen){
				case "Coin Converter":
					boxInputs mainBox = new boxInputs(); //creates object which will invoke dialog boxes
					String reference = mainBox.opcoesConversao(); //calls conversion options dialog
					if(reference==null) return; //stop program if cancel button is clicked
					float value = mainBox.currencyValueConverter(); // calls dialog box which the value will be inserted. also attribute that value to a string
					new conversionClass().moneyConversion(value, reference); //calls method which converts the initial value and display it
					break;
				
				case "TBD":
					System.out.println("TBD");
					break;
			}
			
			continueProgramMain = new OpenCloseChoices().keepGoin(); //change the variable to get out of the loop if wanted
			new OpenCloseChoices().showsChoice(continueProgramMain); //shows final message
			}while(continueProgramMain == 0);
		}
		
		else if (version == "Evolved Version") { //evolved program
			
			NewConverterOptions conversionOption = new NewConverterOptions();
			conversionOption.makeOption(converterOptions); //opena  dialog where the converter will be chosen
			NewConversionFrame windowFrame = new NewConversionFrame(conversionOption, converterOptions); //creates the converter frame
			windowFrame.setVisible(true); //set the frame visible
		}
	
	}
		
} 