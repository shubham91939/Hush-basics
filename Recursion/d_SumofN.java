package Recursion;

import java.util.Scanner;

public class d_SumofN {

	public static int sumToN(int n) {
		
		if  (n==0) {
			return 0;
		}
		int previousSum= sumToN(n-1);
		int totalSum = n+previousSum;
		
		return totalSum;
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int ans = sumToN(n);
		System.out.println(ans);
	
	}

}
