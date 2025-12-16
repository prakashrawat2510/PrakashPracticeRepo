package GSITAssignment;

class Course{
	
	void courseInfo() {
		System.out.println("Course infomration is here ........");
	}
}

class Science extends Course{
	
	void Scienceinfo() {
		System.out.println("Science syllabus");
	}
}

class Commerce extends Course {
	
	void Commerceinfo() {
		System.out.println("Commerce Syllabus");
	}
}

class Art extends Course{
	
	void artinfo() {
		System.out.println("Art Syllabus");
	}
}

public class Question14 {

	public static void main(String[] args) {
		
		Course obj = new Course();
		obj.courseInfo();
		
		Science obj1 = new Science();
		obj1.Scienceinfo();
		
		Commerce obj2 = new Commerce();
		obj2.Commerceinfo();
		
		Art obj3 = new Art();
		obj3.artinfo();
		

	}

}
