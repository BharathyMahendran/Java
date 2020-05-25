package com.qa.Basic;

public class FactorialNumber {

	public static void main(String[] args) {
		
		// !5 = 5*4*3*2*1 = 10
		//!0 = 1;
		
		int num = 5;
		
		int fact  = 1;
		
		for(int i =1; i<=num; i++) {
			
			fact = fact * i;
			}
		System.out.println("Factorial of " + num + " is " + fact);
		
		//Using while loop
		int n = 5;
		int fact1 = 1;
		while(n!=0) {
			fact1 = fact1* n;
			n-=1;
			}
		System.out.println("Factorial of " + num + " is " + fact);
		
		//recursive method
		
		
			
		
	   
		
	}

}
