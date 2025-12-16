package GSITAssignment;

class Calculator{
	
	 double add(int a, int b) {
		return a+b;
	}
	
	 double add(double a, double b) {
		return a+b;
	}
}

public class Question4 {

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		

	System.out.println(obj.add(21, 32));
	System.out.println(obj.add(23.662, 322.652));
		
		
	}

}
