package Recursion;

import java.util.Scanner;

public class g_FirstIndexofNumber {

	public static int[] inputArray() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static int firstIndexNumber(int[] arr,int check, int startIndex) {
		
		if (startIndex==arr.length) {
			return -1;
		}
		
		if (arr[startIndex]==check) {
			return startIndex;
			
		}
		
		int SIcheck = firstIndexNumber(arr, check, startIndex+1);
		
		return SIcheck;
	}
	
	
	public static void main(String[] args) {
		int[] arr = inputArray();
		Scanner s = new Scanner(System.in);
		int check = s.nextInt();
		int startIndex = 0;
	
		int ans = firstIndexNumber(arr,check,startIndex);
		System.out.println(ans);
	}

}
