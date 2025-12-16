package GSITAssignment;

interface Transport{
	void Booking();
	
}

class Bus implements Transport{
	
	public void Booking() {
		System.out.println("Travel through Transport : Bus");
	}
	
}
class Flight implements Transport{
	
	public void Booking() {
		System.out.println("Travel through Transport : Flight");
	}
	
	
}

public class Question18 {

	public static void main(String[] args) {
		
      Transport ref = new Bus();
      ref.Booking();
      
      Transport ref1 = new Flight();
      ref1.Booking();
      
 
	}

}
