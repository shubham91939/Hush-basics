package Lecture5;

import java.util.Scanner;

public class ArrayInputPrint {

	public static int[] InputArray() {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void PrintArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int largestinArray(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		return max;

	}

	public static int sumarray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;

	}
	public static int LinearSearch (int x, int[] arr) {
		int index =-1;
		for (int i=0;i<arr.length; i++) {
			if (arr[i]==0) {
				index =i;
				break;
			}
		}
		return index;
	}
	
	public static void swapAlternate(int[] arr){
			
      int i =0;
      for (i=0; i<arr.length-1; i+=2){
    	
        int temp= arr[i];
        arr[i]= arr[i+1];
        arr[i+1]=temp;
        
    	  }
      
	}

	public static void main(String[] args) {

		int arr[] = InputArray();
		largestinArray(arr);
		PrintArray(arr);

		swapAlternate(arr);
		//int largest = largestinArray(arr);
		//System.out.println("Largest =" + largest);

		//int sum = sumarray(arr);
		//System.out.println("sum = " + sum);

		//int linearsearch = LinearSearch(x, arr)
	}

}
