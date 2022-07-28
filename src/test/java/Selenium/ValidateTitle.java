package Selenium;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import pageObjects.LandingPage;
import resources.Base;

public class ValidateTitle extends Base {

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();

		driver.get(prop.getProperty("url"));
	}

	@Test
	public void basePageNavigation() throws IOException {

		LandingPage landingPage = new LandingPage(driver);
		Assert.assertEquals(landingPage.getTitle().getText(), "Featured Courses");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
