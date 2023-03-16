package OmnilimoProj.Elements.DetailsForCar;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import OmnilimoProj.Boss;

public class PassengerPageElem extends Boss{

	@FindBy(xpath ="//input[@id='firstName']")
	WebElement firstName;
	
	@FindBy(css ="#lastName")
	WebElement lastName;
	
	@FindBy(css ="#email")
	WebElement email;
	
	@FindBy(xpath ="//input[@name='mobileNumber']")
	WebElement mobileNumber;
	
	@FindBy(xpath ="//button[contains(text(),'Continue')]")
	WebElement continueButton;
	
	@FindBy(xpath ="//button[contains(text(),'Back')]")
	WebElement backButton;
	
	public PassengerPageElem() {
		PageFactory.initElements(driver, this);
	}
	
	public void checkFirstName() {
		
		assertEquals(firstName.getAttribute("value"), "DevAndrei");
		log.info("first name checked");
	}
	public void checkLastName() {
		assertEquals(lastName.getAttribute("value"), "Dev");
		log.info("last name checked");
	}
	public void checkEmailAddress() {
		assertEquals(email.getAttribute("value"), "dev@gmail.com");
		log.info("email address checked");
	}
	public void checkMobileNumber() {
		assertEquals(mobileNumber.getAttribute("value"), "+1 (000) 000-000");
		log.info("Mobile Number checked");
	}
	public void clickContinueButton() {
		continueButton.click();
		log.info("continueButton clicked");
	}
	public void actionCheckPassengerDetails() throws InterruptedException {
		
		this.checkFirstName();
		this.checkLastName();
		this.checkEmailAddress();
		this.checkMobileNumber();
		this.clickContinueButton();
	}
	
	
}
