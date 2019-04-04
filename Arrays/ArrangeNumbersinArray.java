package Array_1;

import java.util.Scanner;

public class ArrangeNumbersinArray {

	public static int[] inputArray() {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] arr = new int[n];

		int[] arranged = new int[n];// empty array
		int j = 1;// for printing value

		for (int i = 0; i < n; i++) {
			arr[i] = j;
			j++;

			if (n % 2 != 0) {

				for (int m = 0; m < ((n - 1) / 2); m++) {

					if (arr[i] % 2 != 0) {

						arranged[m] = arr[i];
					}

					else {

					}
				}

			}

		}
		return arr;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] arrangeNumbers(int[] arr) {
		int length = arr.length;
		int i = 0;
		int j = arr.length - 1;
		;

		int[] arranged = new int[length];

		for (i = 0; i < arr.length; i++) {

			if (arr[i] % 2 != 0) {
				arranged[i] = arr[i];
			}

			else {
				arranged[j] = arr[i];
				j--;
			}
		}

		return arranged;
	}

	public static void main(String[] args) {

		int[] arr = inputArray();
		int[] ans = arrangeNumbers(arr);

		printArray(arr);
	}

}
