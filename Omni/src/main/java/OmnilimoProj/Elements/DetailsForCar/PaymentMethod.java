package OmnilimoProj.Elements.DetailsForCar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import OmnilimoProj.Boss;

public class PaymentMethod extends Boss {

	@FindBy(xpath = "//span[contains(text(),'Add new card')]")
	WebElement addNewCard;

	@FindBy(xpath = "//div[contains(text(),'Selected')]")
	WebElement selectedButton;

	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement continueButton;

	public PaymentMethod() {
		PageFactory.initElements(driver, this);
	}

	public void clickSelectedButton() {
		selectedButton.click();
		log.info("selectedButton clicked");
	}

	public void clickcontinueButton() {
		continueButton.click();
		log.info("continueButton clicked");
	}
	
	public void useOneCreatedCard() {
		this.clickSelectedButton();
		this.clickcontinueButton();
	}
	public void addNewCreditCard() {
		
	}

}
