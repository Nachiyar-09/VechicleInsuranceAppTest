package com.ResusabeComponents;

import java.io.File;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.Logger;

public class Log {

	public static Logger getLogData(){
		//String path = new File("").getAbsolutePath();
		DOMConfigurator.configure("log4j.xml");
		//return Logger.getLogger(ClassName);
		return null;
	}

	
	
}