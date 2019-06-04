package Recursion;

import java.util.Scanner;

public class SumofArray {

	public static int Sum(int[] arr, int startIndex) {
		
		if (arr.length==startIndex) {
			return 0;
		}

		int previousAns = Sum(arr, startIndex+1);
		int ans = previousAns + arr[startIndex];
		
		return ans;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int startIndex = 0;

		int ans = Sum(arr, startIndex);
		System.out.println(ans);
	}

}
