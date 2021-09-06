package com.ResusabeComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadValuesFromPropertFile { 

	
	public static String getpropertyfromFile(String Key) throws Exception{
		
		String FilePath=System.getProperty("user.dir") + "/src/test/resources/config.properties";
		
		 Properties prop = new Properties();
		 
		 FileInputStream fis = new FileInputStream(FilePath);
		 
		  prop.load(fis);
		  
		   String Value = prop.get(Key).toString();
		   
		   return Value;
		 
	}

	
}
