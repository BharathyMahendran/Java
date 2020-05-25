package OOPsConcept;

import java.util.Scanner;

public class AddInteger {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println(" Enter digit 1");
		
		int x = reader.nextInt();
		
		System.out.println(" enter digit 2");
		
		int y = reader.nextInt();
		
		Sum num = new Sum();
		
		System.out.println(num.sum(x, y));
		
		
		double a = 9.99d;
		double b = 10.99d;
		
		Sum s = new Sum();
		
		System.out.println(s.sum(a, b));
		

}
	
}
