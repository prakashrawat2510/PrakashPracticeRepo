package GSITAssignment;

interface Payment{
	
   void MakePayment();
}

class UPI implements Payment{
	
	public void MakePayment() {
		System.out.println("Make the payment through UPI");
	}	
	
}

class Creditcard implements Payment{
	
	public void MakePayment() {
		System.out.println("Make the payment through Credit card");
	}	
}


public class Question6 {

	public static void main(String[] args) {
		
		Payment ref = new UPI();
		ref.MakePayment();
		
		Payment ref1 = new Creditcard();
		ref1.MakePayment();
	}

}
