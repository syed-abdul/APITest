package org.read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Execution {
	public static void main(String[] args) throws ParseException, IOException {
		
		JSONParser jp=new JSONParser();	
	FileReader fi=new FileReader("C:\\Users\\ragavboom\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\JsonFile\\data1.json");
		Object o = jp.parse(fi);
	
		JSONObject jo=(JSONObject)o;
		Object text = jo.get("page");
		System.out.println(text);
		System.out.println(jo.get("per_page"));
		System.out.println(jo.get("total"));
		System.out.println(jo.get("total_pages"));
		Object ob1 = jo.get("data");
		JSONArray ja=(JSONArray) ob1;
		for(int i=0;i<ja.size();i++) {
		Object ob2 = ja.get(i);
		JSONObject jo1=(JSONObject)ob2;
		System.out.println(jo1.get("id"));
		System.out.println(jo1.get("email"));
		System.out.println(jo1.get("first_name"));
		System.out.println(jo1.get("last_name"));
		System.out.println(jo1.get("avatar"));
		System.out.println();
		}
		
		Object ob3 = jo.get("ad");
		JSONObject jo1=(JSONObject)ob3;
		System.out.println(jo1.get("company"));
		System.out.println(jo1.get("url"));
		System.out.println(jo1.get("text"));
	}
	

}
