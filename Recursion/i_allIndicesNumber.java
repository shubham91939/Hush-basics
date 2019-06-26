package Recursion;

import java.lang.reflect.Array;
import java.util.Scanner;

public class i_allIndicesNumber {

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
	public static int[] printAllIndices(int[] arr, int check, int startIndex) {

		if (startIndex == arr.length) {
			int[] s = new int[0];
			return s;
		}
		
		
		int[] smallAns = printAllIndices(arr, check, startIndex+1);
		
		if (arr[startIndex]==check) {
			int[] finalAns= new int[smallAns.length+1];
			
			finalAns[0]=startIndex;
			
			
			for(int i=0;i<smallAns.length;i++) {
				finalAns[i+1]=smallAns[i];
			}
			
			return finalAns;
		}
		else {
			return smallAns;
		}
	
	}

	public static void main(String[] args) {

		int[] arr = inputArray();
		Scanner s = new Scanner(System.in);
		int check = s.nextInt();
		int startIndex = 0;

		int[] ans =printAllIndices(arr, check, startIndex);

		arrayPrint(ans);
	}

}
