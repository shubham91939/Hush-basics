package Recursion;

import java.util.Scanner;

public class e_SumofArray {
	public static int[] inputArray() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static int sumofArray(int[] arr, int startIndex) {
		
		if (startIndex==arr.length) {
			return 0;
		}
		int previousSum = sumofArray(arr, startIndex+1);
		int totalSum = previousSum+arr[startIndex];
		
		return totalSum;
	}

	public static void main(String[] args) {
		int[] arr = inputArray();
		int startIndex=0;
		
		int ans  = sumofArray(arr, startIndex);
		System.out.println(ans);
	}

}
