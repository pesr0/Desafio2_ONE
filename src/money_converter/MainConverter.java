package money_converter;

public class MainConverter {

	
	public static void main(String[] args) {
		
		AVLabels labels = new AVLabels();		
		
		String [] conversionOptions = labels.getConversionOptions();
		
		String version = new AVChooseVersion().getVersion(); 
		
		if(version == labels.getConverterVersions()[0]) { //challenge version program
			
			int continueProgramMain; //initialize variable which will control the loop
			do{
				String chosen = new CVOpenCloseChoices().firstChooser(conversionOptions);
			
			switch(chosen){
				case "Coin Converter":
					CVBoxInputs mainBox = new CVBoxInputs(); //creates object which will invoke dialog boxes
					String reference = mainBox.opcoesConversao(); //calls conversion options dialog
					if(reference==null) return; //stop program if cancel button is clicked
					float value = mainBox.currencyValueConverter(); // calls dialog box which the value will be inserted. also attribute that value to a string
					new TempConversionClass().moneyConversion(value, reference); //calls method which converts the initial value and display it
					break;
				
				case "Second Converter --In Progress--":
					System.out.println("test");
					break;
			}
			
			continueProgramMain = new CVOpenCloseChoices().keepGoin(); //change the variable to get out of the loop if wanted
			new CVOpenCloseChoices().showsChoice(continueProgramMain); //shows final message
			}while(continueProgramMain == 0);
		}
		
		else if (version == labels.getConverterVersions()[1]) { //evolved program
			
			MVConverterOptions converterOptions = new MVConverterOptions();
			converterOptions.makeOption(conversionOptions); //opens a dialog where the converter will be chosen
			MVConversionFrame windowFrame = new MVConversionFrame(converterOptions, conversionOptions); //creates the converter frame
			windowFrame.setVisible(true); //set the frame visible	
		}
	
	}
		
} 