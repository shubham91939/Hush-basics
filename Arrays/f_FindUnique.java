package arrays_1;

import java.util.Arrays;
import java.util.Scanner;

public class f_FindUnique {

	public static int[] arrayInput() {
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

	public static int findUnique(int[] arr) {

		int unique = Integer.MIN_VALUE;
		int i = 0;
		int j = 0;

		while (i < arr.length) {
			while (j < arr.length) {

				if (arr[i] == arr[j] && i != j) {
					i++;
					j = 0;
				} else {
					j++;
				}
			}

			unique = arr[i];
			break;
		}

		return unique;
	}

	public static void main(String[] args) {
		int[] arr = arrayInput();

		int ans = findUnique(arr);
		System.out.println(ans);
	}

}
