package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalHomePage {
	public WebDriver driver;

	By searchField = By.className("navbar-current-user");

	public PortalHomePage(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement getUsername() {
		return driver.findElement(searchField);
	}
}
