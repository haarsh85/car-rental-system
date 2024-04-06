package Test1;

public class Motorbike extends Vehicle{
	
	private String bikeType;
	
	public Motorbike(String make, String model, int year, double rentalRate, String bikeType) {
		super(make, model, year, rentalRate);
		this.bikeType = bikeType;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Bike Type" + bikeType);
	}

}
