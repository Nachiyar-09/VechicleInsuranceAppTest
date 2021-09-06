package com.test.AppPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ResusabeComponents.CommonMethodsClass;
import com.baseClass.pack.BaseClass;

public class EnterVechicleDataClass extends BaseClass{
	
	
	public EnterVechicleDataClass(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="nav_motorcycle")
	private static WebElement clk_MotorcycleButton;
	
	@FindBy(id="make")
	private static WebElement drp_make;
	
	@FindBy(id="model")
	private static WebElement drp_model;
	
	@FindBy(id="cylindercapacity")
	private static WebElement txt_CylinerCapacity;
	
	@FindBy(id="engineperformance")
	private static WebElement txt_EnginePerformance;
	
	@FindBy(id="dateofmanufacture")
	private static WebElement date_DateOfManufature;
	
	@FindBy(id="numberofseatsmotorcycle")
	private static WebElement drp_NoOfSeats;
	
	@FindBy(id="listprice")
	private static WebElement txt_ListPrice;
	
	@FindBy(id="annualmileage")
	private static WebElement txt_AnnualMilleage;

	@FindBy(id="nextenterinsurantdata")
	private static WebElement btn_next;
	
	@FindBy(id="entervehicledata")
	private static WebElement link_enterVechicleData;
	
	public static void ClickMotarcycleOption(){
		clk_MotorcycleButton.click();
	}
		
	public void selectMake() throws Exception{	
		
		CommonMethodsClass.selectDropDownAction(drp_make, "Opel");}
	
	public void selectModel() throws Exception{	
		CommonMethodsClass.selectDropDownAction(drp_model, "Moped");}
	
	public void enterCylinderCapacity() throws Exception{	
		txt_CylinerCapacity.sendKeys("1000");} //1 to 2000
		
	public void enterEnginePerformance() throws Exception{	
		txt_EnginePerformance.sendKeys("1500");}//1 to 2000 
		
	public void selectDateOfManufacturin() throws Exception{
		date_DateOfManufature.sendKeys("12/09/2020");}
		
	public void selectNoOfSeats() throws Exception{
		CommonMethodsClass.selectDropDownAction(drp_NoOfSeats, "2");}
		
	public void EnterListPrice() throws Exception{
		txt_ListPrice.sendKeys("4444");}//500 to 100000
		
	public void EnterAnnualMilleage() throws Exception{
		txt_AnnualMilleage.sendKeys("500");}//100 to 100000
		
	public void Clicknext(){
		btn_next.click();
	}
	
}
