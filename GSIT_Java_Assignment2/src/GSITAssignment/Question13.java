package GSITAssignment;

class Device {

	void start() {
		System.out.println("Device is start");
	}
	
}

class Mobile extends Device {
	
	void calling () {
		System.out.println("Mobile is calling");
	}
}

class SmartPhone extends Mobile{
	
	void internet () {
		System.out.println("SmartPhone connected through internet");
	}
}


public class Question13 {

	public static void main(String[] args) {
		
		SmartPhone obj = new SmartPhone();
		obj.start();
		obj.calling();
		obj.internet();

	}

}
