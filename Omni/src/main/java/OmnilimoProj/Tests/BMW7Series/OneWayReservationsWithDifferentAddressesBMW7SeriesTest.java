package OmnilimoProj.Tests.BMW7Series;

import org.testng.annotations.Test;

import OmnilimoProj.Boss;
import OmnilimoProj.Elements.DetailsForCar.Confirmation;
import OmnilimoProj.Elements.DetailsForCar.OptionsPageElem;
import OmnilimoProj.Elements.DetailsForCar.PassengerPageElem;
import OmnilimoProj.Elements.DetailsForCar.PaymentMethod;
import OmnilimoProj.Elements.DetailsForCar.BMW7Series.BMW7DetailsVehicle;
import OmnilimoProj.Elements.DetailsForCar.SUV.VehiclePageElem;
import OmnilimoProj.Elements.DetailsForCar.Sprinter.SprinterDetailsVehicle;
import OmnilimoProj.Elements.HomePage.MainPage;
import OmnilimoProj.Elements.LogIn.LogInElements;

public class OneWayReservationsWithDifferentAddressesBMW7SeriesTest extends Boss { //One way reservations with different addresses 


	LogInElements logInElements;
	MainPage mainPage;
	BMW7DetailsVehicle bmv7DetailsVehicle;
	OptionsPageElem optionsPageElem;
	
	PassengerPageElem passengerPageElem;
	PaymentMethod paymentMethod;
	Confirmation confirmation;
	public String exDate;
	@Test
	public void stepsToRepBookBMW7() throws InterruptedException {
		mainPage = new MainPage(driver);
		mainPage.clickSignIn();
		
		logInElements = new LogInElements(driver);
		logInElements.actionLogIn(System.getenv("OmniEmailDev"), System.getenv("OmniPassDev"));

		mainPage.actionOneWayDifAddress("LAS Concourse D", "Las Vegas Strip", "10:50 AM");
		
		bmv7DetailsVehicle = new BMW7DetailsVehicle();
		bmv7DetailsVehicle.clickNextButton();
		bmv7DetailsVehicle.checkPriceDetails();
		
		optionsPageElem = new OptionsPageElem();
		exDate = optionsPageElem.getDate();

		
		optionsPageElem.actionSetUpValueNoReturnDiffAddress("Test", "08/14/2023", "11:50 AM", "Test", "03/20/2023", "11:50 AM",
				"2", "2");

		passengerPageElem = new PassengerPageElem();
		passengerPageElem.actionCheckPassengerDetails();

		paymentMethod = new PaymentMethod();
		paymentMethod.useOneCreatedCard();

		confirmation = new Confirmation();
		confirmation.checkAllINfoDiffAddress(exDate);
		SprinterDetailsVehicle.checkTypeOfVehicleBMW7Series();
		confirmation.clickConfirmBookingButton();
		Confirmation.getApprovel();

		
		
		
		
		
		
		
		
	}
	
	
}
