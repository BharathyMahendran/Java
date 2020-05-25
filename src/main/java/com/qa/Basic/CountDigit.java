package com.qa.Basic;

public class CountDigit {

	public static void main(String[] args) {
		
		int num = 123456;
		
		int count = 0;
		
		while(num != 0) {
			num = num /10;
			++count;
		}
		System.out.println("Number of digit in given number is : " + count);
		
		// using for loop
		
		int n = 234;
		
		int count1 = 0;
		
		for(int i=1; i<=n; i++) {
			count1 = count1 + i;
			num = num/10;
			
			}
		System.out.println("Number of digit in given number is : " + count1);

	}

}
