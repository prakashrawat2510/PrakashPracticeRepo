package GSITAssignment;

 class Bank{
	
	final String IFSC= "HDFC00004";
	final void showIFSC() {
		System.out.println("IFSC code "+  IFSC);
	}
}

class HDFC extends Bank{
	
	void showIFSC() {
		System.out.println("HDFC  code"+ IFSC);
	}
	
}


public class Question9 {

	public static void main(String[] args) {
		
		HDFC obj = new HDFC();
		obj.showIFSC();
		
		
	
	}

}
