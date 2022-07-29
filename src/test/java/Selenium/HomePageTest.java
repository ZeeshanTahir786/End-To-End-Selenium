package Selenium;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
import resources.Base;

public class HomePageTest extends Base {
	public WebDriver driver;
//	ExtentReports extent;
	private static Logger log = LogManager.getLogger(Base.class.getName());

//	@BeforeTest
//	public void config() {
////		ExtentReports, ExtentSparkReporter
//		String path = "reports/index.html";
//		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
//		reporter.config().setReportName("Web Automation Results");
//		reporter.config().setDocumentTitle("Test Results");
//
//		extent = new ExtentReports();
//		extent.attachReporter(reporter);
//		extent.setSystemInfo("Tester", "Hafiz Zeeshan");
//	}

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.manage().deleteAllCookies();
	}

//	@Test()
//	public void basePageNavigation() {
////		ExtentTest test = extent.createTest("Check Login");
//		driver.get(prop.getProperty("url"));
//		LandingPage landingPage = new LandingPage(driver);
//		landingPage.clickLoginBtn().click();
//
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.enterEmail().sendKeys("test99@gmail.com");
//		loginPage.enterPassword().sendKeys("123456");
//		loginPage.clickLoginBtn().click();
//		log.info("User is successfully Logged In");
//		PortalHomePage page = new PortalHomePage(driver);
//		Assert.assertEquals(page.getUsername().getText(), "Test99");
//		log.info("username is successfully displayed");
//
////		extent.flush();
//	}
	@Test(dataProvider = "getData")
	public void basePageNavigation(String username, String password) {
		driver.get(prop.getProperty("url"));
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickLoginBtn().click();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterEmail().sendKeys(username);
		loginPage.enterPassword().sendKeys(password);
		loginPage.clickLoginBtn().click();

		PortalHomePage page = new PortalHomePage(driver);
		Assert.assertEquals(page.getUsername().getText(), "Test99");
		log.info("Search Field is successfully displayed");
	}

	@DataProvider
	public Object[][] getData() {

//		Rows stands for how many different types of data types should run/test
//		columns stands for how many values for each test / how many values you are sending for test

		Object[][] data = new Object[2][2];
//		0th row
		data[0][0] = "test99@gmail.com";
		data[0][1] = "123456";
//		1th row
		data[1][0] = "test99@gmail.com";
		data[1][1] = "123456";

		return data;
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
