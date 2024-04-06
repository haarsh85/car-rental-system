package Test1;

public class Truck extends Vehicle{
	
	private int loadCapacity;
	private boolean isFourWheelDrive;
	private String cargoType;
	
	public Truck(String make, String model, int year, double rentalRate, int loadCapacity, boolean isFourWheelDrive, String cargoType) {
		super(make, model, year, rentalRate);
		this.loadCapacity = loadCapacity;
		this.isFourWheelDrive = isFourWheelDrive;
		this.cargoType = cargoType;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Load Capacity: " + loadCapacity);
		System.out.println("Four wheel drive: " + isFourWheelDrive);
		System.out.println("Cargo type: " + cargoType);
		
	}

}
