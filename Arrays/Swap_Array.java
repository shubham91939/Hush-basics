package practice;

import java.util.Scanner;

public class Swap_Array {

	public static int[] InputArray() {
		Scanner s =new Scanner(System.in);
		int n =s.nextInt();

		int[] arr =new int[n];
		
		for (int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	
	public static void PrintArray(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] SwapArray(int[] arr) {
		
		
		for (int i=0;i<arr.length-1;i+=2) {
			int temp =arr[i];	
			arr[i]=arr[i+1];
			arr[i+1]= temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr =InputArray();
		
		int[] swapedarr = SwapArray(arr);
		PrintArray(swapedarr);
	}
}
