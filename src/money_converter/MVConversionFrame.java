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
		getContentPane().setLayout(null);
		
		AVLabels labels = new AVLabels();
		String[] converterOptions = labels.getDriverConverterOptions();
		
		setSize(400,230); //defines window size
		setResizable(false); //disable window resizing
		setLocationRelativeTo(null);
		setTitle("Converter"); //defines window title
		AVConvertClass converter = new AVConvertClass();
		
		//defines sizes of frames/windows
		int labelX = 30;
		int fieldX = 160;
		int inputY = 20;
		int outputY = 100;
		
		String chosenInputLabel = labels.getDriverInputLabel()[0]; //brings of MVConverterOptions Inputs Labels
		String chosenOutputLabel = labels.getDriverOutputLabel()[0]; //brings of MVConverterOptions Output Labels
		String[] convertionOption = labels.getDriverConversionOptions()[0]; //brings of MVConverterOptions Convertion Option
		
		JLabel inputLabel = new JLabel(chosenInputLabel); //value field title
	    inputLabel.setBounds(labelX, inputY, 100, 30); //defines size and position of input label field
	    inputLabel.setHorizontalAlignment(JLabel.LEFT); //defines position reference of input label
	    getContentPane().add(inputLabel); //adds input label to window
	     
		JTextField inputValueTextField = new JTextField(); //input value field 
	    inputValueTextField.setBounds(fieldX, inputY, 200, 30); //defines size and position of input value field
	    getContentPane().add(inputValueTextField); //adds input value field to window
	    
		JLabel outputLabel = new JLabel(chosenOutputLabel); //value field title
		outputLabel.setBounds(labelX, outputY, 150, 30); //defines size and position of input output field
		outputLabel.setHorizontalAlignment(JLabel.LEFT); //defines position reference of output label
	    getContentPane().add(outputLabel); //adds output label to window

		JTextField outputValueTextField = new JTextField(); //output value field 
	    outputValueTextField.setBounds(fieldX, outputY, 200, 30); //defines size and position of output value field
	    getContentPane().add(outputValueTextField); //adds output value field to window
	    
	    
	    
		JLabel fromLabel = new JLabel("From: "); //From title
		fromLabel.setBounds(50, 60, 40, 30); //defines size and position of from label
		fromLabel.setHorizontalAlignment(JLabel.LEFT); //defines position reference of from label
	    getContentPane().add(fromLabel); //adds from label to window
	    
		JComboBox<String> inputType = new JComboBox<>(convertionOption); //adds options of conversion
		inputType.setBounds(90, 60, 70, 30); //positions the option selection
		add(inputType); //adds the combobox to the window
		
		JLabel toLabel = new JLabel("To: "); //To title
		toLabel.setBounds(175, 60, 25, 30); //defines size and position of To label
		toLabel.setHorizontalAlignment(JLabel.LEFT); //defines position reference of To label
	    getContentPane().add(toLabel); //adds To label to window
		
	    JComboBox<String> outputType = new JComboBox<>(convertionOption); //adds options of conversion
	    outputType.setBounds(200, 60, 70, 30); //positions the option selection
	    add(outputType); //adds the combobox to the window
	    
	    JButton convertButton = new JButton("Convert"); //creates a button which will convert values
	    convertButton.setBounds(280, 60, 90, 30); //resize and reposition it 
	    getContentPane().add(convertButton); //adds it to the window
	    
	    

	    JComboBox<String> changeConverter = new JComboBox<>(converterOptions); //adds the type of convertion selection
	    changeConverter.setBounds(50, 150, 130, 30); //resize and reposition it 
	    add(changeConverter); //add it to the window
	    
	    JButton changeButton = new JButton("Change Converter"); //creates a button which will be abblt to change the converter
	    changeButton.setBounds(180, 150, 150, 30); //resize and reposition it 
	    getContentPane().add(changeButton); //adds it to the window
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //defines window behavior on close 
		
		convertButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				//converter.recieveInputValue(inputValueTextField.getText(),(String) inputType.getSelectedItem(),(String) outputType.getSelectedItem()); //pass the field value to the new class
				String selectedInputType = (String) inputType.getSelectedItem();
				String selectedOutputType = (String) outputType.getSelectedItem();
		    	String insertedValue = inputValueTextField.getText();
		    	String converterType = (String) changeConverter.getSelectedItem();
		    	String returnValue = converter.changeValue(selectedOutputType, selectedInputType, insertedValue, converterType); //method to change the value passed
				outputValueTextField.setText(returnValue); //return the value changed to new output field

		    }
		});
	
		changeButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        int index = Arrays.asList(labels.getDriverConverterOptions()).indexOf((String) changeConverter.getSelectedItem());
		        inputValueTextField.setText("");
		        outputValueTextField.setText("");
		        inputLabel.setText(labels.getDriverInputLabel()[index]);
		        outputLabel.setText(labels.getDriverOutputLabel()[index]);
		        inputType.setModel(new DefaultComboBoxModel<>(labels.getDriverConversionOptions()[index]));
		        outputType.setModel(new DefaultComboBoxModel<>(labels.getDriverConversionOptions()[index]));

		    }
		});


	}
}
