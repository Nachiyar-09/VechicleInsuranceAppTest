package com.test.AppPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ResusabeComponents.CommonMethodsClass;
import com.baseClass.pack.BaseClass;

public class EnterProductDataClass extends BaseClass{
	
	@FindBy(id="startdate")
	private static WebElement date_startDate;
	
	@FindBy(id="insurancesum")
	private static WebElement drp_insurancesum;
	
	@FindBy(id="damageinsurance")
	private static WebElement drp_damageInsurance;
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[3]/div[4]/label")
	private static List<WebElement> chkBx_optionalProduct;
	
	@FindBy(id="nextselectpriceoption")
	private static WebElement btn_next;
	
	 @FindBy(id="enterproductdata")
	    private static WebElement link_ProductData;
	
	public EnterProductDataClass(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);}
	
	public void selectStartDate()throws Exception{
		date_startDate.sendKeys("10152021");}
		
	public void selectInsuranceSum() throws Exception{
		CommonMethodsClass.selectDropDownAction(drp_insurancesum, "3.000.000,00");}
		
	public void selectdamageInsurance() throws Exception{	
		CommonMethodsClass.selectDropDownAction(drp_damageInsurance, "Partial Coverage");}
		
	public void selectOptionalProduct(){
		CommonMethodsClass.selectcheckBoxOption(chkBx_optionalProduct, "Euro Protection,Legal Defense Insurance");}
	
	
	 public void clickNext(){
		 btn_next.click();
	 }
	
}
	
	

