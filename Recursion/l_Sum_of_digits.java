package Recursion;

import java.util.Scanner;

public class l_Sum_of_digits {

	public static int sumOfDigits(int n) {
		
		if (n==0) {
			return 0;
		}
		
		int previousSum = sumOfDigits(n/10);
		int totalSum = previousSum+n%10;
		
		return totalSum;
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int ans = sumOfDigits(n);
		System.out.println(ans);
	
	}

}
