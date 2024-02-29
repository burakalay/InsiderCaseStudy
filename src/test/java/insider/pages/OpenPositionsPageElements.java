package insider.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import insider.utils.CommonMethods;

public class OpenPositionsPageElements extends CommonMethods{
	
	@FindBy(xpath="//p[@class='position-title font-weight-bold']")
     public List<WebElement> position;
	
	@FindBy(xpath="//span[@class='position-department text-large font-weight-600 text-primary']")
    public List<WebElement> department;
	
	@FindBy(xpath="//div[@class='position-location text-large']")
    public List<WebElement> location;
	
	@FindBy(xpath="(//a[@class='btn btn-navy rounded pt-2 pr-5 pb-2 pl-5'])[1]")
	public WebElement viewRole;
	
	public OpenPositionsPageElements() {
		PageFactory.initElements(driver, this);
	}
	
}
