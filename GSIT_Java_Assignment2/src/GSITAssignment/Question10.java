package GSITAssignment;

class Student1{
	
	static String collegename = "JIMS";
	String name;
	int rollno;
	
	void display() {
		System.out.println("College name : " +collegename + " "+ "Student name :"+ name + " "+ "Student rollno :" + rollno );
	}
}

public class Question10 {

	public static void main(String[] args) {
		
		
		Student1 obj = new Student1();
		obj.name="Prakash";
		obj.rollno =21;
		obj.display();
		
		Student1 obj1 = new Student1();
         obj1.name="Saurabh";
         obj1.rollno=41;
         obj1.display();
         
         Student1 obj2 = new Student1();
         obj2.name="Rishabh";
         obj2.rollno=11;
         obj2.display();
         
         Student1 obj3 = new Student1();
         obj3.name="Vedant";
         obj3.rollno=15;
         obj3.display();
         
	}

}
