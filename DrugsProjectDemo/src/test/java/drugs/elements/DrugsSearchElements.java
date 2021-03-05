package drugs.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsSearchElements {
	
	@FindBy(xpath = "//body/div[@id='wrap']/div[@id='inner-wrap']/div[2]/div[1]/button[2]/*[1]")
	public WebElement carouselIcon;
	
	@FindBy(xpath = "//body/div[@id='wrap']/div[@id='inner-wrap']/div[2]/div[1]/ul[1]/li[5]/a[1]/img[1]")
	public WebElement conditionLink;
	
	@FindBy(xpath = "//input[@id='livesearch-condition-docs']")
	public WebElement searchTextbox;
	
	@FindBy(xpath = "//*[@id=\"ls-wrap\"]/div/a[1]")
	public WebElement selectText;
	
	
	
	@FindBy(xpath = "//h1[contains(text(),'Fever')]")
	public WebElement descriptionMsg;

}
