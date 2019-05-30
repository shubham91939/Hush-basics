package Recursion;

import java.util.Scanner;

public class SumofNumbers {

	public static int sumofNumbers(int n) {
		
		if (n==0) {
			return n;
		}
		
		int previousAns = sumofNumbers(n-1);
		int ans = n+previousAns;
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		
		int ans =sumofNumbers(n);
		System.out.println(ans);
	
	}

}
