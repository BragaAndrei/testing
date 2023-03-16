package OmnilimoProj.Elements.DetailsForCar;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import OmnilimoProj.Boss;
import OmnilimoProj.CommonFunction;
import OmnilimoProj.CommonValues.Cars;
import OmnilimoProj.Elements.DetailsForCar.Sprinter.SprinterDetailsVehicle;
import OmnilimoProj.Tests.OneWayInSameAddressSuvTest;

public class Confirmation extends Boss {

	@FindBy(xpath = "//div[contains(text(),'LAS - Harry Reid International Airport')]")
	WebElement pickUpFrom;

	@FindBy(xpath = "//body[1]//div[2]/div[1]/div[3]/div[1]")
	WebElement destination;

	@FindBy(xpath = "//body//div[1]/div[4]/div[1]")
	WebElement date;

	@FindBy(xpath = "//div[contains(text(),'SUV')]")
	WebElement typeOfVehicle;
	// span[contains(text(),'First name:')]
	@FindBy(xpath = "//div[@class='CheckoutSectionstyled__AdditionalInfoBlock-sc-12g8nrm-16 deKsuu']")
	WebElement firstName;

	@FindBy(xpath = "//button[contains(text(),'Confirm booking')]")
	
	WebElement confirmBookingButton;

	public static String LASHarryReidIntAirport = "LAS - Harry Reid International Airport";
	public static String LASConcourseDWayneNewtonBoulevard = "LAS Concourse D, Wayne Newton Boulevard, Las Vegas, NV, USA";
	public static String LasVegasStrip = "Las Vegas Strip, NV, USA";
	
	public Confirmation() {
		PageFactory.initElements(driver, this);
	}

	public void checkPickUpFromSameAddress() {
		assertEquals(CommonFunction.getLocator("LAS - Harry Reid International Airport").getText(), LASHarryReidIntAirport);
		log.info("pickUpFrom airport checked");
	}

	public void checkDestinationSameAddress() {
		assertEquals(CommonFunction.getLocator("LAS - Harry Reid International Airport").getText(), LASHarryReidIntAirport);
		log.info("destination checked");
	}
	
	public void checkPickUpFromDiffAddress() {
		assertEquals(CommonFunction.getLocator("LAS Concourse D, Wayne Newton Boulevard, Las Vegas, NV, USA").getText(), LASConcourseDWayneNewtonBoulevard);
		log.info("pickUpFrom airport checked");
	}
	
	public void checkPickUpFromDiffAddressHourly() {
		assertEquals(CommonFunction.getLocator("LAS Concourse D, Wayne Newton Boulevard, Las Vegas, NV, USA").getText(), LASConcourseDWayneNewtonBoulevard);
		log.info("pickUpFrom airport checked");
	}

	public void checkDestinationiffAddress() {
		assertEquals(CommonFunction.getLocator("Las Vegas Strip, NV, USA").getText(), LasVegasStrip);
		log.info("destination checked");
	}

	public void checkDate(String expDate) {
		log.info("confirm: " + expDate);
		String actDateRow = date.getText();
		
		assertEquals(actDateRow.substring(0,actDateRow.indexOf(" ")), expDate);

		log.info("Date checked");
	}

	public void checkTypeOfVehicle() {
		assertEquals(typeOfVehicle.getText(), "SUV");
		log.info("typeOfVehicle checked");
	}
	
	public  void clickConfirmBookingButton() {
		confirmBookingButton.click();
		log.info("confirmBookingButton clicked");
	}
	
	public static void getApprovel() {
		assertTrue(CommonFunction.getLocator("Thank you for your reservation! We look forward to serving you.").isDisplayed());
			log.info("Thank you for your reservation! We look forward to serving you. - displayed");	
	}

	public void checkAllINfoSameAddress(String expDate) {
		this.checkPickUpFromSameAddress();
		this.checkDestinationSameAddress();
		this.checkDate(expDate);
		this.checkTypeOfVehicle();
		//this.clickConfirmBookingButton();
	}
	public void checkAllINfoDiffAddress(String expDate) {
		this.checkPickUpFromDiffAddress();
		this.checkDestinationiffAddress();
		this.checkDate(expDate);
		//this.clickConfirmBookingButton();
	}
	public void checkAllINfoDiffAddressHourly(String expDate) {
		this.checkPickUpFromDiffAddress();
		this.checkDate(expDate);
		
		//this.clickConfirmBookingButton();
		
	}
	
}
