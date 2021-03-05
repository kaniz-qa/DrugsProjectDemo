package drugs.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import drugs.elements.DrugsSearchElements;
import drugs.utilities.SetupDrivers;

public class DrugsSearchActions {
	
	DrugsSearchElements drugsEle;
	
	public DrugsSearchActions() {
		this.drugsEle = new DrugsSearchElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, drugsEle);
	}

	
	public void homePage() {
		
		SetupDrivers.chromeDriver.get("https://www.drugs.com/");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	public void deceasesLink() throws Exception {
		drugsEle.carouselIcon.click();
		Thread.sleep(2000);
		drugsEle.conditionLink.click();
		Thread.sleep(2000);
	}
	
	
	public void searchText() throws Throwable {
		drugsEle.searchTextbox.sendKeys("Fever");
		Thread.sleep(2000);
		drugsEle.searchTextbox.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		drugsEle.selectText.sendKeys(Keys.ENTER);
	}
	

	public void descriptionMsg() {
		
		drugsEle.descriptionMsg.isDisplayed();
	}

	
	
}
