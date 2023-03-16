package OmnilimoProj.Elements.DetailsForCar.BMW7Series;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import OmnilimoProj.Boss;
import OmnilimoProj.CommonFunction;
import OmnilimoProj.CommonValues.AdditionalFees;
import OmnilimoProj.CommonValues.Cars;

public class BMW7DetailsVehicle extends Boss{

	@FindBy(xpath = "//div[@id='__next']//div[2]/div[2]/div[1]/div[4]")
	WebElement nextButton;

	@FindBy(xpath = "//span[contains(text(),'Details')]")
	WebElement detailsButton;

	@FindBy(xpath = "//div[contains(text(),'All prices include taxes, fees & tips')]")
	WebElement allPricesIncludeTaxesFeesTips;

	@FindBy(xpath = "//p[contains(text(),'Base Charges')]")
	WebElement baseCharges;

	@FindBy(xpath = "//div[contains(text(),'$85.00')]")
	WebElement PriceBaseCharges;

	@FindBy(xpath = "//p[contains(text(),'Fuel Surcharge')]")
	WebElement fuelSurcharge;

	@FindBy(xpath = "//div[contains(text(),'$8.00')]")
	WebElement priceFuelSurcharge;

	@FindBy(xpath = "//p[contains(text(),'Sanitization Fee')]")
	WebElement sanitizationFee;

	@FindBy(xpath = "//div[contains(text(),'$3.00')]")
	WebElement priceSanitizationFee;

	@FindBy(xpath = "//p[contains(text(),'Airport Parking')]")
	WebElement airportParking;

	@FindBy(xpath = "//div[contains(text(),'$5.00')]")
	WebElement priceAirportParking;

	@FindBy(xpath = "//p[contains(text(),'Gratuity')]")
	WebElement gratuity;

	@FindBy(xpath = "//div[contains(text(),'$17.00')]")
	WebElement priceGratuity;

	@FindBy(xpath = "//p[contains(text(),'Credit Card Fee')]")
	WebElement creditCarFee;

	@FindBy(xpath = "//div[contains(text(),'$3.54')]")
	WebElement priceCreditCarFee;

	@FindBy(xpath = "//p[contains(text(),'Passenger Recovery Transportation Charge')]")
	WebElement passengerRecoveryTransportationCharge;

	@FindBy(xpath = "//div[contains(text(),'$3.03')]")
	WebElement pricePassengerRecoveryTransportationCharge;

	@FindBy(xpath = "//span[contains(text(),'Total:')]")
	WebElement total;

	@FindBy(xpath = "//span[contains(text(),'$124.57')]")
	WebElement price;

	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement continueButton;

	@FindBy(xpath = "//div[@class='SelectCarSliderstyled__PriceDetailsBlock-sc-1ozfbep-16 jnJdoF']/div[@class='SelectCarSliderstyled__Price-sc-1ozfbep-15 kNMomE' and contains(text(), '$')]")
	WebElement fixedPrice;

	public BMW7DetailsVehicle() {
		PageFactory.initElements(driver, this);
	}

//	public WebElement getLocator(String stringg) {
//		return driver.findElement(By.xpath("//div[contains(text(),'%s')]".formatted(stringg)));
//	}

	public void checkTypeOfVehicleSUV() {
		Assert.assertEquals(CommonFunction.getLocator("SUV").getText(), Cars.SUV.getName());
		log.info("typeOfVehicle SUV checked");
	}
	public void checkTypeOfVehicleBMW7Series() {
		Assert.assertEquals(CommonFunction.getLocator("BMW 7 Series").getText(), Cars.BMW7Series.getName());
		log.info("typeOfVehicle BMW 7 Series checked");
	}
	public void checkTypeOfVehicleSprinter() {
		Assert.assertEquals(CommonFunction.getLocator("Sprinter").getText(), Cars.Sprinter.getName());
		log.info("typeOfVehicle Sprinter checked");
	}
	public void checkTypeOfVehicleExecutiveMiniBus() {
		Assert.assertEquals(CommonFunction.getLocator("Executive Mini bus").getText(), Cars.ExecutiveMinibus.getName());
		log.info("typeOfVehicle Executive Mini bus checked");
	}
	public void checkTypeOfVehicleBMW5Series() {
		Assert.assertEquals(CommonFunction.getLocator("BMW 5 Series").getText(), Cars.BMW5Series.getName());
		log.info("typeOfVehicle BMW 5 Series checked");
	}

