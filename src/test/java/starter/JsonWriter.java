package starter;

import java.io.FileWriter;

import org.json.simple.JSONObject;

public class JsonWriter {
	
	public static void exportReport(int pass, int fail) {
		JSONObject obj = new JSONObject();
		obj.put("Passed", pass);
		obj.put("Failed", fail);
		
		try (FileWriter file = new FileWriter("src/test/resources/report.json")) {
			file.write(obj.toJSONString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj);
		} catch(Exception e) {
			
		}
	}

}
