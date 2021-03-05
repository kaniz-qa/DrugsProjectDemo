package drugs.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports",
		"json:target/cucumber-jsonreports/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
		features = {"src/test/resources/Features" }, 
		glue = { "drugs.stepDef" , "drugs.utilities" },  monochrome = true)

public class DrugsRunner extends AbstractTestNGCucumberTests{

}
