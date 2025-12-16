package GSITAssignment;

class Employee{
	
	private int empid;
	private String name;
	private float salary;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	void displaydetails() {
		System.out.println(empid+ "  "+ name +" "+ salary);
	}}

public class Question1 {
	
	public static void main(String[] args) {
		
		
		Employee obj = new Employee();
		
	    obj.setEmpid(12);
		
		obj.setName("Prakash");
		
		obj.setSalary(60000.33f);
		
		obj.displaydetails();
	}
}
