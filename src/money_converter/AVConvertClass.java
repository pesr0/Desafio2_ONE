package money_converter;

import java.io.*;
import okhttp3.*;
import org.json.JSONObject;

public class AVConvertClass {
	
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
	
	
	public String changeValue(String to, String from, String amount) {
		try {
			this.convert(to, from, amount);
			System.out.println(this.resultConversion);
			
		}
		catch (IOException e) {
			System.out.println("Exception Error");
			return "ERROR, TRY AGAIN";
		}
		
		return Double.toString(resultConversion);
	}
	
}
