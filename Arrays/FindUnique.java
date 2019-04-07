package practice;

import java.util.Scanner;

public class FindUnique {

	public static int[] ArrayInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void PrintArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}

	public static int SumArray(int[] arr) {
		int sum=0;
		
		for (int i=0;i<arr.length;i++) {
			
			sum = sum+arr[i];
		}
		return sum;
	}
	
	public static int NormalSum(int[] arr) {
		int n = arr.length;
		
		int sum= ((n-2)*(((n-2)+1)))/2;
		
		return sum;
	}
	public static void main(String[] args) {
		int[] arr = ArrayInput();
		PrintArray(arr);
		System.out.println("");
		
		int sumofarray = SumArray(arr);
		System.out.println(sumofarray);
		
		int sumofnumbers = NormalSum(arr);
		System.out.println(sumofnumbers);
		
		int duplicate = sumofarray-sumofnumbers;
		System.out.println("Duplicate = "+duplicate );
	}

}
