package OmnilimoProj.Elements.LogIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import OmnilimoProj.Boss;

public class LogInElements extends Boss{

	
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement continueButton;
	
	@FindBy(xpath = "//a[contains(text(),'Don’t have an account? Sign up')]")
	static
	WebElement doNotHaveAccountSignUp;
	
	public LogInElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void insertEmail(String Email) {
		email.clear();
		email.sendKeys(Email);
		log.info("email inserted");
	}
	public void insertPass(String Pass) {
		password.clear();
		password.sendKeys(Pass);
		log.info("password inserted");
	}
	public void clickContinueButton() {
		continueButton.click();
		log.info("continue button clicked");
	}
	public static void clickdoNotHaveAccountSignUp() {
		doNotHaveAccountSignUp.click();
		log.info("doNotHaveAccountSignUp clicked");
	}
	
	public void actionLogIn(String Email, String Pass ) {
		this.insertEmail(Email);
		this.insertPass(Pass);
		this.clickContinueButton();
	}
}
