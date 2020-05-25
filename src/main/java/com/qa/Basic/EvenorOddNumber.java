package com.qa.Basic;

import java.util.Scanner;

public class EvenorOddNumber {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter a digit");
		
		int num = reader.nextInt();
		if(num % 2 == 0) {
			System.out.println(num + " = is  a Even Number" );
		}else {
			System.out.println( num + " = is a  Odd Number"  );
		}

	}

}
