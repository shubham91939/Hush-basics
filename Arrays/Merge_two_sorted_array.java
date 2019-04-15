package Array_2;

import java.util.Scanner;

public class Merge_two_sorted_array {

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

	public static int[] mergetwoarray(int[] arr1, int[] arr2) {
		
		int m=arr1.length;
		int n =arr2.length;
		
		int length = m+n; 
		int[] merged = new int[length];
		
		for (int i=0;i<merged.length;i++) {
			
			if (arr1[i]>arr2[i]) {
				merged[i]=arr1[2];
				i++;
			}

			
		}
		
		
		return arr2;

	}

	public static void main(String[] args) {

		int[] arr1 = inputArray();
		int[] arr2 =inputArray();
		mergetwoarray(arr1, arr2);
	}

}
