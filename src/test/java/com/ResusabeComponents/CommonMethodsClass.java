package com.ResusabeComponents;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethodsClass {
     
	public boolean VerifyCurrentTab(WebElement element,String value){
	 if(element.getText().equalsIgnoreCase(value))
		 return true;
	 else
		 return false;
	 
 }
	// common method to access drop down
	public static void selectDropDownAction(WebElement element, String valuetoBeSelected) throws Exception{
		Select sel = new Select(element);
		try{
		sel.selectByVisibleText(valuetoBeSelected);}
		catch(Exception e){
			throw new Exception("value not present in webelement");
		}
	}
	
	public static void selectcheckBoxOption(List<WebElement> element,String check){
		String[] Arraycheck=check.split(",");
		for(String str: Arraycheck){
		  for(WebElement ele: element){
			if(ele.getText().equalsIgnoreCase(str)){
				ele.click();
				break;}}}}
			
	public static void selectRadioButton(List<WebElement> element,String valueToBeSelected){
		for(WebElement ele : element )
			if(ele.getText().equalsIgnoreCase(valueToBeSelected)){
				ele.click();
				break;
			}
}
}
		