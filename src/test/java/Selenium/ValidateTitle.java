package Selenium;

import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import java.io.IOException;

import pageObjects.LandingPage;
import resources.Base;

public class ValidateTitle extends Base {

	@Test
	public void basePageNavigation() throws IOException {

		driver = initializeDriver();

		driver.get("https://rahulshettyacademy.com");

		LandingPage landingPage = new LandingPage(driver);
		AssertJUnit.assertEquals(landingPage.getTitle().getText(), "Featured Courses");
	}

}
