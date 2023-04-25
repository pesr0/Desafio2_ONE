package money_converter;

public class MainConverter {

	
	public static void main(String[] args) {
		
		String [] converterOptions = {"Coin Converter", "TBD"};
		
		String version = new AVChooseVersion().getVersion(); 
		
		if(version == "Challenge Version") { //challenge proposed program
			
			int continueProgramMain; //initialize variable which will control the loop
			do{
				String chosen = new CVOpenCloseChoices().firstChooser(converterOptions);
			
			switch(chosen){
				case "Coin Converter":
					CVBoxInputs mainBox = new CVBoxInputs(); //creates object which will invoke dialog boxes
					String reference = mainBox.opcoesConversao(); //calls conversion options dialog
					if(reference==null) return; //stop program if cancel button is clicked
					float value = mainBox.currencyValueConverter(); // calls dialog box which the value will be inserted. also attribute that value to a string
					new TempConversionClass().moneyConversion(value, reference); //calls method which converts the initial value and display it
					break;
				
				case "TBD":
					System.out.println("TBD");
					break;
			}
			
			continueProgramMain = new CVOpenCloseChoices().keepGoin(); //change the variable to get out of the loop if wanted
			new CVOpenCloseChoices().showsChoice(continueProgramMain); //shows final message
			}while(continueProgramMain == 0);
		}
		
		else if (version == "Evolved Version") { //evolved program
			
			MVConverterOptions conversionOption = new MVConverterOptions();
			conversionOption.makeOption(converterOptions); //opens a dialog where the converter will be chosen
			MVConversionFrame windowFrame = new MVConversionFrame(conversionOption, converterOptions); //creates the converter frame
			windowFrame.setVisible(true); //set the frame visible	
		}
	
	}
		
} 