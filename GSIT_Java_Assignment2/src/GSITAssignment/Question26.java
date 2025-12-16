package GSITAssignment;

class school1{
	String name;
	String address;
	String strength;
	
	school1(String name, String strength){
		this.name=name;
		this.strength=strength;
	}
	
	school1(String name, String address, String strength){
		this(name,strength);
		this.address=address;
	}
	
	void display() {
		
	System.out.println("Student name :"+ name +" ||"+" Student address : "+ address +" || "+ "Student strength :"+ " "+ strength);
	}
	
}

public class Question26 {

	public static void main(String[] args) {
		
		school1 obj = new school1("Prakash","Noida","Hard working");
		obj.display();
		
		school1 obj1 =new school1("Pankaj","Talented");
		obj1.display();

	}

}
