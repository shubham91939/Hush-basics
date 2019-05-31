package Recursion;

import java.util.Scanner;

public class Multiplication {
	
	public static int multiply(int m, int n) {
		
		//base
		if (n==1) {
			return m;
		}
		
		
		int previousAns = multiply(m, n-1);
		int ans = previousAns+m;
		
		return ans;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int ans = multiply(m, n);
		System.out.println(ans);
		
	}

}
