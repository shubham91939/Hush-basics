package arrays_1;

import java.util.Scanner;

public class d_Swap_Alternate {
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
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] swapAlternate(int[] arr) {
		for (int i=0;i<arr.length-1;i+=2) {
			int temp = arr[i];
			arr[i]=arr[i+1];
			arr[i+1]= temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {

		int[] arr = inputArray();
		
		int[] ans = swapAlternate(arr);
		arrayPrint(ans);
	}

}
