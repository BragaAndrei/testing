package OmnilimoProj.CommonValues;

public enum AdditionalFees {
	// AdditionalFees ONE way 
	///SUV
	BaseChargesSUV("$85.00"),
	FuelSurchargeSUV("$8.00"),
	SanitizationFeeSUV("$3.00"),
	AirportParkingSUV("$5.00"),
	GratuitySUV("$17.00"),
	CreditCardFeeSUV("$3.39"),
	PassengerRecoveryTransportationChargeSUV("$2.88"),
	TotalSUV("$119.27"),
	///BMW7Series
	BaseChargesBMW7Series("$63.00"),
	FuelSurchargeBMW7Series("$8.00"),
	SanitizationFeeBMW7Series("$3.00"),
	AirportParkingBMW7Series("$5.00"),
	GratuityBMW7Series("$12.60"),
	CreditCardFeeBMW7Series("$2.60"),
	PassengerRecoveryTransportationChargeBMW7Series("$2.22"),
	TotalBMW7Series("$91.42"),
	//Sprinter
	BaseChargesSprinter("$97.00"),
	FuelSurchargeSprinter("$9.00"),
	SanitizationFeeSprinter("$7.00"),
	AirportParkingSprinter(""),
	GratuitySprinter("$19.40"),
	CreditCardFeeSprinter("$3.97"),
	PassengerRecoveryTransportationChargeSprinter("$3.39"),
	TotalSprinter(""),
	
	//ExecutiveMinibus
	BaseChargesExecutiveMinibus("$150.00"),
	FuelSurchargeExecutiveMinibus("$9.00"),
	SanitizationFeeExecutiveMinibus("$7.00"),
	AirportParkingExecutiveMinibus(""),
	GratuityExecutiveMinibus("$30.00"),
	CreditCardFeeExecutiveMinibus("$5.88"),
	PassengerRecoveryTransportationChargeExecutiveMinibus("$4.98"),
	TotalExecutiveMinibus("$206.86"),
	
	///BMW5Series
	BaseChargesBMW5Series("$55.00"),
	FuelSurchargeBMW5Series("$8.00"),
	SanitizationFeeBMW5Series("$3.00"),
	AirportParkingBMW5Series(""),
	GratuityBMW5Series("$11.00"),
	CreditCardFeeBMW5Series("$2.31"),
	PassengerRecoveryTransportationChargeBMW5Series("$1.98"),
	TotalBMW5Series("$81.29"),
	
	//////// AdditionalFees Hourly ///////
	
		///SUV - 3 hours
		BaseChargesSUVHourly("$255.00"),
		FuelSurchargeSUVHourly("$24.00"),
		SanitizationFeeSUVHourly("$3.00"),
		AirportParkingSUVHourly("$5.00"),
		GratuitySUVHourly("$51.00"),
		CreditCardFeeSUVHourly("$9.99"),
		PassengerRecoveryTransportationChargeSUVHourly("$8.46"),
		TotalSUVHourly("$351.45"),
		///BMW7Series - 9.5 hours
		BaseChargesBMW7SeriesHourly("$598.50"),
		FuelSurchargeBMW7SeriesHourly("$76.00"),
		SanitizationFeeBMW7SeriesHourly("$3.00"),
		AirportParkingBMW7SeriesHourly("$5.00"),
		GratuityBMW7SeriesHourly("$119.70"),
		CreditCardFeeBMW7SeriesHourly("$23.92"),
		PassengerRecoveryTransportationChargeBMW7SeriesHourly("$20.33"),
		TotalBMW7SeriesHourly("$841.45"),
		
		//Sprinter - 12.5
		BaseChargesSprinterHourly("$1,212.50"),
		FuelSurchargeSprinterHourly("$112.50"),
		SanitizationFeeSprinterHourly("$7.00"),
		AirportParkingSprinterHourly(""),
		GratuitySprinterHourly("$242.50"),
		CreditCardFeeSprinterHourly("$47.24"),
		PassengerRecoveryTransportationChargeSprinterHourly("$39.96"),
		TotalSprinterHourly("$1,661.70"),
		
		//ExecutiveMinibus - 6 hours 
		BaseChargesExecutiveMinibusHourly("$900.00"),
		FuelSurchargeExecutiveMinibusHourly("$54.00"),
		SanitizationFeeExecutiveMinibusHourly("$7.00"),
		AirportParkingExecutiveMinibusHourly(""),
		GratuityExecutiveMinibusHourly("$180.00"),
		CreditCardFeeExecutiveMinibusHourly("$34.23"),
		PassengerRecoveryTransportationChargeExecutiveMinibusHourly("$28.83"),
		TotalExecutiveMinibusHourly("$1,204.06"),
		
		///BMW5Series - 6 hours 
		BaseChargesBMW5SeriesHourly("$330.00"),
		FuelSurchargeBMW5SeriesHourly("$48.00"),
		SanitizationFeeBMW5SeriesHourly("$3.00"),
		AirportParkingBMW5SeriesHourly(""),
		GratuityBMW5SeriesHourly("$66.00"),
		CreditCardFeeBMW5SeriesHourly("$13.41"),
		PassengerRecoveryTransportationChargeBMW5SeriesHourly("$11.43"),
		TotalBMW5SeriesHourly("$471.84");
	
	private final String price;
	
	AdditionalFees(String price) {
		this.price = price;
	}
	public String getPrice() {
		return price;
	}
	
	
}
