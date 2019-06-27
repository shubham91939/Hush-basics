package Recursion;

import java.util.Scanner;

public class j_FindGeometricSum {

	public static double findGeometricSum(int n) {
		if (n==0) {
			return 1;
		}
		
		double previousAns = findGeometricSum(n-1);
		double totalAns =  (previousAns+(1/Math.pow(2, n)));
		
		return totalAns;
		
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		
		double ans  = findGeometricSum(n);
		System.out.println(ans);
	}

}
