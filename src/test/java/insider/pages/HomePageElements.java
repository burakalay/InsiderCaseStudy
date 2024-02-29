package insider.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import insider.utils.CommonMethods;

public class HomePageElements extends CommonMethods{
	
@FindBy(xpath="(//div[@class='container'])[2]")
public WebElement container;

@FindBy(xpath="(//li[@class='nav-item dropdown'])[6]")
public WebElement company;


@FindBy(xpath="//a[@class='dropdown-sub' and text()='Careers']")
public WebElement careers;

@FindBy(xpath="//span[@class='ins-close-button']")
public WebElement popUpClose;

public HomePageElements() {
	PageFactory.initElements(driver, this);
}

}
