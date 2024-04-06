# car-rental-system
I have created a simple Vehicle Rental System using Java. This code contains inheritance, object creation and method overriding.

# Summary:
We have a class hierarchy with a base class called Vehicle and three subclasses: Car, Motorcycle, and Truck. Each vehicle type will have its unique attributes and methods. Additionally, we'll create a RentalSystem class to manage rental operations, allowing users to rent and return vehicles while calculating rental costs. Comments are added to respective line of codes for easy understanding.

# Contents
Vehicle class:
- Attributes: make, model, year, rentalRate
- Methods: getMake(), getModel(), getRentalRate()
  
Subclasses (Car, Motorbike and Truck):
- Inherited from the Vehicle class.
- Has unique attributes and overridden the diaplayInfo() method.
  
RentalSystem class:
- Maintains lists of available and rented vehicles.
- Has methods to add vehicle, rent a vehicle, return a vehicle, display rental information.
- Calculate total rental cost based on rental duration and vehicle’s rental rate.
  
RentalSystemDemo:
- Has the main method.
- Has user-friendly interface for renting, returning, and displaying vehicle information.
