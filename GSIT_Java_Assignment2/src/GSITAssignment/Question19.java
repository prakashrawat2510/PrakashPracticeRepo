package GSITAssignment;


class Camera{
	
	void capture() {
		System.out.println("Capture image through : Camera");
	}
}

class DSLRCamera extends Camera {
	
	void capture() {
		System.out.println("Capture image through : DSLRCamera");
	}
	
}

public class Question19 {

	public static void main(String[] args) {
		
		Camera ref =new  DSLRCamera ();
		ref.capture();

	}

}
