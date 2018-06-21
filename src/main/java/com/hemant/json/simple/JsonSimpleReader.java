package com.hemant.json.simple;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSimpleReader {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		JSONParser jsonParser = new JSONParser();
		
		FileReader fileReader = new FileReader(new File("data.json"));
		Object obj = jsonParser.parse(fileReader);
		JSONObject jsonObject = (JSONObject) obj;
		
		String name = (String) jsonObject.get("name");
		System.out.println("Name: " + name);
		
		Long age = (Long) jsonObject.get("age");
		System.out.println("Age: " + age);
		
		JSONArray cities = (JSONArray) jsonObject.get("cities");
		
		@SuppressWarnings("rawtypes")
		Iterator iterator = cities.iterator();
		while(iterator.hasNext()) {
			System.out.println("City: " + iterator.next());
		}
		
		fileReader.close();
	}
}
