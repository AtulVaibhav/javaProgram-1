package com.switch_statement;

public class Test2 {

	public static void main(String[] args) {
		//break 
		for(int i=1;i<=10;i++){
			if(i%2==0){
				break;
			}
			System.out.println(i);
		}
       
		for(int j=1;j<=5;j++){
			for(int k=11;k<=15;k++){
				if(k==13){
					break;
				}
				System.out.println(j+" "+k);
			}
		}
		
		//continue
		for(int i=1;i<=10;i++){
			if(i%2==1)continue;
			System.out.println(i);
		}
		
		System.out.println("______________________");
		for(int j=1;j<=5;j++){
			for(int k=11;k<=15;k++){
				if(k==13){
					continue;
				}
				System.out.println(j+" "+k);
			}
		}
		
		
	}

}
