package money_converter;

import java.io.*;
import okhttp3.*;
import org.json.JSONObject;

public class AVConvertClass {
	
	AVLabels labels = new AVLabels();
	private double resultConversion;
	
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
	
	public String convertTemp(String to, String from, String amount) {
		double dAmount = Double.parseDouble(amount);
		if(from == "°C") {
			dAmount = dAmount + 273.15;
		}
		else if(from == "°F") {
			dAmount = (dAmount-32)*5/9+273.15;
		}
		
		if(to == "K") {
			return Double.toString(dAmount);
		}
		else if(to =="°C") {
			return Double.toString(dAmount - 273.15);
		}
		else {
			return Double.toString(dAmount-273.15*9/5+32); 
		}
	}
	
	public String changeValue(String to, String from, String amount, String converterType) {
		
		if(converterType == labels.getDriverConverterOptions()[0]) {
			try {
				this.convert(to, from, amount);
				System.out.println(this.resultConversion);
				return Double.toString(resultConversion);
				
			}
			catch (IOException e) {
				System.out.println("Exception Error");
				return "ERROR, TRY AGAIN";
			}
		}
		else {
			return this.convertTemp(to, from, amount);
		}
	}
	
}
