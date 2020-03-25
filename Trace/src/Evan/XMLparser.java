package Evan;

import java.io.BufferedReader;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

public class XMLparser {

	

	
	public static String readFile(String filename) {
	    String result = "";
	    try {
	        BufferedReader br = new BufferedReader(new FileReader(filename));
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();
	        while (line != null) {
	            sb.append(line);
	            line = br.readLine();
	        }
	        result = sb.toString();
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	    return result;
	}
	
	public static void main(String[] args) {
	    String jsonData = readFile("C:\\Users\\Admin\\Documents\\workspace-spring-tool-suite-4-4.4.2.RELEASE\\Trace\\src\\Evan\\sample.json");
	    JSONObject jobj = new JSONObject(jsonData);
	  
	   
	  JSONArray jarr = new JSONArray(jobj.get("jsonObj").toString());
	  
	  try {  
	    String xml = XML.toString(jarr);
	    System.out.println();
	    System.out.println(xml.replaceAll("array", "jsonObj"));
	  }catch(Exception g) {System.out.println("we have an error"+g);}
	}
	
}
