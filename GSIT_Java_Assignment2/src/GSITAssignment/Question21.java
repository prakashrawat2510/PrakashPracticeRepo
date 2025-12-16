package GSITAssignment;


class University {
	
	static String country ="India";
	String universityName;
	
	
	void display() {
		
		System.out.println("University Country :"+ country +" || "+ "University Name :"+ universityName);
	}
	
}


public class Question21 {

	public static void main(String[] args) {
		
		
		University obj = new University();
	obj.universityName="Jims";	
	obj.display();
	
	University obj2 = new University();
	obj2.universityName="Amity";
	obj2.display();

	}

}
