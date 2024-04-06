package Test1;

import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
	
	private List<Vehicle> availableVehicles;
	private List<Vehicle> rentedVehicles;
	
	public RentalSystem() {
		availableVehicles = new ArrayList<>();
		rentedVehicles = new ArrayList<>();
	}
	
	//to add vehicles to rental system
	public void addVehicle(Vehicle vehicle) {
		availableVehicles.add(vehicle);
	}
	
	public List<Vehicle> getAvailableVehicles(){
		return availableVehicles;
	}
	
	public List<Vehicle> getRentedVehicles(){
		return rentedVehicles;
	}
	
	//to rent vehicle
	public void rentVehicle(Vehicle vehicle) {
		if(availableVehicles.contains(vehicle)) {
			availableVehicles.remove(vehicle);
			rentedVehicles.add(vehicle);
		}
	}
	
	//to return rented vehicle
	public void returnVehicle(Vehicle vehicle) {
		if(rentedVehicles.contains(vehicle)) {
			rentedVehicles.remove(vehicle);
			availableVehicles.add(vehicle);
		}
	}
	
	//To display available and rented vehicles
	public void displayRentalInfo() {
		System.out.println("Available vehicles: ");
		for(Vehicle av : availableVehicles) {
			av.displayInfo();
			System.out.println();
		}
		
		System.out.println("Rented vehicles: ");
		for(Vehicle rv : rentedVehicles) {
			rv.displayInfo();
			System.out.println();
		}
	}
	
	//To calculate total rental cost
	public double calculateRentalCost(Vehicle vehicle, int rentalDuration) {
		double rentalRate = vehicle.getRentalRate();
		double totalCost = rentalRate * rentalDuration;
		return totalCost;
	}

}
