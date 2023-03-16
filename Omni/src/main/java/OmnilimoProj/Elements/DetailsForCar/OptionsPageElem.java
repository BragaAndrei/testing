package OmnilimoProj.Elements.DetailsForCar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import OmnilimoProj.Boss;
import OmnilimoProj.CommonFunction;

public class OptionsPageElem extends Boss {

	public String actDate;

	@FindBy(id = "from.airportAirlineFlightInfo.airlineId-container")
	WebElement pickUpAirline;

	@FindBy(xpath = "//div[contains(text(),'AM - Aeromexico')]")
	WebElement pickUpValue;

	@FindBy(xpath = "//input[@id='from.airportAirlineFlightInfo.flightNumber']")
	WebElement pickUpFlightTail;

	@FindBy(xpath = "//input[@id='from.airportAirlineFlightInfo.scheduledDateTime']")
	static WebElement scheduledDate;

	@FindBy(xpath = "//body[1]/div[3]/main[1]//div[2]//div[2]/div[4]//input[1]")
	WebElement scheduledTime;
	// drop
	@FindBy(xpath = "//div[@id='to.airportAirlineFlightInfo.airlineId-container']")
	WebElement dropOffAirline;

	@FindBy(xpath = "//div[contains(text(),'9A - Air Atlantic')]")
	WebElement dropOffAirlineValue;

	@FindBy(xpath = "//input[@id='to.airportAirlineFlightInfo.flightNumber']")
	WebElement dropOffFlightTail;

	@FindBy(xpath = "//input[@id='to.airportAirlineFlightInfo.scheduledDateTime']")
	WebElement dropOffScheduledDate;

	@FindBy(xpath = "//body[1]//main[1]//div[2]/div[2]//div[4]//input[1]")
	WebElement dropOffScheduledTime;

	@FindBy(xpath = "//input[@id='passengerCount']")
	WebElement passengerCount;

	@FindBy(xpath = "//input[@id='luggageCount']")
	WebElement luggageCount;

	@FindBy(xpath = "//input[@id='tripNotes']")
	WebElement notesForTheChauffeur;

	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	WebElement doYouNeedReturnRideYES;

	@FindBy(xpath = "//button[contains(text(),'No')]")
	WebElement doYouNeedReturnRideNO;
	// Do you need a return ride? YES
	@FindBy(xpath = "//input[@id='returnRide.from']")
	WebElement fromReturn;

	@FindBy(xpath = "//input[@id='returnRide.to']")
	WebElement toReturn;

	@FindBy(xpath = "//input[@id='returnRide.date']")
	WebElement dateReturn;

	@FindBy(xpath = "//input[@id='returnRide.time']")
	WebElement timeReturn;
	//
	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement continute;

	@FindBy(xpath = "//button[contains(text(),'Back')]")
	WebElement back;

	public OptionsPageElem() {
		PageFactory.initElements(driver, this);
	}

	public void selectPickUpAirline() {
		pickUpAirline.click();
		CommonFunction.jsActions(pickUpValue);
		log.info("valuetPickUpAirline selected");
	}

	public void insertPickUpFlightTail(String pickUpFlightTailNumber) throws InterruptedException {
		//CommonFunction.jsActionInsert(pickUpFlightTail, pickUpFlightTailNumber);
		Thread.sleep(1000);
		pickUpFlightTail.sendKeys(pickUpFlightTailNumber);
		log.info("pickUpFlightTailNumber inserted");
	}

	public String selectScheduledDate() { // date
		return scheduledDate.getAttribute("value");

	}

	public void selectScheduledTime(String valueScheduledTime) { // time

		scheduledTime.sendKeys(valueScheduledTime);
		log.info("valueScheduledTime selected");
	}

	public void selectDropOffAirline() { // drop

		dropOffAirline.click();
		dropOffAirlineValue.click();
		log.info("valueDropOffAirline selected");
	}

	public void insertDropOffFlightTail(String valueDropOffFlightTail) {
		dropOffFlightTail.sendKeys(valueDropOffFlightTail);
		log.info("valueDropOffFlightTail inserted");
	}

