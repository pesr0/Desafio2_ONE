package money_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MVConversionFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public MVConversionFrame() {
		
		//Make it able to reposition fields into the window frame
		getContentPane().setLayout(null);
		
		//Initialize object to receive constant String and label and a  variable to receive Converter Options
		AVLabels labels = new AVLabels();
		String[] converterOptions = labels.getDriverConverterOptions();
		//Object created to call convert methods from AVConvertClass
		AVConvertClass converter = new AVConvertClass();
		
		//Defines window frame size
		setSize(400,230); 
		//Disable window resizing by user
		setResizable(false);
		//By this line, when window frame shows up, it shows in screen center, not in right upper corner
		setLocationRelativeTo(null);
		//defines window title
		setTitle("Converter"); 
		
		//defines sizes of some fields inside the window frame
		int labelX = 30;
		int fieldX = 160;
		int inputY = 20;
		int outputY = 100;
		
		//Brings from MVConverterOptions the chosen labels 
		String chosenInputLabel = labels.getDriverInputLabel()[0];
		String chosenOutputLabel = labels.getDriverOutputLabel()[0];
		String[] convertionOption = labels.getDriverConversionOptions()[0];
		
		//Creates, positions, and define the size of labels for input field
		JLabel inputLabel = new JLabel(chosenInputLabel);
	    inputLabel.setBounds(labelX, inputY, 100, 30);
	    inputLabel.setHorizontalAlignment(JLabel.LEFT);
	    //Adds the field in the frame
	    getContentPane().add(inputLabel);
	     
	    
		//Creates, positions, and define the size of labels for input text field
		JTextField inputValueTextField = new JTextField(); 
	    inputValueTextField.setBounds(fieldX, inputY, 200, 30);
	    //Adds the field in the frame
	    getContentPane().add(inputValueTextField);
	    
	    //Creates, positions, and define the size of labels for output label
		JLabel outputLabel = new JLabel(chosenOutputLabel);
		outputLabel.setBounds(labelX, outputY, 150, 30);
		outputLabel.setHorizontalAlignment(JLabel.LEFT);
		//Adds the field in the frame
	    getContentPane().add(outputLabel);
	    
	    //Creates, positions, and define the size of labels for output text field
		JTextField outputValueTextField = new JTextField();
		outputValueTextField.setEditable(false);
	    outputValueTextField.setBounds(fieldX, outputY, 200, 30);
	    //Adds the field in the frame
	    getContentPane().add(outputValueTextField);
	    
	    
	    //Creates, positions and defines the size of label for Input ComboBox
		JLabel fromLabel = new JLabel("From: ");
		fromLabel.setBounds(50, 60, 40, 30);
		fromLabel.setHorizontalAlignment(JLabel.LEFT);
		//Adds the label to the window
	    getContentPane().add(fromLabel);
	    
	    //Adds combobox to the window which will give options of conversion to the user (input)
		JComboBox<String> inputType = new JComboBox<>(convertionOption);
		inputType.setBounds(90, 60, 70, 30);
		//adds the combobox to the window
		add(inputType);
		
		//Creates, positions and defines the size of label for Output ComboBox
		JLabel toLabel = new JLabel("To: ");
		toLabel.setBounds(175, 60, 25, 30);
		toLabel.setHorizontalAlignment(JLabel.LEFT);
		//Adds the label to the window
	    getContentPane().add(toLabel);
		
	    //Adds combobox to the window which will give options of conversion to the user (output)
	    JComboBox<String> outputType = new JComboBox<>(convertionOption); 
	    outputType.setBounds(200, 60, 70, 30);
	    //adds the combobox to the window
	    add(outputType);
	    
	    //Creates, positions and defines the size of the button to effectively convert the values
	    JButton convertButton = new JButton("Convert");
	    convertButton.setBounds(280, 60, 90, 30);
	    //Adds it to the window
	    getContentPane().add(convertButton);
	    
	    
	    //Creates, opsitions and defines the size of a combobox with options to change the converter
	    JComboBox<String> changeConverter = new JComboBox<>(converterOptions);
	    changeConverter.setBounds(50, 150, 130, 30);
	    //Add it to the window
	    add(changeConverter);
	    
	    //Creates, positions, and defines the size of a button to effectively change the converter
	    JButton changeButton = new JButton("Change Converter");
	    changeButton.setBounds(180, 150, 150, 30);
	    //Adds it to the window
	    getContentPane().add(changeButton);
	    
	    //Defines window behavior on close 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Adds a listener to the convetion button, when the button is clicked, the converted of value happen
		convertButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	
				String selectedInputType = (String) inputType.getSelectedItem();
				String selectedOutputType = (String) outputType.getSelectedItem();
		    	String insertedValue = inputValueTextField.getText();
		    	String converterType = (String) changeConverter.getSelectedItem();
		    	
		    	//The .changeValue method receives all the data collected and return the converted value
		    	String returnValue = converter.changeValue(selectedOutputType, selectedInputType, insertedValue, converterType);
		    	
		    	//insert the returned value in the output field
				outputValueTextField.setText(returnValue);

		    }
		});
	
		//adds a listener to change the converter, according to the combobox value
		changeButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	//gets the index of the combobox selected converter in the original ConverterOptions String. To facilitate the ralocations of labels, which will have the ame index
		    	//this line avoid "if" uses
		        int index = Arrays.asList(labels.getDriverConverterOptions()).indexOf((String) changeConverter.getSelectedItem());
		        
		        //Folowing to lines clears the text fields when the change happens
		        inputValueTextField.setText("");
		        outputValueTextField.setText("");
		        
		        //change labels content
		        inputLabel.setText(labels.getDriverInputLabel()[index]);
		        outputLabel.setText(labels.getDriverOutputLabel()[index]);
		        inputType.setModel(new DefaultComboBoxModel<>(labels.getDriverConversionOptions()[index]));
		        outputType.setModel(new DefaultComboBoxModel<>(labels.getDriverConversionOptions()[index]));

		    }
		});


	}
}
