package com.qa.Basic;

public class DisplayAToZ {

	public static void main(String[] args) {
		
		char ch ;
		
		for( ch = 'A'; ch <='Z'; ch++) {
			
			System.out.print(ch + " "); 
		}
		
		// other way without initializing variable
		
		for(char c = 'A'; c<= 'Z';c++) {
			System.out.println(c + " ");
		}
	
	}

}
