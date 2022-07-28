package Selenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import pageObjects.LandingPage;
import resources.Base;

public class ValidateTitle extends Base {
	private static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Initialize the browser");

		driver.get(prop.getProperty("url"));
		log.info("Navigate to Home Page");

	}

	@Test
	public void basePageNavigation() throws IOException {

		LandingPage landingPage = new LandingPage(driver);
		Assert.assertEquals(landingPage.getTitle().getText(), "Featured Courses");
		log.info("Successfully Validated 'Featured Courses' Title is Present Accurately");

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
