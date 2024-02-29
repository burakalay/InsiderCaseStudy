package insider.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import insider.utils.CommonMethods;

public class QualityAssurancePageElements extends CommonMethods {
	
	@FindBy(xpath="//a[@class='btn btn-outline-secondary rounded text-medium mt-2 py-3 px-lg-5 w-100 w-md-50' and text()=''See all QA jobs]")
	public WebElement SeeAllQAJobs;
	
	@FindBy(xpath="//select[@name='filter-by-location']")
	public WebElement location;
	
	@FindBy(xpath="//select[@name='filter-by-department']")
	public WebElement department;


	public QualityAssurancePageElements() {
		PageFactory.initElements(driver, this);
	}

}
