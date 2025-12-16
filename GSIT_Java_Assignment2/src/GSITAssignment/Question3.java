package GSITAssignment;

class Product{
	
	int productId;
	String productName;
	float price;
	
	Product(){
		
		System.out.println("Product created ");
	}
	
	
	Product(int productId, String productName, float price){
		this.productId=productId;
		this.productName=productName;
		this.price=price;		
	}
	
	void displayproduct() {
		System.out.println("Product Id : "+" " + productId +" "+ "Product name is : "+ " "+ productName +" " + "Price is : "+ price );
	}
	
}


public class Question3 {

	public static void main(String[] args) {
		
		Product obj = new Product();
		Product obj2 = new Product(12,"Lays",10);
		obj2.displayproduct();

	}

}
