package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	By signIn = By.xpath("(//div[@class='login-btn'])[2]");
	By title = By.cssSelector("div[class='pull-left'] h2");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement clickLoginBtn() {
		return driver.findElement(signIn);
	}

	public WebElement getTitle() {
		return driver.findElement(title);
	}

}
