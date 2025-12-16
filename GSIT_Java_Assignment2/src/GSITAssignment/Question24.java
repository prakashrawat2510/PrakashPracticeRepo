package GSITAssignment;


class Shape1{
	
	float length =10;
	
	
	float square() {
		return length*length;
	}
	
	float rectangle(float breadth) {
		return  length*breadth;
		
	}
	
	float circle(float r) {
		return 3.14f*r*r;
	}
}


public class Question24 {

	public static void main(String[] args) {
		
		 Shape1 obj = new Shape1();
	System.out.println("Square area :" + obj.square());	 
	
	System.out.println("Rectangle area :" + obj.rectangle( 54));
	
	System.out.println("Circle area :" + obj.circle(3));

	}

}
