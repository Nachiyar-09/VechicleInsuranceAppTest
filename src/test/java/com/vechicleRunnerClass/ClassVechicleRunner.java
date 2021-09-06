package com.vechicleRunnerClass;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/resources/Features", tags="@VechicleData,@InsuranceData, @ProductData",
		glue="com.stepDefinitions",
	   plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"})
	    

public class ClassVechicleRunner {
	 
@AfterClass
public static void setup()
{
Reporter.loadXMLConfig(new File("src/test/resources/configs-extent.xml"));
//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
Reporter.setSystemInfo("User Name", "Nachiyar");
Reporter.setSystemInfo("Application Name", "Learning Implementation");
Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
Reporter.setSystemInfo("Environment", "Production");
Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
} 
}