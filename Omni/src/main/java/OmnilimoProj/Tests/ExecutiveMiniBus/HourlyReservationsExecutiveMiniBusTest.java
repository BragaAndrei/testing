package OmnilimoProj.Tests.ExecutiveMiniBus;

import org.testng.annotations.Test;

import OmnilimoProj.Boss;
import OmnilimoProj.Elements.DetailsForCar.Confirmation;
import OmnilimoProj.Elements.DetailsForCar.OptionsPageElem;
import OmnilimoProj.Elements.DetailsForCar.PassengerPageElem;
import OmnilimoProj.Elements.DetailsForCar.PaymentMethod;
import OmnilimoProj.Elements.DetailsForCar.ExecutiveMiniBus.HourlyExecutiveMiniBusDetailsVehicle;
import OmnilimoProj.Elements.DetailsForCar.Sprinter.SprinterDetailsVehicle;
import OmnilimoProj.Elements.HomePage.MainPage;
import OmnilimoProj.Elements.LogIn.LogInElements;

public class HourlyReservationsExecutiveMiniBusTest extends Boss {

	LogInElements logInElements;
	MainPage mainPage;
	HourlyExecutiveMiniBusDetailsVehicle hourlyExecutiveMiniBusDetailsVehicle;
	OptionsPageElem optionsPageElem;
	PassengerPageElem passengerPageElem;
	PaymentMethod paymentMethod;
	Confirmation confirmation;
	public String exDate;

	@Test
	public void stepsToRepBookHourly() throws InterruptedException {

		mainPage = new MainPage(driver);
		mainPage.clickSignIn();

		logInElements = new LogInElements(driver);
		logInElements.actionLogIn(System.getenv("OmniEmailDev"), System.getenv("OmniPassDev"));

		mainPage.actionHourly("LAS Concourse D", "6", "10:50 AM");

		hourlyExecutiveMiniBusDetailsVehicle = new HourlyExecutiveMiniBusDetailsVehicle();
		hourlyExecutiveMiniBusDetailsVehicle.clickNextButton();
		hourlyExecutiveMiniBusDetailsVehicle.clickNextButton();
		hourlyExecutiveMiniBusDetailsVehicle.clickNextButton();
		hourlyExecutiveMiniBusDetailsVehicle.checkPriceDetailsDiffAddress();
		

		optionsPageElem = new OptionsPageElem();
		exDate = optionsPageElem.getDate();

		optionsPageElem.actionSetUpValueNoReturnDiffAddress("Test", "08/14/2023", "11:50 AM", "Test", "03/20/2023",
				"11:50 AM", "2", "2");

		passengerPageElem = new PassengerPageElem();
		passengerPageElem.actionCheckPassengerDetails();

		paymentMethod = new PaymentMethod();
		paymentMethod.useOneCreatedCard();

		confirmation = new Confirmation();
		confirmation.checkAllINfoDiffAddressHourly(exDate);

		hourlyExecutiveMiniBusDetailsVehicle.checkDetailsOnConfirmationPageDiffAddress();
		SprinterDetailsVehicle.checkTypeOfVehicleExecutiveMiniBus();
		
		confirmation.clickConfirmBookingButton();
		Confirmation.getApprovel();
	}
}
