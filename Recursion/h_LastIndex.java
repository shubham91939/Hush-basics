package Recursion;

import java.util.Scanner;

public class h_LastIndex {

	public static int[] inputArray() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void arrayPrint(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static int lastIndex(int[] arr, int check, int startIndex) {

		if (startIndex == arr.length) {
			return -1;
		}

		int smallAns = lastIndex(arr, check, startIndex + 1);

		if (smallAns < 0) {////in case of 80088 and search 8, the condition will not be satisfied and it'll not check
			if (arr[startIndex] == check) {
				return startIndex;
			}
		}
		return smallAns;
	}

	public static void main(String[] args) {

		int[] arr = inputArray();
		Scanner s = new Scanner(System.in);
		int check = s.nextInt();
		int startIndex = 0;

		int ans = lastIndex(arr, check, startIndex);
		System.out.println(ans);

	}

}
