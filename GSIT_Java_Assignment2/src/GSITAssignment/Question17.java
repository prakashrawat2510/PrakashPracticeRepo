package GSITAssignment;

abstract class employee{
	
abstract void calculateSalary();

void employedetail() {
	System.out.println("Employee Details...");
}	
}

class FullTimeEmployee extends employee{

	
	void calculateSalary() {
		double HRA = 10000;
		double basicsalary = 12000;
		
		System.out.println("Full Time Employee salary :"+ HRA + basicsalary);
	}	
}

class PartTimeEmployee extends employee{
	
	void calculateSalary() {
		int workinghour =4;
		int hours = 1000;
		
		System.out.println("Part Time Employee salary :"+ workinghour * hours);
		}	
	}

public class Question17 {

	public static void main(String[] args) {
		
		FullTimeEmployee obj = new FullTimeEmployee ();
		obj.employedetail();
		obj.calculateSalary();
		
		PartTimeEmployee obj2 = new PartTimeEmployee();
		obj2.employedetail();
		obj2.calculateSalary();
	}

}
