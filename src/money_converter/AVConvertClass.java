package money_converter;

import java.io.*;
import okhttp3.*;
import org.json.JSONObject;

public class AVConvertClass {
	
	//Initialize object to reference labels 
	AVLabels labels = new AVLabels();
	
	//Initialize variable to store the conversion result of currency conversion
	private double resultConversion;
	
	//Method to convert currency values, from API "Exchange Rates Data"
	public void convert(String to, String from, String amount) throws IOException{
	    OkHttpClient client = new OkHttpClient().newBuilder().build();

	    Request request = new Request.Builder()
	      .url("https://api.apilayer.com/exchangerates_data/convert?to="+to+"&from="+from+"&amount="+amount)
	      .addHeader("apikey", "UfdsZM4WAp3yQxZSef1nmgPPhFXurftr")
	      .method("GET", null)
	      .build();
	    Response response = client.newCall(request).execute();
	    String jsonString=response.body().string();
	    JSONObject jsonObject = new JSONObject(jsonString);
	    this.resultConversion = jsonObject.getDouble("result");
	}
	
	//Method to convert temperature values
	public String convertTemp(String to, String from, String amount) {
		double dAmount = Double.parseDouble(amount);
		if(from.equals("°C")) {
			dAmount = dAmount + 273.15;
		}
		else if(from.equals("°F")) {
			dAmount = (dAmount-32)*5/9+273.15;
		}
		
		if(to.equals("K")) {
			return Double.toString(dAmount);
		}
		else if(to.equals("°C")) {
			return Double.toString(dAmount - 273.15);
		}
		else {
			return Double.toString(dAmount-273.15*9/5+32); 
		}
	}
	
	//Method which receives values which will be converted. This method choose between both converters (Currency Converter and Temperature Converter) with the variable "converterType"
	public String changeValue(String to, String from, String amount, String converterType) {
		
		if(converterType.equals(labels.getDriverConverterOptions()[0])) {
			try {
				this.convert(to, from, amount);
				return Double.toString(resultConversion);
				
			}
			catch (IOException e) {
				return "ERROR, TRY AGAIN";
			}
		}
		else {
			return this.convertTemp(to, from, amount);
		}
	}
	
}
