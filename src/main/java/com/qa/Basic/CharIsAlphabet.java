package com.qa.Basic;

public class CharIsAlphabet {

	public static void main(String[] args) {
	  
		  char ch = '&';
		  
		if((ch>= 'A' && ch<= 'Z' ) ||(ch>= 'a' && ch<= 'z' )) {
			System.out.println( ch  +" is an alphabet");
		}else {
			System.out.println(ch + " not an alphabet");
		}
	}

}
