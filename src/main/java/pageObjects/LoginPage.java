package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	By email = By.id("email");
	By password = By.id("password");
	By login = By.cssSelector("input[data-testid='login-button']");
	By forgotPass = By.cssSelector("a[href*='forgot_password']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public ForgotPassword forgotPassword() {
		driver.findElement(forgotPass).click();
		return new ForgotPassword(driver);

	}

	public WebElement enterEmail() {
		return driver.findElement(email);
	}

	public WebElement enterPassword() {
		return driver.findElement(password);
	}

	public WebElement getLogin() {
		return driver.findElement(login);
	}

}
