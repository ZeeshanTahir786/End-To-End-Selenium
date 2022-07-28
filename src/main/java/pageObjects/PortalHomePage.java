package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalHomePage {
	public WebDriver driver;

	By searchField = By.id("search-courses");

	public PortalHomePage(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement getSearchField() {
		return driver.findElement(searchField);
	}
}
