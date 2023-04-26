package money_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class MVConversionFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public MVConversionFrame(MVConverterOptions option, String[] converterOptions) {
		getContentPane().setLayout(null);
		
		AVLabels labels = new AVLabels();
		setSize(400,230); //defines window size
		setResizable(false); //disable window resizing
		setTitle("Converter"); //defines window title
		AVConvertClass exchange = new AVConvertClass();
		
		int labelX = 30;
		int fieldX = 160;
		int inputY = 20;
		int outputY = 100;
		
		JLabel inputLabel = new JLabel(option.getInput()); //value field title
	    inputLabel.setBounds(labelX, inputY, 100, 30); //defines size and position of input label field
	    inputLabel.setHorizontalAlignment(JLabel.LEFT); //defines position reference of input label
	    getContentPane().add(inputLabel); //adds input label to window
	     
		JTextField inputValueTextField = new JTextField(); //input value field 
	    inputValueTextField.setBounds(fieldX, inputY, 200, 30); //defines size and position of input value field
	    getContentPane().add(inputValueTextField); //adds input value field to window
	    
		JLabel outputLabel = new JLabel(option.getOutput()); //value field title
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
	    
		JComboBox<String> inputType = new JComboBox<>(option.getOptions()); //adds options of conversion
		inputType.setBounds(90, 60, 70, 30); //positions the option selection
		add(inputType); //adds the combobox to the window
		
		JLabel toLabel = new JLabel("To: "); //To title
		toLabel.setBounds(175, 60, 25, 30); //defines size and position of To label
		toLabel.setHorizontalAlignment(JLabel.LEFT); //defines position reference of To label
	    getContentPane().add(toLabel); //adds To label to window
		
	    JComboBox<String> outputType = new JComboBox<>(option.getOptions()); //adds options of conversion
	    outputType.setBounds(200, 60, 70, 30); //positions the option selection
	    add(outputType); //adds the combobox to the window
	    
	    
	    
	    JComboBox<String> changeConverter = new JComboBox<>(converterOptions); //adds the type of convertion selection
	    changeConverter.setBounds(50, 150, 130, 30); //resize and reposition it 
	    add(changeConverter); //add it to the window
	    
	    JButton changeButton = new JButton("Change Converter"); //creates a button which will be abblt to change the converter
	    changeButton.setBounds(180, 150, 150, 30); //resize and reposition it 
	    getContentPane().add(changeButton); //adds it to the window
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //defines window behavior on close 
		
		inputValueTextField.getDocument().addDocumentListener(new DocumentListener() { //listener to when the textfield is changed
		    public void changedUpdate(DocumentEvent e) {
		    	//not implemented
		    }
		    public void removeUpdate(DocumentEvent e) {
				exchange.recieveInputValue(inputValueTextField.getText()); //pass the field value to the new class
				exchange.changeValue(); //method to change the value passed
				outputValueTextField.setText(exchange.giveOutputValue()); //return the value changed to new output field
		    }
		    public void insertUpdate(DocumentEvent e) {
				exchange.recieveInputValue(inputValueTextField.getText());
				exchange.changeValue();
				outputValueTextField.setText(exchange.giveOutputValue());
		    }
		});
	
		changeButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String temp = (String) changeConverter.getSelectedItem();
		        if (temp == labels.getConversionOptions()[0]) {
		        	inputLabel.setText(labels.getInputLabel()[0]);
		        	outputLabel.setText(labels.getOutputLabel()[0]);
		        	inputType.setModel(new DefaultComboBoxModel<>(labels.getCoinsConversionOptions()));
		        	outputType.setModel(new DefaultComboBoxModel<>(labels.getCoinsConversionOptions()));
		        	
		        	
		        }
		        if (temp == labels.getConversionOptions()[1]) {
		        	inputLabel.setText(labels.getInputLabel()[1]);
		        	outputLabel.setText(labels.getOutputLabel()[1]);
		        	inputType.setModel(new DefaultComboBoxModel<>(labels.getScndConversionOptions()));
		        	outputType.setModel(new DefaultComboBoxModel<>(labels.getScndConversionOptions()));
		        }
		    }
		});


	}
}
