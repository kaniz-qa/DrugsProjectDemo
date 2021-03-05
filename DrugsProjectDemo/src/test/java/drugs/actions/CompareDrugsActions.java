package drugs.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import drugs.elements.CompareDrugsElements;
import drugs.utilities.SetupDrivers;

public class CompareDrugsActions {

	CompareDrugsElements compareEle;
	
	public CompareDrugsActions() {
		
		this.compareEle = new CompareDrugsElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, compareEle);
	}
	

	public void homePage() {
		
		SetupDrivers.chromeDriver.get("https://www.drugs.com/");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	

	public void compareLink() throws Throwable {
		compareEle.carouselIcon.click();	
		Thread.sleep(3000);
				
	}
	
	
	public void compareLink2() throws Throwable {
		compareEle.carouselIcon.click();	
		Thread.sleep(3000);
				
	}
	public void compareLink3() throws Throwable {
		compareEle.carouselIcon.click();	
				
		Thread.sleep(3000);
		compareEle.compareDrugs.click();
		
	}
	

	public void caralitinLink() throws Throwable {
		Thread.sleep(3000);
		//compareEle.claritinLink.click();
				
	   try {
	    	compareEle.claritinLink.click();
	    } catch (Exception e) {
	        System.out.println("not clickable element");
	    }
		
		
		
	}
	
	public void desrciptionMsg() throws Throwable {
		Thread.sleep(3000);
		
		
		try {
			compareEle.descriptionMsg.isDisplayed();
	    } catch (Exception e) {
	        System.out.println(" depend on before steps ");
	    }
		
		
	}
	
	
}
