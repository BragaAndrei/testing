package OmnilimoProj.Elements.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import OmnilimoProj.Boss;
import OmnilimoProj.CommonFunction;

public class MainPage  extends Boss{
	
	final static String signInVar = "Sign in";
	
	@FindBy(xpath = "//header/a[1]/span[1]/img[1]")
	WebElement logo;
	
	@FindBy(xpath = "//a[contains(text(),'"+signInVar+"')]")
	static WebElement signIn;
	
	@FindBy(xpath = "//input[@id='from']")
	WebElement from;
	
//	@FindBy(xpath = "//strong[contains(text(),'Las Vegas International Airport (LAS)')]")
//	WebElement nameOfAirPort;
	
	@FindBy(xpath = "//input[@id='to']")
	WebElement to;
	
	@FindBy(xpath = "//input[@id='date']")
	WebElement date;
	
	@FindBy(xpath = "//button[@aria-label='Next Month']")
	WebElement nextMonth;
	
	@FindBy(xpath = "//input[@id='time']")
	WebElement time;
	
	@FindBy(xpath = "//div[contains(text(),'14')]")
	WebElement dateValue;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement book;
	
	@FindBy(xpath = "//input[@id='duration']")
	WebElement duration;
	
	@FindBy(xpath = "//span[contains(text(),'Hourly')]")
	WebElement hourly;
	
	@FindBy(xpath = "//span[contains(text(),'One-way')]")
	WebElement oneWay;
	
	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickSignIn() {
		signIn.click();
		log.info("signIn clicked");
	}
	
	public void checkLogo() {
		Assert.assertEquals(logo.isDisplayed(), true);
		log.info("Logo on main page checked");
	}
	public void insertFromDifferentAddress(String From) { //DifferentAddress
		from.sendKeys(From);
		CommonFunction.getLocatorStrongTag("LAS Concourse D").click();
		log.info("from inserted");
	}
	
	public void insertDuration(String hours ) throws InterruptedException {
		CommonFunction.jsActions(duration);
		duration.click();
		duration.sendKeys(hours + " hours");
		CommonFunction.getLocator(hours + " hours").click();
		log.info("duration inserted");
	}
	
	public void insertToDifferentAddress(String To) { //DifferentAddress
		to.sendKeys(To);
		CommonFunction.getLocatorStrongTag("Las Vegas Strip").click();
		log.info("to inserted");
	}
	
	public void insertFromSameAddress(String From) { //SameAddress
		from.sendKeys(From);
		CommonFunction.getLocatorStrongTag("Las Vegas International Airport (LAS)").click();
		log.info("from inserted");
	}
	public void insertToSameAddress(String To) { //SameAddress
		to.sendKeys(To);
		CommonFunction.getLocatorStrongTag("Las Vegas International Airport (LAS)").click();
		log.info("to inserted");
	}
	
	public void setDate() throws InterruptedException {
		date.click();
		nextMonth.click();
		nextMonth.click();
		nextMonth.click();
		nextMonth.click();
		nextMonth.click();
		dateValue.click();
		log.info("Date inserted");
	}
	
	public void setTime(String Time) {
		time.clear();
		time.sendKeys(Time);
		log.info("time inserted");
	}
	public void clickBook() {
		CommonFunction.jsActions(book);
		book.click();
		log.info("book button clicked");
	}
	public void clickHourly() {
		hourly.click();
		log.info("hourly button clicked");	
	}
	
	public void actionOneWay(String From, String To, String Time) throws InterruptedException {
		this.checkLogo();
		this.insertFromSameAddress(From);
		this.insertToSameAddress(To);
		this.setDate();
		this.setTime(Time);
		this.clickBook();
	}
	
	public void actionOneWayDifAddress(String From, String To, String Time) throws InterruptedException {
		this.checkLogo();
		this.insertFromDifferentAddress(From);
		this.insertToDifferentAddress(To);
		this.setDate();
		this.setTime(Time);
		this.clickBook();
	}
	
	
	public void actionHourly(String from, String hours, String time) throws InterruptedException {
		this.clickHourly();
		this.insertFromDifferentAddress(from);
		this.insertDuration(hours);
		this.setDate();
		this.setTime(time);
		this.clickBook();
	}
	
	
}
