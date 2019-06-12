package Recursion;

import java.util.Scanner;

public class a_PrintNumber {

	public static void printNumber(int n) {
		if (n==0) {
			return;
		}
		printNumber(n-1);
		System.out.println(n);
	}
	
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		printNumber(n);
	}

}
