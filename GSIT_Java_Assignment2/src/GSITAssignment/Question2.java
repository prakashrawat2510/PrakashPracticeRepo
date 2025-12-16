package GSITAssignment;

class Vehicle {
	
	void fuelType() {
		System.out.println("Run on fuel");
	}
	
}

class ElectricCar extends Vehicle{
	
	void fuelType() {
		System.out.println("Run on electricity");
		//super.fuelType();
	}
}


public class Question2 {

	public static void main(String[] args) {
		
		ElectricCar obj = new ElectricCar ();
		obj.fuelType();
		
		Vehicle obj2 = new Vehicle();
		obj2.fuelType();

	}

}
