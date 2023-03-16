package OmnilimoProj.Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import OmnilimoProj.Boss;
import OmnilimoProj.Elements.DetailsForCar.Confirmation;
import OmnilimoProj.Elements.DetailsForCar.OptionsPageElem;
import OmnilimoProj.Elements.DetailsForCar.PassengerPageElem;
import OmnilimoProj.Elements.DetailsForCar.PaymentMethod;
import OmnilimoProj.Elements.DetailsForCar.SUV.VehiclePageElem;
import OmnilimoProj.Elements.HomePage.MainPage;
import OmnilimoProj.Elements.LogIn.LogInElements;

public class OneWayInSameAddressSuvTest extends Boss {

	LogInElements logInElements;
	MainPage mainPage;
	VehiclePageElem vehiclePageElem;
	OptionsPageElem optionsPageElem;
	
	PassengerPageElem passengerPageElem;
	PaymentMethod paymentMethod;
	Confirmation confirmation;
	public String exDate;
	@Test
	public void voidStepsToRep() throws InterruptedException, IOException {
		
		mainPage = new MainPage(driver);
		mainPage.clickSignIn();
		
		logInElements = new LogInElements(driver);
		logInElements.actionLogIn(System.getenv("OmniEmailDev"), System.getenv("OmniPassDev"));

		mainPage.actionOneWay("LAS","LAS", "10:50 AM");
		
		
		vehiclePageElem = new VehiclePageElem();
		vehiclePageElem.checkPriceDetails();
		
		optionsPageElem = new OptionsPageElem();
		exDate = optionsPageElem.getDate();

		optionsPageElem.actionSetUpValueNoReturnSameAddress("Test", "08/14/2023", "11:50 AM", "Test", "03/20/2023", "11:50 AM", "2", "2");
				
		passengerPageElem = new PassengerPageElem();
		passengerPageElem.actionCheckPassengerDetails();
		
		paymentMethod = new PaymentMethod();
		paymentMethod.useOneCreatedCard();
		
		confirmation = new Confirmation();
		confirmation.checkAllINfoSameAddress(exDate);
		
		vehiclePageElem.checkDetailsOnConfirmationPageSameAddress();
		confirmation.clickConfirmBookingButton();
		Confirmation.getApprovel();
	}

}
