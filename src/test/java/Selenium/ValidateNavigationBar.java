package Selenium;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class ValidateNavigationBar extends Base {

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();

		driver.get("https://rahulshettyacademy.com");
	}
	
	@Test
	public void basePageNavigation() {

		LandingPage landingPage = new LandingPage(driver);
		Assert.assertEquals(landingPage.getTitle().getText(), "Featured Courses");
		Assert.assertTrue(landingPage.getNavigationBar().isDisplayed());
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
