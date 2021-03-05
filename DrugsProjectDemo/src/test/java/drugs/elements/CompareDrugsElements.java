package drugs.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompareDrugsElements {
	
	
	
	
	@FindBy(xpath = "//body/div[@id='wrap']/div[@id='inner-wrap']/div[2]/div[1]/button[2]/*[1]")
	public WebElement carouselIcon;
	
		
	@FindBy(xpath = "//*[@id=\"inner-wrap\"]/div[2]/div/ul/li[7]/a/img")
	public WebElement compareDrugs;
	
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ul[2]/li[2]")
	public WebElement claritinLink;
	
	@FindBy(xpath = "//*[@id=\"compare-title\"]")
	public WebElement descriptionMsg;

}
