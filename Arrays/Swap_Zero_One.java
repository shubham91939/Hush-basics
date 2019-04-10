package practice;

import java.util.Scanner;

public class Swap_Zero_One {

	public static int[] InputArray() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void PrintArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sort(int[] arr) {
		int i = 0, j = (arr.length) - 1;
		while (i <= j) {

			if (arr[i] == 0) {
				i++;
				
			} else {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j--;
			}
		}

	}

	public static void main(String[] args) {

		int[] arr = InputArray();
		//PrintArray(arr);
		sort(arr);
		PrintArray(arr);

	}

}
