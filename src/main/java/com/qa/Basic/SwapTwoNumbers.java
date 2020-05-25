package com.qa.Basic;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 30;
		
		System.out.println(" Before swapping the value of a is :" + a);
		System.out.println(" Before swapping the value of b is :" + b);
		
		System.out.println("*************");
		
		int temp = a; 
		a = b ; 
		b = temp; 
		
		System.out.println(" After swapping the value of a is :" + a);
		System.out.println(" After swapping the value of b is :" + b);
		
		// with out using temp variable
		
		System.out.println("******************");
		
		int x =200;
		int y = 50;
		
		System.out.println(" Before swapping the value of x is :" + x);
		System.out.println(" Before swapping the value of y is :" + y);
		
		System.out.println("*************");
		
		x = x+y; 

		y = x-y ; 
		
		x = x-y ; 
		
		System.out.println(" After swapping the value of x is :" + x);
		System.out.println(" After swapping the value of y is :" + y);
		
		
	}

}
