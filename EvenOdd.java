package lecture2;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner s =new Scanner (System.in);
		
		int a = s.nextInt();
		
		if (a%2 == 0) {
			System.out.println("Even");
		}
		
		else {
			System.out.println("Odd");
		}
		System.out.println("always runs");
	}

}
