package OmnilimoProj.CommonValues;

public enum Cars {

	SUV("SUV", 124.57),
	BMW7Series("BMW 7 Series", 91.42),
	Sprinter("Sprinter", 139.76),
	ExecutiveMinibus("Executive Mini bus",206.86),
	BMW5Series("BMW 5 Series", 81.29),
	
	SUVHourly("SUV", 124.57),
	BMW7SeriesHourly("BMW 7 Series",  841.45),
	SprinterHourly("Sprinter", 1661.70),
	ExecutiveMinibusHourly("Executive Mini bus",1204.06),
	BMW5SeriesHourly("BMW 5 Series", 471.84);
	
	private final String name;
	private final double price;
	
	Cars(String name, double price) {
		this.name = name;
		this.price = price;
		
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return  price;
	}

	
		
	
}
