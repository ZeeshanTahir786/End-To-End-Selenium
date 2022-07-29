//package stepDefinitions;
//
//import org.junit.runner.RunWith;
//import org.testng.Assert;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.cucumber.junit.Cucumber;
//import pageObjects.LandingPage;
//import pageObjects.LoginPage;
//import pageObjects.PortalHomePage;
//import resources.Base;
//
//@RunWith(Cucumber.class)
//public class StepDefinition extends Base {
//	@Given("^Initialize the browser with chrome$")
//	public void initialize_the_browser_with_chrome() throws Throwable {
//		driver = initializeDriver();
//	}
//
//	@Given("^Navigate to \"([^\"]*)\" Site$")
//	public void navigate_to_something_site(String strArg1) throws Throwable {
//		driver.get(strArg1);
//	}
//
//	@Given("^Click on Login link in home page to land on Secure sign in Page$")
//	public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
//		LandingPage landingPage = new LandingPage(driver);
//		landingPage.clickLoginBtn();
//	}
//
//	@When("^User enters (.+) and (.+) and logs in$")
//	public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.enterEmail().sendKeys(username);
//		loginPage.enterPassword().sendKeys(password);
//		loginPage.clickLoginBtn().click();
//	}
//
//	@Then("^Verify that user is succesfully logged in$")
//	public void verify_that_user_is_succesfully_logged_in() throws Throwable {
//		PortalHomePage page = new PortalHomePage(driver);
//		Assert.assertEquals(page.getUsername().getText(), "Test99");
//	}
//
//	@And("^Close the browsers$")
//	public void close_the_browsers() throws Throwable {
//		driver.quit();
//	}
//}
