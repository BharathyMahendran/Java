package com.qa.Basic;

public class PrimeNumber {

	public static void main(String[] args) {
		
		// number can be divisble by 1 or by itself
		
		int num =19;
		boolean flag = false;
		
		for(int i = 2 ; i<=num/2 ;i++) {
			if(num % i == 0) {
				flag = true;
				break;
			}
			
		}
		if(! flag) {
			
			System.out.println(num + " is a prime number");
			
		}else {
			System.out.println(num + " is not a prime number");
		}
	}

}
