package insider.testbase;

import insider.pages.CareersPageElements;
import insider.pages.HomePageElements;
import insider.pages.OpenPositionsPageElements;
import insider.pages.QualityAssurancePageElements;

public class PageInitializer extends BaseClass{
	
	public static HomePageElements home;
	public static CareersPageElements careers;
	public static QualityAssurancePageElements qa;
	public static OpenPositionsPageElements open;
	
	public static void initialize() {
		
		home = new HomePageElements();
		careers = new CareersPageElements();
		qa = new QualityAssurancePageElements();
		open = new OpenPositionsPageElements();
	}

}
