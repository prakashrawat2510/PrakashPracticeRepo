package GSITAssignment;

class Account{
	
	private String accountholdername;
	private float balance;
	
	
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		if(balance <0) {
			System.out.println("This is a warning");
		}else{
		
		this.balance = balance;
		}
		
		
	}	
}

public class Question12 {

	public static void main(String[] args) {
		
		Account obj = new Account();
		obj.setAccountholdername("Prakash");
	 System.out.println(obj.getAccountholdername());	
	 
	 obj.setBalance(-1);
	 System.out.println(obj.getBalance());

	}

}
