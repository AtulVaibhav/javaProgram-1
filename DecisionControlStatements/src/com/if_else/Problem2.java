package com.if_else;

public class Problem2 {
   public static void getPrice(int quantity,int costPerUnit){
	   
	   int totalCost = quantity * costPerUnit;
	   if(totalCost>=1000){
		   totalCost = (int) (totalCost - (totalCost*0.1));
		   System.out.println(totalCost);
	   }else{
		   System.out.println(totalCost);
	   }
   }
	public static void main(String[] args) {
		getPrice(9,100);
	}

}
