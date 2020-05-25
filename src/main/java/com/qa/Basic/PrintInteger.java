package com.qa.Basic;

import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println(" please enter number");
		
		int num = reader.nextInt();
		
		System.out.println(" Number entered is: " + num);

	}

}
