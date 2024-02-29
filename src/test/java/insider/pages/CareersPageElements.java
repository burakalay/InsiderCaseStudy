package insider.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import insider.utils.CommonMethods;

public class CareersPageElements extends CommonMethods{
	
	@FindBy(xpath="/html/body/div[1]/section[1]")
	public WebElement section1;

	@FindBy(id="location-slider")
	public WebElement LocationSlider;
	
	@FindBy(xpath="//a[@class='btn btn-outline-secondary rounded text-medium mt-5 mx-auto py-3 loadmore' and text()='See all teams']")
	public WebElement SeeAllTeams;
	
	@FindBy(id="career-find-our-calling")
	public WebElement Teams;
	
	@FindBy(xpath="//div[@class='swiper-wrapper']")
	public WebElement LifeAtInsider;
	
	@FindBy(xpath="(//div[@class='job-image text-center'])[11]")
	public WebElement QualityAssurance;
	
	public CareersPageElements() {
		PageFactory.initElements(driver, this);
	}
	
}
