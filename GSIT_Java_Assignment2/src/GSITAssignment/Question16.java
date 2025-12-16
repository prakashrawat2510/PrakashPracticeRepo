package GSITAssignment;

class Hospital{
	
	void emergencyService(){
		System.out.println("EmergencyService available in our Hospital");	
}
}

class CityHospital extends Hospital{
	
	void emergencyService(){
		System.out.println("EmergencyService available at CityHospital");
		super.emergencyService();
	
}
}


public class Question16 {

	public static void main(String[] args) {
		
		CityHospital obj = new CityHospital();
		obj.emergencyService();

	}

}
