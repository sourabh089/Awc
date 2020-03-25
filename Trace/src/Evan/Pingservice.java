package Evan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;

public class Pingservice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	try {
		JSONObject request_json = new JSONObject();
		request_json.put("PONumber", "gross");
		request_json.put("ChallanNumber", "asd");
		String outputJSON = callWebService(	"http://192.168.1.61:5000/consume",request_json.toString());
		System.out.println(outputJSON);

		} catch (JSONException ex) {
		System.out.println(ex);
		}
	}
	
	public static String callWebService(String serviceURL, String inputJSON) {
		String outputJSON = "";
		System.out.println("Input JSON.... " +inputJSON );
		try {
		URL url = new URL(serviceURL);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json");
		
		OutputStream os = conn.getOutputStream();
		os.write(inputJSON.getBytes());
		os.flush();
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		outputJSON = br.readLine();
		System.out.println("Output JSON.... " + outputJSON);
		} catch (MalformedURLException ex) {
		System.out.println("exception "+ex);
		} catch (IOException ex) {
		System.out.println("exception "+ex);
		}
		return outputJSON;
		}
	
	
	}

