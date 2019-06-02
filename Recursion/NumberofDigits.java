package Recursion;

import java.util.Scanner;

public class NumberofDigits {
	
	public static int numCount(int num) {
		
		if (num==0) {
			return 0;
		}
		
		int smallAns = numCount(num/10);
		smallAns+=1;
		
		return smallAns;
	}
	
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		
		int ans = numCount(num);
		System.out.println(ans);
	}

}
