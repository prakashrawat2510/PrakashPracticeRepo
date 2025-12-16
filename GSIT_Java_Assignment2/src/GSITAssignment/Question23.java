package GSITAssignment;

class Mall{
	
	Mall(){
	
	System.out.println("Welcome to the Mall");
	}
	
	
	Mall(String mallname){
		this();

		System.out.println("MallName is : "+ mallname);
		
	}
	
	
	
}


public class Question23 {

	public static void main(String[] args) {
		
		Mall obj = new Mall("DLF");
		//obj.test();
		

	}

}
