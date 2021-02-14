package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewAccountPage {
	WebDriver driver;
	
	public AddNewAccountPage(WebDriver driver) {
		this.driver = driver;
	}

//	Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]") 
	WebElement BANK_AND_CASH_BUTTON;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a") 
	WebElement NEW_ACCOUNT_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='account']") 
	WebElement ADD_ACCOUNT_TITLE_FIELD_BUTTON;
	@FindBy(how = How.XPATH, using = "//input[@id='description']") 
	WebElement ADD_DESCRIPTION_FIELD_BUTTON;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']") 
	WebElement ADD_BALANCE_FIELD_BUTTON;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']") 
	WebElement ADD_ACCOUNT_NUMBER_FIELD_BUTTON;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']") 
	WebElement ADD_CUSTOMER_PERSON_FIELD_BUTTON;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']") 
	WebElement ADD_CUSTOMER_PHONE_FIELD_BUTTON;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button") 
	WebElement CLICK_SUBMIT_BUTTON;
	
	
//	Interactive Method
	public void clickonBankandCash() throws InterruptedException {
		BANK_AND_CASH_BUTTON.click();	
		Thread.sleep(3000);
	}
	

	public void clickonNewAccount() throws InterruptedException {
		NEW_ACCOUNT_FIELD_LOCATOR.click();
		Thread.sleep(3000);
	}
	
	public void enterAccountTitle(String AccountTitle) throws InterruptedException {
		ADD_ACCOUNT_TITLE_FIELD_BUTTON.sendKeys(AccountTitle);	
		Thread.sleep(2000);
	}
	
	public void enterDescription(String Description) {
		ADD_DESCRIPTION_FIELD_BUTTON.sendKeys(Description);
	}
	
	public void enterBalance(String Balance) {
		ADD_BALANCE_FIELD_BUTTON.sendKeys(Balance);
	}
	
	public void enterAccountNumber(String AccountNumber) {
		ADD_ACCOUNT_NUMBER_FIELD_BUTTON.sendKeys(AccountNumber);	
	}
	
	
	public void enterContactName(String ContactName) {
		ADD_CUSTOMER_PERSON_FIELD_BUTTON.sendKeys(ContactName);
	
	}

	public void enterPhoneNumber(String Phone) {
		ADD_CUSTOMER_PHONE_FIELD_BUTTON.sendKeys(Phone);
	}
	
	public void clickSubmitButton() {
		CLICK_SUBMIT_BUTTON.click();
		
	}
}
