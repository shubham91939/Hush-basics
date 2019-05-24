package Lecture14;

import java.util.Scanner;

public class MergeSort {

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

	public static void mergeSort(int[] arr, int startIndex, int endIndex) {

		if (startIndex >= endIndex) {
			return;
		}

		int mid = (startIndex + endIndex) / 2;

		mergeSort(arr, startIndex, mid);
		mergeSort(arr, mid + 1, endIndex);

		merging(arr, startIndex, endIndex);

	}

	public static void merging(int[] arr, int startIndex, int endIndex) {

		int mid = (startIndex + endIndex) / 2;

		int[] temp = new int[(endIndex - startIndex) +1];// making a temp array of length end-start+1

		int i = startIndex;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= endIndex) {

			if (arr[i] < arr[j]) {// agar i chotta hai paste i in temp

				temp[k++] = arr[i++];
				/*
				 * i++; k++;
				 */

			} else {
				temp[k++] = arr[j++]; // agar j chotta hai paste j.
				/*
				 * k++; j++;
				 */

			}
		}

		while (i <= mid) {
			// paste this half in temp
			temp[k] = arr[i];
			k++;
			i++;
		}

		while (j <= endIndex) {
			// paste remaining in temp
			temp[k] = arr[j];
			j++;
			k++;
		}
		
		  for (int p =0;p<=temp.length-1;p++) {//paste values of temp into arr.
		 
			  arr[startIndex+p]=temp[p];
		 }
	}

	public static void main(String[] args) {

		int[] arr = arrayInput();

		int startIndex = 0;
		int endIndex = arr.length-1;

		mergeSort(arr, startIndex, endIndex);
		
		arrayPrint(arr);
		
	}

}
