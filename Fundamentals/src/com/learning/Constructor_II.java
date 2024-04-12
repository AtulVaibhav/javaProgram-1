package com.learning;

class Product{
	int productId;
	String productName;
	
	public Product(int id,String name){
		productId = id;
		productName = name;
		
	}
	
	public void showDetails(){
		System.out.println("ProductId:"+productId+" ProductName:"+productName);
	}
}
public class Constructor_II {

	public static void main(String[] args) {
		Product p1 = new Product(1001,"MacBook");
		p1.showDetails();
		
		Product p2 = new Product(1002,"Dell-laptops");
		p2.showDetails();	

	}

}
