package com.qa.Basic;

public class PowerOfNumber {
	
	//3^4 = 3*3*3*3

	public static void main(String[] args) {
		
		int num = 3;
		int p = 4;
		int result = 1; // 
		
		while (p != 0) {
			result *= num;
			--p;
		}
		
		System.out.println(result);
		
		int n = 5;
		int pow =3;
		int actual = 1;
		
		for(int i =1 ; i<=pow; i++) {
			actual *=n;
			
		}
		System.out.println(actual);
		
		System.out.println(Math.pow(n, pow));
		

	}
	
	

}
