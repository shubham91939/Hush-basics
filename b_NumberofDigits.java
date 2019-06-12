package Recursion;

import java.util.Scanner;

public class b_NumberofDigits {
	
	public static int printNumber(int n, int count) {
		if (n==0) {
			return 0;
		}
		int previousCount = printNumber(n/10, count);
		count=previousCount+1;
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count=0;
		
		int ans =printNumber(n,count);
		System.out.println(ans);
	}

}
