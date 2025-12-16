package GSITAssignment;

class School{
	String schoolname;
	
	School(){
		schoolname = "Uttarakhand Public School";
		System.out.println("Display the school name :" + schoolname);
	}
	
	
	void display() {

		System.out.println("This School is based out of Kolkata");
	}
	
}

public class Question25 {

	public static void main(String[] args) {
		
		School obj = new School();
	
		
		obj.display();

	}

}
