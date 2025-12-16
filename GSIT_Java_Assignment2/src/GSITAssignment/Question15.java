package GSITAssignment;

class LoanCalculator{
	
	void calculateLoan(int amount){
		
		System.out.println("Amount : "+ amount);
	}
	
	void calculateLoan(int amount, double interestRate) {
		
		System.out.println("Amount : "+ amount +" || "+ " Interestrate : "+ interestRate);
		
	}
	
}


public class Question15 {

	public static void main(String[] args) {
		
		LoanCalculator obj = new LoanCalculator();
		obj.calculateLoan(322222);
		
		obj.calculateLoan(3222, 9);

	}

}
