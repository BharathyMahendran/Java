package com.qa.Basic;

public class PalidromeNumber {

	public static void main(String[] args) {
		
		int num = 1221;
		
		int rev = 0;
		
		int actualNumber = num;
		
		while( num != 0) {
			int n = num% 10;
			rev = rev* 10 + n;
			num = num /10;
			
		}
		System.out.println(rev);
		
		if (actualNumber == rev) {
			System.out.println(actualNumber + " : is a palidrome");
		}
		else {
			System.out.println(actualNumber + " is not a palidrome");
		}

	}

}
