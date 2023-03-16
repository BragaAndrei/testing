package OmnilimoProj.Tests.SUV;

import java.io.IOException;

import org.testng.annotations.Test;

import OmnilimoProj.Boss;
import OmnilimoProj.Elements.DetailsForCar.Confirmation;
import OmnilimoProj.Elements.DetailsForCar.OptionsPageElem;
import OmnilimoProj.Elements.DetailsForCar.PassengerPageElem;
import OmnilimoProj.Elements.DetailsForCar.PaymentMethod;
import OmnilimoProj.Elements.DetailsForCar.SUV.SUVDetailsVehicle;
import OmnilimoProj.Elements.DetailsForCar.SUV.VehiclePageElem;
import OmnilimoProj.Elements.DetailsForCar.Sprinter.SprinterDetailsVehicle;
import OmnilimoProj.Elements.HomePage.MainPage;
import OmnilimoProj.Elements.LogIn.LogInElements;

public class OneWayReservationsWithDifferentAddressesSuvTest extends Boss { //SUV

	LogInElements logInElements;
	MainPage mainPage;
	SUVDetailsVehicle sUVDetailsVehicle;
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

		mainPage.actionOneWayDifAddress("LAS Concourse D", "Las Vegas Strip", "10:50 AM");

		sUVDetailsVehicle = new SUVDetailsVehicle();
		sUVDetailsVehicle.checkPriceDetailsDiffAddress();
		
		
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

		sUVDetailsVehicle.checkDetailsOnConfirmationPageDiffAddress();
		SprinterDetailsVehicle.checkTypeOfVehicleSUV();
		
		confirmation.clickConfirmBookingButton();
		Confirmation.getApprovel();
		
	}
}
