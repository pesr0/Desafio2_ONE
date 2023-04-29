package money_converter;

import java.io.*;
import okhttp3.*;

public class AVConvertClass {	
	  public void convert(String to, String from, String amount) throws IOException{
	    OkHttpClient client = new OkHttpClient().newBuilder().build();

	    Request request = new Request.Builder()
	      .url("https://api.apilayer.com/exchangerates_data/convert?to="+to+"&from="+from+"&amount="+amount)
	      .addHeader("apikey", "UfdsZM4WAp3yQxZSef1nmgPPhFXurftr")
	      .method("GET", null)
	      .build();
	    Response response = client.newCall(request).execute();
	    System.out.println(response.body().string());
		}
	
	
	private String inputValue;
	private String outputValue;
	private String enterType;
	private String exitType;
	
	
	public void recieveInputValue(String value, String inputType, String outputType) {
		this.inputValue = value;
		this.enterType = inputType;
		this.exitType = outputType;
	}
	
	public void changeValue() {
		
	}
	
	public String giveOutputValue() {
		return this.outputValue;
	}
	
}
