package GSITAssignment;

class Shape{
	
	void area() {
		System.out.println("Area of shape");
	}
}


class Rectangle extends Shape{
	void area() {
		System.out.println("Area of Rectangle");
	}
	
}

class Circle extends Shape{
	
	void area() {
		System.out.println("Area of Circle");
	}
}

public class Question8 {

	public static void main(String[] args) {
		
		Shape ref = new Rectangle();
		ref.area();
	
		
		Shape ref1 = new Circle();
		ref1.area();

	}

}
