package drugs.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class AfterActions {

	
	@After
	public void afterScenario(Scenario scen) {

		System.out.println("..Test End..");

		try {
			if (scen.isFailed()) {
				String screenshotName = scen.getName().replaceAll(" ", "_");
				TakesScreenshot ts = (TakesScreenshot) SetupDrivers.chromeDriver;
				byte[] screenshotBytes = ts.getScreenshotAs(OutputType.BYTES);
				scen.attach(screenshotBytes, "image/png", screenshotName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("..Closing Chrome Browser Starts..");
		SetupDrivers.quitChromeDriver();
		System.out.println("..Closing Chrome Browser End..");

	}
	
}
