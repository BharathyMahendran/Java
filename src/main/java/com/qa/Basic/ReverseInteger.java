package com.qa.Basic;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int num = 98765;
		
		int rev = 0;
		
		System.out.println("Number before reverse is " + num);
		
		while(num != 0) {
			rev = rev * 10 ;
			rev = rev + num % 10 ;
			num = num/10;
			
		}
		System.out.println("Reverse of the number is :" + rev);
	}

}
