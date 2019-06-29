package Recursion;

import java.util.Scanner;

public class k_CountZero {

	public static int countZero(int n) {
		if (n==0) {
			return 0;
		}
		int previousCount = countZero(n/10);
		
		if(n%10==0) {
			previousCount=previousCount+1;;
		}
		return previousCount;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	
		int ans = countZero(n);
		System.out.println(ans);
	}

}
