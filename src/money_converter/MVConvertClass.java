package money_converter;

public class MVConvertClass {
	private String inputValue;
	private String outputValue;
	
	public void recieveInputValue(String value) {
		this.inputValue = value;
	}
	
	public void changeValue() {
		this.outputValue = this.inputValue;
	}
	
	public String giveOutputValue() {
		return this.outputValue;
	}
	
}
