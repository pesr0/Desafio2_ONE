package money_converter;

public class MainConverter {

	
	public static void main(String[] args) {
		/**
		 * converterVersion = "Challenge Version"(CV) or "My Version"(MV)
		 * converterOptions = "Currency Converter" or "Temperature Converter"
		 * conversionOptions = "USD, EUR, BRL, etc." or "°C, °F, K"
		 * Labels = "Value" or "Temp" 
		 * 
		 * labels = variable which refers to class which control majority of labels and Strings in program
		 * version = variable which receives a (String) version of the program version (That is: "Challenge Version" or "My Version")
		 * continueProgramMain = variable which changes between 0 and 1 to control loop of CHhalange Version Program
		 * chosenConverterType = variable to receive the converter type (Temperature Converter, Currency Converter)
		 * mainBox = object to control boxes frames to choose conversion types
		 * chosenConvertionOption = variable to receive the option of conversion (USD to BRL, USD to EUR, etc; OR K to °C, °F to °C, etc.)
		 * value = variable to receive the numeric amount to be converted
		 * windowsFrame = defines frame of "My Version" program
		 */
		
		//Initialize object reference to labels
		AVLabels labels = new AVLabels(); 
		//Initialize object to choose between versions
		String version = new AVChooseVersion().getVersion(); 
		//Initialize object to control choices
		CVOpenCloseChoices choices = new CVOpenCloseChoices();
		
		//"Challenge Version" program
		if(version == labels.getDriverConverterVersions()[0]) { 
			
			int controlLoop;
			do{
				String chosenCoverterType = choices.firstChooser();
				CVBoxInputs mainBox = new CVBoxInputs();
				String chosenConvertionOption = mainBox.cvConvertionOptions(chosenCoverterType);
				
				//stop program if cancel button is clicked
				if(chosenConvertionOption==null) return; 
				
				//calls dialog box which the value will be inserted. also attribute that value to a string
				float value = mainBox.currencyValueConverter();
				
				//calls method which converts the initial value and display it
				new CVConversionClass().cvConversion(value, chosenConvertionOption, chosenCoverterType); 
				
				//change the variable to get out of the loop if wanted
				controlLoop = choices.keepGoin();
				
				//shows final message with the final result
				choices.showsChoice(controlLoop); 
			}while(controlLoop == 0);
		}
		
		//"My Version" program
		else if (version == labels.getDriverConverterVersions()[1]) { 
			
			//Creates the converter frame
			MVConversionFrame windowFrame = new MVConversionFrame();
			windowFrame.setVisible(true);
		}
	
	}
		
} 