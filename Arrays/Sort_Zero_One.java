package Array_2;

import java.util.Scanner;

public class Sort_Zero_One {

	public static int[] inputArray() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] sortZeroOneTwo(int[] arr) {

		int i = 0;
		int j = 0;
		int k = arr.length - 1;

		while (j <= k) {
			if (arr[j] == 0 && j <= k) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				i++;
			}

			else if (arr[j] == 2 && j <= k) {
				int temp = arr[k];
				arr[k] = arr[j];
				arr[j] = temp;

				k--;
			} else {
				j++;
			}
		}

		return arr;

	}

	public static void main(String[] args) {
		int[] arr = inputArray();
		int[] ans = sortZeroOneTwo(arr);
		printArray(ans);

	}

}
