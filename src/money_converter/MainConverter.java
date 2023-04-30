package money_converter;

public class MainConverter {

	
	public static void main(String[] args) {
		
		AVLabels labels = new AVLabels();		
		
		String version = new AVChooseVersion().getVersion(); 
		
		if(version == labels.getDriverConverterVersions()[0]) { //challenge version program
			
			int continueProgramMain; //initialize variable which will control the loop
			do{
				String chosenCoversionType = new CVOpenCloseChoices().firstChooser();
			
			switch(chosenCoversionType){
				case "Coin Converter":
					CVBoxInputs mainBox = new CVBoxInputs(); //creates object which will invoke dialog boxes
					String chosenConvertionOption = mainBox.cvConvertionOptions(); //calls conversion options dialog
					if(chosenConvertionOption==null) return; //stop program if cancel button is clicked
					float value = mainBox.currencyValueConverter(); // calls dialog box which the value will be inserted. also attribute that value to a string
					new CVConversionClass().cvConversion(value, chosenConvertionOption, chosenCoversionType); //calls method which converts the initial value and display it
					break;
				
				case "Temperature Converter":
					System.out.println("test");
					break;
			}
			
			continueProgramMain = new CVOpenCloseChoices().keepGoin(); //change the variable to get out of the loop if wanted
			new CVOpenCloseChoices().showsChoice(continueProgramMain); //shows final message
			}while(continueProgramMain == 0);
		}
		
		else if (version == labels.getDriverConverterVersions()[1]) { //my version program
			MVConversionFrame windowFrame = new MVConversionFrame(); //creates the converter frame
			windowFrame.setVisible(true); //set the frame visible
		}
	
	}
		
} 