package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	By signIn = By.cssSelector("a[href*='sign_in']");
	By title = By.cssSelector("div[class='pull-left'] h2");
	By navigationBar = By.cssSelector("ul[class*='navigation']");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage getLogin() {
		driver.findElement(signIn).click();
		LoginPage loginPage = new LoginPage(driver);
		return loginPage;
	}

	public WebElement getTitle() {
		return driver.findElement(title);
	}

	public WebElement getNavigationBar() {
		return driver.findElement(navigationBar);
	}

}
