package Recursion;

import java.util.Scanner;

public class f_CheckNumberinArray {

	public static int[] inputArray() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static boolean checkNumber(int[] arr, int check, int startIndex) {

		if (startIndex == arr.length) {
			return false;
		}

		boolean previousCheck = checkNumber(arr, check, startIndex + 1);

		if (arr[startIndex] == check) {
			return true;
		}

		return previousCheck;
	}

	public static void main(String[] args) {

		int[] arr = inputArray();
		Scanner s = new Scanner(System.in);
		int check = s.nextInt();
		int startIndex = 0;

		boolean ans = checkNumber(arr, check, startIndex);
		
		System.out.println(ans);
		
	}

}
