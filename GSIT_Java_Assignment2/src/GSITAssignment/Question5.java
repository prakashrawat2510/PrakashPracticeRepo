package GSITAssignment;


abstract class Animal{
	
	abstract void sound();
}

class dog extends Animal{
	
	void sound() {
		System.out.println("Test");
	}
}

class cat extends Animal {
	
	void sound() {
		System.out.println("Hello test");
	}
}

public class Question5 {

	public static void main(String[] args) {
		
		dog ref = new dog();
		ref.sound();
		
		cat ref1 =new cat();
		ref1.sound();

	}

}
