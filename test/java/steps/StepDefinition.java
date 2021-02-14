package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.AddNewAccountPage;
import page.LoginPage;
import util.BrowserFactory;

public class StepDefinition {
	WebDriver driver;
	LoginPage loginPage;
	AddNewAccountPage addnewaccountPage;
	

	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		addnewaccountPage = PageFactory.initElements(driver, AddNewAccountPage.class);

	}

	@Given("^User is on the Techfios Login Page$")
	public void User_is_on_the_Techfios_Login_Page() {
//		driver = BrowserFactory.startBrowser();
		driver.get("https://techfios.com/billing/?ng=admin/");

	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void User_enters_username_as(String userName) throws InterruptedException {
		System.out.println();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(userName);
		Thread.sleep(2000);
	}

	@Given("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws InterruptedException {
		loginPage.enterPassword(password);
		Thread.sleep(2000);

	}

	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() throws InterruptedException {
		loginPage.clickOnSignInButton();
		Thread.sleep(2000);

	}

	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() throws IOException {
		Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle());
		loginPage.takeScreenshotAtEndOfTest(driver);
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		loginPage.enterCredentials(username, password);

	}

	@Then("^User should click on Bank and Cash$")
	public void user_should_click_on_Bank_and_Cash() throws InterruptedException  {
		addnewaccountPage.clickonBankandCash(); 
		Thread.sleep(3000);
	}

	@Then("^User should click on new account$")
	public void user_should_click_on_new_account() throws InterruptedException  {
		addnewaccountPage.clickonNewAccount();
		Thread.sleep(2000);
	    
	}

	@Then("^User should be able to enter AccountTitle as \"([^\"]*)\"$")
	public void user_should_be_able_to_enter_AccountTitle_as(String AccountTitle) throws Throwable {
		addnewaccountPage.enterAccountTitle(AccountTitle);
		Thread.sleep(2000);
	   
	}

	@Then("^User should be able to enter Description as \"([^\"]*)\"$")
	public void user_should_be_able_to_enter_Description_as(String description) throws Throwable {
		addnewaccountPage.enterDescription(description);
	}

	@Then("^User should be able to enter InitialBalance as \"([^\"]*)\"$")
	public void user_should_be_able_to_enter_InitialBalance_as(String initialBalance) throws Throwable {
		addnewaccountPage.enterBalance(initialBalance);
	}

	@Then("^User should be able to enter AccountNumber as \"([^\"]*)\"$")
	public void user_should_be_able_to_enter_AccountNumber_as(String accountNumber) throws Throwable {
		addnewaccountPage.enterAccountNumber(accountNumber);
	}

	@Then("^User should be able to enter ContactPersons \"([^\"]*)\"$")
	public void user_should_be_able_to_enter_ContactPersons(String contactPerson) throws Throwable {
		addnewaccountPage.enterContactName(contactPerson);
	}

	@Then("^User should be able to enter Phone as \"([^\"]*)\"$")
	public void user_should_be_able_to_enter_Phone_as(String phone) throws Throwable {
		addnewaccountPage.enterPhoneNumber(phone);
	}


	@Then("^User should be able to click on submit button$")
	public void user_should_be_able_to_click_on_submit_button() throws Throwable {
		addnewaccountPage.clickSubmitButton();
		Thread.sleep(2000);
	}




	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
