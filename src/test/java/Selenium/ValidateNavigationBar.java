package Selenium;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class ValidateNavigationBar extends Base {
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();

		driver.get(prop.getProperty("url"));
	}

	@Test
	public void NavigationBarValidation() {

		LandingPage landingPage = new LandingPage(driver);
		Assert.assertTrue(landingPage.getNavigationBar().isDisplayed());
		log.info("NavigationBar is successfully displayed");
		Assert.assertEquals(landingPage.getTitle().getText(), "Featured Courses");
		log.info("Successfully Validated 'Featured Courses' Title is Present Accurately");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
