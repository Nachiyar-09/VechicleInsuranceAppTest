package com.baseClass.pack;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;

import com.ResusabeComponents.ReadValuesFromPropertFile;
import com.stepDefinitions.VechicleInsuranceApplication;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	
	
	//or use @before
	
	@BeforeMethod 
	public void launchBrowserAndNavigate() throws Exception{
		String browser = ReadValuesFromPropertFile.getpropertyfromFile("browser");
		if(driver == null) // to verify whether browser is already opened and use the same for all scenarios 
		                   // not to open seperate browser for each scenarios/features file
	
			/*	switch("browser"){
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "IE":
		    WebDriverManager.iedriver().setup();
		    driver = new InternetExplorerDriver();
		    break;
		case "EdgeBrowser":
			 WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;}*/
			
		
		if(browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
	   }   else if(browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
	   } else if(browser.equalsIgnoreCase("EdgeBrowser")){
		   WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
	   }
		
		
		String URL = ReadValuesFromPropertFile.getpropertyfromFile("URL");
		driver.get(URL);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}

	
		
	}

