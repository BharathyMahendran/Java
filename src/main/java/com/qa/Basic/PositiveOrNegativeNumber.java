package com.qa.Basic;

import java.util.Scanner;

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		double num = reader.nextInt();
		
		if(num > 0.0) {
			System.out.println(num + " is a positive number");
		}else if(num<0.0) {
			System.out.println( num + " is a negative number");
		}else {
			System.out.println(" it is zero");
		}

	}

}
