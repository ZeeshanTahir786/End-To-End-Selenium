package Selenium;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.IOException;
import org.testng.annotations.DataProvider;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
import resources.Base;

public class HomePageTest extends Base {

	@Test(dataProvider = "getData")
	public void basePageNavigation(String username,String password) throws IOException {

		driver = initializeDriver();

		driver.get(prop.getProperty("url"));

		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickLoginBtn().click();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterEmail().sendKeys(username);
		loginPage.enterPassword().sendKeys(password);
		loginPage.clickLoginBtn().click();
		
		PortalHomePage page = new PortalHomePage(driver);
		Assert.assertTrue(page.getSearchField().isDisplayed());
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
		data[1][0] = "123abc@gmail.com";
		data[1][1] = "password";

		return data;
	}

}
