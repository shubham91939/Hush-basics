package lecture_3_Programming_Fundamentals_2;

import java.util.Scanner;

public class trailing_Zeros_in_Factorial {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int zero=0;
		int i=5;
		while (n%i==0) {
			
				zero=zero+(n/i);
			
			i*=5;
		}
		System.out.println(zero);
	
	}

}
