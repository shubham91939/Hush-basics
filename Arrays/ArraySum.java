package arrays_1;

import java.util.Scanner;

public class a_ArraySum {
	
	public static int[] inputArray() {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[] arr = new int[n];
		
		for (int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	
	public static void arrayPrint(int[] arr) {
		
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static int arraySum (int[] arr) {
		
		int sum=0;
		for (int i = 0 ; i<arr.length;i++) {
			sum = sum+arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int [] arr = inputArray();
		//arrayPrint(arr);
		
		int ans = arraySum(arr);
		System.out.println(ans);
	}

}
