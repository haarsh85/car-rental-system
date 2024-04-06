package Test1;

import java.util.Scanner;

public class Test1Demo {
	
	public static void main(String[] args) {
		
		//Creating scanner object to get user input
		Scanner scanner = new Scanner(System.in);
		//Creating RentalSystem object which is used to call the respective methods
		RentalSystem rentalSystem = new RentalSystem();
		
		Vehicle car = new Vehicle("Toyota", "Supra", 2020, 100);
		Vehicle car1 = new Vehicle("Toyota", "Supra", 2020, 100);
		Vehicle motorbike = new Vehicle("Honda", "CXR", 2000, 50);
		Vehicle truck = new Vehicle("Ford", "F150", 2001, 200);
		
		rentalSystem.addVehicle(car);
		rentalSystem.addVehicle(car1);
		rentalSystem.addVehicle(motorbike);
		rentalSystem.addVehicle(truck);
		
		while (true) {
			//Options for the user
			System.out.println();
			System.out.println("===== Vehicle Rental System =====");
			System.out.println("1. Rent a Vehicle");
			System.out.println("2. Return a Vehicle");
			System.out.println("3. Display Rental Information");
			System.out.println("4. Exit");
			System.out.println();
			System.out.print("Enter your choice: ");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 1: {
				//Rent a vehicle
				System.out.print("Enter the vehicle make: ");
				String make = scanner.nextLine();
				System.out.print("Enter the vehicle model: ");
				String model = scanner.nextLine();
				
				Vehicle selectedVehicle = null;
				
				//Checks the vehicles in available vehicles
				for(Vehicle v : rentalSystem.getAvailableVehicles()) {
					if(v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model)) {
						selectedVehicle = v;
					}
					
				}
				
				if(selectedVehicle != null) {
					//Add the vehicle to rented vehicles
					rentalSystem.rentVehicle(selectedVehicle);
					System.out.print("Enter the rental duration in days: ");
					int rentalDuration = scanner.nextInt();
					//Calculate total rental cost
					double rc = rentalSystem.calculateRentalCost(selectedVehicle, rentalDuration);
					System.out.println("Successfully rented.");
					System.out.println("Total rental Cost: " + rc);
				}
				else {
					System.out.println("Matching vehicle is not available for rent.");
				}
				break;

			}
			
			case 2: {
				//Return a vehicle
				System.out.println("Enter the vehicle make: ");
				String make = scanner.nextLine();
				System.out.println("Enter the vehicle model: ");
				String model = scanner.nextLine();
				
				Vehicle selectedVehicle = null;
				
				//Checks the vehicles in rented vehicles
				for(Vehicle v : rentalSystem.getRentedVehicles()) {
					if(v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model)) {
						selectedVehicle = v;
					}
				}
				if(selectedVehicle != null) {
					//Add to the returned vehicles
					rentalSystem.returnVehicle(selectedVehicle);
					System.out.println("Vehicle returned successfully.");
				}
				else {
					System.out.println("Invalid return. Vehicle not rented.");
				}
			}
			
			case 3: {
				//Display Rental Information
				rentalSystem.displayRentalInfo();		
				break;
			}
			
			case 4: {
				//Exit
				 System.out.println("Thank you for using the Vehicle Rental System. Goodbye!");
				 scanner.close();
				 System.exit(0);
			}
			
			default:
				System.out.println("Invalid choice. Please enter valid option...");

			}
		}
		

	}

}