	public void clickNextButton() {
		nextButton.click();
		log.info("nextButton clicked");
	}

	public void clickDetailsButton() {
		CommonFunction.driverWait(fixedPrice);
		detailsButton.click();
		log.info("Price details opened");
	}

	public void checkAllPricesIncludeTaxesFeesTips() {
		Assert.assertEquals(allPricesIncludeTaxesFeesTips.getText(), "All prices include taxes, fees & tips");
		log.info("allPricesIncludeTaxesFeesTips checked");
	}

	public void checkBaseCharges() {
		Assert.assertEquals(baseCharges.getText(), "Base Charges");
		assertEquals(CommonFunction.getLocator("$63.00").getText(), AdditionalFees.BaseChargesBMW7Series.getPrice());
		log.info("baseCharges checked");
	}

	public void checkFuelSurcharge() {
		Assert.assertEquals(fuelSurcharge.getText(), "Fuel Surcharge");
		assertEquals(CommonFunction.getLocator("$8.00").getText(), AdditionalFees.FuelSurchargeBMW7Series.getPrice());
		log.info("Fuel Surcharge checked");
	}

	public void checkSanitizationFee() {
		Assert.assertEquals(sanitizationFee.getText(), "Sanitization Fee");
		assertEquals(CommonFunction.getLocator("$3.00").getText(), AdditionalFees.SanitizationFeeBMW7Series.getPrice());
		log.info("Sanitization Fee checked");
	}

	public void checkAirportParking() {
		assertEquals(airportParking.getText(), "Airport Parking");
		assertEquals(CommonFunction.getLocator("$5.00").getText(), AdditionalFees.AirportParkingSUV.getPrice());
		log.info("Airport Parking checked");
	}

	public void checkGratuity() {
		assertEquals(gratuity.getText(), "Gratuity");
		assertEquals(CommonFunction.getLocator("$12.60").getText(), AdditionalFees.GratuityBMW7Series.getPrice());
		log.info("gratuity checked");
	}

	public void checkCreditCarFee() {
		assertEquals(creditCarFee.getText(), "Credit Card Fee");
		assertEquals(CommonFunction.getLocator("$2.60").getText(), AdditionalFees.CreditCardFeeBMW7Series.getPrice());
		log.info("Credit Card Fee checked");
	}
	

	public void checkPassengerRecoveryTransportationCharge() {
		assertEquals(passengerRecoveryTransportationCharge.getText(), "Passenger Recovery Transportation Charge");
		assertEquals(CommonFunction.getLocator("$2.22").getText(), AdditionalFees.PassengerRecoveryTransportationChargeBMW7Series.getPrice());
		log.info("Passenger Recovery Transportation Charge checked");
	}

	public void checkTotal() {
		assertEquals(total.getText(), "Total:");
		assertEquals(CommonFunction.getLocator("$91.42").getText(), "$" + Cars.BMW7Series.getPrice());
	}

	public void clickContinueButton() {
		continueButton.click();
		log.info("continueButton clicked");
	}

	public void checkPriceDetails() throws InterruptedException {
		this.checkTypeOfVehicleBMW7Series();
		this.checkAllPricesIncludeTaxesFeesTips();
		this.clickDetailsButton();
		this.checkBaseCharges();
		this.checkFuelSurcharge();
		this.checkSanitizationFee();
		//this.checkAirportParking();
		this.checkGratuity();
		this.checkCreditCarFee();
		this.checkPassengerRecoveryTransportationCharge();
		this.checkTotal();
		this.clickContinueButton();
	}

	public void checkDetailsOnConfirmationPageSameAddress() {
		this.checkBaseCharges();
		this.checkFuelSurcharge();
		this.checkSanitizationFee();
		this.checkAirportParking();
		this.checkGratuity();
		this.checkCreditCarFee();
		this.checkPassengerRecoveryTransportationCharge();
		this.checkTotal();
	}
	
}
