package com.test.AppPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ResusabeComponents.CommonMethodsClass;
import com.baseClass.pack.BaseClass;

public class EnterInsuranceDataClass extends BaseClass {

public EnterInsuranceDataClass(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);}
	

    @FindBy(id="enterinsurantdata")
    private static WebElement link_EnterInsurantData;

	@FindBy(id="firstname")
	private static WebElement txt_FirstName;
	
	@FindBy(id="lastname")
	private static WebElement txt_lastName;
	
	@FindBy(id="birthdate")
	private static WebElement drp_DOB;
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[2]/div[4]/label")
	private static List<WebElement> radio_gender;
	
	@FindBy(id="streetaddress")
	private static WebElement txt_address;
	
	@FindBy(id="country")
	private static WebElement drp_country;
	
	@FindBy(id="zipcode")
	private static WebElement txt_ZipCode;
	
	@FindBy(id="city")
	private static WebElement txt_City;

	@FindBy(id="occupation")
	private static WebElement drp_Occupation;
	
	@FindBy(id="website")
	private static WebElement txt_Website;
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[2]/div[10]/label")
	private static List<WebElement> ChkBx_Hobbies;
	
	//@FindBy(id="picture")
	//private static WebElement pic_picture;
	
	@FindBy(id="nextenterproductdata")
	private static WebElement btn_next;
	
    public void enterFirstName(){
    	txt_FirstName.sendKeys("Raghul");}
    
    public void enterLastName(){	
    	txt_lastName.sendKeys("kumar");}
    
    public void selectDate(){
    	drp_DOB.sendKeys("15/12/1993");}
    
    public void selectGender(){
    	
    	CommonMethodsClass.selectRadioButton(radio_gender, "Female");}
    
    public void  enterAddress(){
    	txt_address.sendKeys("Ruby Homes, Krhisna nagar");}
    
    public void selectCountry() throws Exception{	
    	CommonMethodsClass.selectDropDownAction(drp_country, "Benin");}
    
    public void enterZipcode(){
    	txt_ZipCode.sendKeys("123456");}
    
    public void enterCity(){	
    	txt_City.sendKeys("Chennai");}
    
    public void selectOccupation() throws Exception{	 
    	CommonMethodsClass.selectDropDownAction(drp_Occupation, "Public Official");}
    
    public void enterWebsite(){	
    	txt_Website.sendKeys("www.gmail.com");}
    
    public void selectHobbies(){	
    	CommonMethodsClass.selectcheckBoxOption(ChkBx_Hobbies, "Speeding,Skydiving");}
    	
    public void ClickNextButton(){
    		btn_next.click();
    	
    }
    }
