package com.hemant.json.simple;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonSimpleWriter {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "John Doe");
		jsonObject.put("age", 23);
		
		JSONArray cities = new JSONArray();
		cities.add("New York");
		cities.add("Philly");
		cities.add("Dallas");
		cities.add("Charlotte");
		
		jsonObject.put("cities", cities);
		
		FileWriter fileWriter = new FileWriter("data.json");
		fileWriter.write(jsonObject.toJSONString());
		fileWriter.flush();
		fileWriter.close();
		
		System.out.println(jsonObject.toJSONString());
	}
}
