package arrays_1;

import java.util.Arrays;
import java.util.Scanner;

public class g_Print_Array_Intersection {

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

	public static void arrayIntersection(int[] arr1, int[] arr2) {

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int i = 0;
		int j = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				System.out.print(arr1[i] + " ");
				i++;
				j++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				i++;
			}

		}

	}

	public static void main(String[] args) {

		int[] arr1 = inputArray();
		int[] arr2 = inputArray();
		
		
		arrayIntersection(arr1, arr2);

	}

}
