package Array_2;

import java.util.Scanner;

public class Push_Zeros_to_end {

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

	public static void push_ZerotoEnd(int[] arr) {

		int i = 0;
		int j = 0;
		while (i < arr.length && j<arr.length) {
			if (arr[i] != 0) {
				i++;
				j++;
			}

			else {
				while (j < arr.length && arr[j] == 0) {
						j++;
					} 
				if (j<arr.length){
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}

			}
			i++;
		}

	

	/*
	 * int j; for (int i=1;i<arr.length;i++) { j=i;
	 * 
	 * while (j>=1 && arr[j-1]==0) { int temp=arr[j]; arr[j]=arr[j-1];
	 * arr[j-1]=temp; j--; }
	 * 
	 * }
	 */
	// }

	public static void main(String[] args) {

		int[] arr = inputArray();
		push_ZerotoEnd(arr);
		printArray(arr);
	}

}
