
package OmnilimoProj.Elements.LogIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import OmnilimoProj.Boss;

public class RegistrationElements extends Boss {

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@name='mobileNumber']")
	WebElement mobileNumber;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//div[@name='conditions']")
	WebElement conditions;
	
	@FindBy(xpath = "//button[contains(text(),'Sign up')]")
	WebElement signUpButton;
	
	public RegistrationElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void insertFirstName(String FirstName) {
		firstName.clear();
		firstName.sendKeys(FirstName);
		log.info("firstName inserted");
	}
	public void insertLastName(String LastName) {
		lastName.clear();
		lastName.sendKeys(LastName);
		log.info("LastName inserted");
	}
	public void insertEmail(String Email) {
		email.clear();
		email.sendKeys(Email);
		log.info("Email inserted");
	}
	public void insertMobileNumber(String MobileNumber) {
		mobileNumber.clear();
		mobileNumber.sendKeys(MobileNumber);
		log.info("MobileNumber inserted");
	}
	public void insertPassword(String Password) {
		password.clear();
		password.sendKeys(Password);
		log.info("Password inserted");
	}
	public void clickConditions() {
		conditions.click();
		log.info("conditions checked");
	}
	public void clickSignUpButton() {
		signUpButton.click();
		log.info("signUpButton clicked");
	}
	public void actionRegistration(String FirstName, String LastName, String Email, String MobileNumber, String Password) {
		this.insertFirstName(FirstName);
		this.insertLastName(LastName);
		this.insertEmail(Email);
		this.insertMobileNumber(MobileNumber);
		this.insertPassword(Password);
		this.clickConditions();
		this.clickSignUpButton();
	}
}
