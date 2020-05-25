package com.qa.Basic;

import java.util.Scanner;

public class CheckVowelOrConsonant {

	public static void main(String[] args) {
		
		char ch = 'A';
        char c = 'a';
        
		if(ch == 'a' || ch =='e'|| ch =='i'||ch =='o'|| ch =='u') {
			System.out.println(ch +  " is a Vowel");
		}else {
			System.out.println( ch + " is a Consonant");
			
			
		}
		
		
				
		switch  (c) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			
			System.out.println(c +  " is a Vowel");
			
			break;
			
			default:
				System.out.println(c + " is a Consonant");
				break;


		}
		
	}

}
