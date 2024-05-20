package com.try_catch_I;

public class Try_Catch_V {
	public static void m1(){
		try{
			int result = 0/0;
			System.out.println(result);
			
			String str = null;
			System.out.println(str.length());
			
		}catch(ArithmeticException ae){
			System.out.println("Exception handled by very first catch");
		}
		catch(NumberFormatException ae){
			System.out.println("Exception handled in 1st catch");
		}catch(NullPointerException npe){
			System.out.println("Exception handled in 2nd catch");
		}
		catch(Exception e){
			System.out.println("Exception handled in 3rd catch");
		}
	     System.out.println("Outside try-catch");
	   }
	public static void main(String[] args) {
		m1();
	}

}