	public void selectDropOffScheduledDate(String valueDropOffScheduledDate) {
		dropOffScheduledDate.sendKeys(valueDropOffScheduledDate);
		log.info("valueDropOffScheduledDate inserted");
	}

	public void selectDropOffScheduledTime(String valueDropOffScheduledTime) {
		dropOffScheduledTime.sendKeys(valueDropOffScheduledTime);
		log.info("valueDropOffScheduledTime inserted");
	}

	public void insertPassengerCount(String passengerNumber) {
		passengerCount.sendKeys(passengerNumber);
		log.info("passengerNumber inserted");
	}

	public void insertLuggageCount(String luggageNumber) {
		luggageCount.sendKeys(luggageNumber);
		log.info("luggageNumber inserted");
	}

	public void insertNotesForTheChauffeur(String messageForTheChauffeur) {
		notesForTheChauffeur.sendKeys(messageForTheChauffeur);
		log.info("messageForTheChauffeur inserted");
	}

	public void clickDoYouNeedReturnRideYES() {
		doYouNeedReturnRideYES.click();
		log.info("clicked doYouNeedReturnRideYES YES");
	}

	public void clickDoYouNeedReturnRideNO() {
		doYouNeedReturnRideNO.click();
		log.info("clicked doYouNeedReturnRideNO NO");
	}

	public void insertFromReturn(String valueFromReturn) {
		fromReturn.sendKeys(valueFromReturn);
		log.info("valueFromReturn inserted");
	}

	public void insertToReturn(String valueToReturn) {
		toReturn.sendKeys(valueToReturn);
		log.info("valueToReturn inserted");
	}

	public void selectDateReturn(String valueDateReturn) {
		dateReturn.sendKeys(valueDateReturn);
		log.info("valueDateReturn inserted");
	}

	public void selectTimeReturn(String valueTimeReturn) {
		timeReturn.sendKeys(valueTimeReturn);
		log.info("valueTimeReturn inserted");
	}

	public void clickContinute() {
		continute.click();
		log.info("continute clicked and moved to next page");
	}

	public void actionSetUpValueNoReturnSameAddress(String pickUpFlightTailNumber, String selectScheduledTime,
			String valueDropOffFlightTail, String valueDropOffScheduledDate, String valueDropOffScheduledTime,
			String passengerNumber, String luggageNumber, String messageForTheChauffeur) throws InterruptedException {
		
		this.selectScheduledDate();
		this.selectPickUpAirline();
		this.insertPickUpFlightTail(pickUpFlightTailNumber);
		this.selectScheduledTime(selectScheduledTime);
		this.selectDropOffAirline();
		this.insertDropOffFlightTail(valueDropOffFlightTail);
		this.selectDropOffScheduledDate(valueDropOffScheduledDate);
		this.selectDropOffScheduledTime(valueDropOffScheduledTime);
		this.insertPassengerCount(passengerNumber);
		this.insertLuggageCount(luggageNumber);
		this.insertNotesForTheChauffeur(messageForTheChauffeur);
		this.clickDoYouNeedReturnRideNO();

		this.clickContinute();

	}
	
	public void actionSetUpValueNoReturnDiffAddress(String pickUpFlightTailNumber, String selectScheduledTime,
			String valueDropOffFlightTail, String valueDropOffScheduledDate, String valueDropOffScheduledTime,
			String passengerNumber, String luggageNumber, String messageForTheChauffeur) throws InterruptedException {
		
		this.selectScheduledDate();
		this.selectPickUpAirline();
		this.insertPickUpFlightTail(pickUpFlightTailNumber);
		this.selectScheduledTime(selectScheduledTime);
		//this.selectDropOffAirline();
		//this.insertDropOffFlightTail(valueDropOffFlightTail);
		//this.selectDropOffScheduledDate(valueDropOffScheduledDate);
		//this.selectDropOffScheduledTime(valueDropOffScheduledTime);
		this.insertPassengerCount(passengerNumber);
		this.insertLuggageCount(luggageNumber);
		this.insertNotesForTheChauffeur(messageForTheChauffeur);
		this.clickDoYouNeedReturnRideNO();

		this.clickContinute();

	}
	public String getDate() {
		return selectScheduledDate();
	}

}
