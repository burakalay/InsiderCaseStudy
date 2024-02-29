package insider.tests;

import java.util.List;

import org.openqa.selenium.WebElement;

import insider.utils.CommonMethods;

public class InsiderCaseStudy extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		// Opening the browser
		setUp();

		// Checking Insider home page is opened or not
		if (home.container.isDisplayed()) {

			System.out.println("Home page was opened!");
		} else {
			System.out.println("Home page wasn't opened!");
		}

		// Navigating to Careers page
		click(home.company);
		wait(2);
		click(home.careers);

		waitForVisibility(careers.section1);

		// Checking the careers page components

		if (careers.LocationSlider.isDisplayed()) {
			System.out.println("Location Slider is visible!");
		} else {
			System.out.println("Location Slider is not visible!");
		}

		if (careers.LifeAtInsider.isDisplayed()) {
			System.out.println("Life at Insider bar is visible!");
		} else {
			System.out.println("Life at Insider bar is not visible!");
		}

		jsClick(careers.SeeAllTeams);

		if (careers.Teams.isDisplayed()) {
			System.out.println("Teams bar is visible!");
		} else {
			System.out.println("Teams bar is not visible!");
		}

		// Navigating the QA page
		jsClick(careers.QualityAssurance);

		waitForClickability(qa.SeeAllQAJobs);
		jsClick(qa.SeeAllQAJobs);

		// Selecting from dd menu
		selectDropdown(qa.location, "Istanbul, Turkey");
		selectDropdown(qa.department, "Quality Assurance");

		// Checking that all jobs’ Position contains “Quality Assurance”, Department
		// contains
		// “Quality Assurance”, and Location contains “Istanbul, Turkey”

		for (WebElement jobPosition : open.position) {
			if (jobPosition.getText().contains("Quality Assurance")) {
				System.out.println("This is QA Job");
			} else {
				System.out.println("This is not a QA Job");
			}
		}

		for (WebElement jobDepartment : open.department) {

			if (jobDepartment.getText().contains("Quality Assurance")) {
				System.out.println("This is QA Department!");
			} else {
				System.out.println("This is not QA Department");
			}
		

		}
		for (WebElement jobLocation : open.location) {
			if (jobLocation.getText().contains("Istanbul")) {
				System.out.println("This job is located in Istanbul");
			} else {
				System.out.println("This job is not located in Istanbul");
			}
		
		}

		wait(5);

		// Clicking to ViewRole

		hoverTheMouse(open.viewRole);
		click(open.viewRole);

		wait(10);
		tearDown();

	}

}
