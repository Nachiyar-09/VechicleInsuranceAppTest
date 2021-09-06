package com.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.ResusabeComponents.CommonMethodsClass;
import com.ResusabeComponents.Log;
import com.ResusabeComponents.ReadValuesFromPropertFile;
import com.baseClass.pack.BaseClass;
import com.test.AppPages.EnterInsuranceDataClass;
import com.test.AppPages.EnterProductDataClass;
import com.test.AppPages.EnterVechicleDataClass;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;  
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VechicleInsuranceApplication extends BaseClass {

	EnterVechicleDataClass objVechicle;
	EnterInsuranceDataClass objInsure;
	EnterProductDataClass objProd;
	
	
	 final Logger logger = Log.getLogData();
	
	 @Given("^User navigates to the applications$")
	public void user_navigates_to_the_applications() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchBrowserAndNavigate();
	logger.info("Browser launched Successfully and navigated to the test site!");
	   System.out.println("title"+driver.getTitle());
	}
	@When("^User clicks on the Motarcycle option from the header respective fields should be displayed$")
	public void user_clicks_on_the_Motarcycle_option_from_the_header_respective_fields_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objVechicle = new EnterVechicleDataClass(driver);
		objVechicle.ClickMotarcycleOption();
	}

	@And("^User should able to select a value from MAKE dropdown$")
	public void user_should_able_to_select_a_value_from_MAKE_dropdown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		logger.info("User landed to Vechicle data page!");
		objVechicle.selectMake();
	}

	@And("^User should able to select a value from MODEL dropdown$")
	public void user_should_able_to_select_a_value_from_MODEL_dropdown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objVechicle.selectModel();
	}

	@And("^user should enter values in the CYLINDER CAPACITY field$")
	public void user_should_enter_values_in_the_CYLINDER_CAPACITY_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objVechicle.enterCylinderCapacity();
	}

	@And("^User should enter values in the ENGINE PERFORMANCE field$")
	public void user_should_enter_values_in_the_ENGINE_PERFORMANCE_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objVechicle.enterEnginePerformance();
	}

	@And("^user should select date from DATA OF MANUFACTURE field$")
	public void user_should_select_date_from_DATA_OF_MANUFACTURE_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objVechicle.selectDateOfManufacturin();
	}

	@And("^user should select a value from NUMBER OF SEATS from drop down$")
	public void user_should_select_a_value_from_NUMBER_OF_SEATS_from_drop_down() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objVechicle.selectNoOfSeats();
	}

	@And("^User should enter value in the LIST PRICE field$")
	public void user_should_enter_value_in_the_LIST_PRICE_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objVechicle.EnterListPrice();
	}

 	@And("^User should enter value in the ANNUAL MILLEAGE field$")
	public void user_should_enter_value_in_the_ANNUAL_MILLEAGE_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
 		objVechicle.EnterAnnualMilleage();
	}

	@Then("^user should able to click on the next button$")
	public void user_should_able_to_click_on_the_next_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objVechicle.Clicknext();
	}

	@Given("^User should be navigated to insurance data page$")
	public void user_should_be_navigated_to_insurance_data_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		logger.info("User landed to Insurance data page!");          
		System.out.println(driver.getTitle());
	}

	@And("^user should enter values in the FIRST NAME field$")
	public void user_should_enter_values_in_the_FIRST_NAME_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objInsure = new EnterInsuranceDataClass(driver);
		objInsure.enterFirstName();
	}

	@And("^use should enter values in the LAST NAME field$")
	public void use_should_enter_values_in_the_LAST_NAME_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objInsure.enterLastName();
	}

	@And("^user should select date from the DATE OF BIRTH datepicker$")
	public void user_should_select_date_from_the_DATE_OF_BIRTH_datepicker() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objInsure.selectDate();
	}

	@And("^user should select values from the available GENDER option$")
	public void user_should_select_values_from_the_available_GENDER_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objInsure.selectGender();
	}

	@And("^user should enter values in the STREET ADDRESS field$")
	public void user_should_enter_values_in_the_STREET_ADDRESS_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objInsure.enterAddress();
	}

	@And("^user should select values from the COUNTRY dropdown$")
	public void user_should_select_values_from_the_COUNTRY_dropdown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objInsure.selectCountry();
	}

	@And("^user should enter values in the ZIP CODE field$")
	public void user_should_enter_values_in_the_ZIP_CODE_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objInsure.enterZipcode();
	}

	@And("^user should enter values in the CITY field$")
	public void user_should_enter_values_in_the_CITY_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objInsure.enterCity();
	}

	@And("^user should select values from the OCCUPATION dropdown field$")
	public void user_should_select_values_from_the_OCCUPATION_dropdown_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objInsure.selectOccupation();
	}

	@And("^user should select the values available in the HOBBIES checkbox fields$")
	public void user_should_select_the_values_available_in_the_HOBBIES_checkbox_fields() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objInsure.selectHobbies();
	}

	@And("^user should enter values in the WEBSITE field$")
	public void user_should_enter_values_in_the_WEBSITE_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objInsure.enterWebsite();
	}

	/*@And("^user should able to browse the PICTURE$")
	public void user_should_able_to_browse_the_PICTURE() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}*/

	@Then("^user should click on the NEXT button available$")
	public void user_should_click_on_the_NEXT_button_available() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objInsure.ClickNextButton();
	}

	@Given("^User should able to navigate to product data tab upon clicking next button from insurance data tab$")
	public void user_should_able_to_navigate_to_product_data_tab_upon_clicking_next_button_from_insurance_data_tab() throws Throwable {
		logger.info("User landed to Product data page!");
		System.out.println(driver.getTitle());}

	@Given("^User should able to select START DATE from the date picker option$")
	public void user_should_able_to_select_START_DATE_from_the_date_picker_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objProd = new EnterProductDataClass(driver);
		objProd.selectStartDate();
	}

	@Given("^user should select INSURANCE SUM option from the dropdown$")
	public void user_should_select_INSURANCE_SUM_option_from_the_dropdown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objProd.selectInsuranceSum();
	}

	@Given("^user should select DAMAGE INSURANCE option from the dropdown$")
	public void user_should_select_DAMAGE_INSURANCE_option_from_the_dropdown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objProd.selectInsuranceSum();
	}

	@Given("^user should select OPTIONAL PRODUCTS from the check box available$")
	public void user_should_select_OPTIONAL_PRODUCTS_from_the_check_box_available() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objProd.selectdamageInsurance();
	}

	@Then("^user should click on the NEXT button available in the page$")
	public void user_should_click_on_the_NEXT_button_available_in_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objProd.clickNext();
	}


	
}
