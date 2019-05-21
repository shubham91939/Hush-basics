package sorting;

import java.util.Scanner;

public class Bubble {

	public static int[] inputArray() {
		Scanner s =new Scanner(System.in);
		int n =s.nextInt();
		int[] arr = new int[n];
		
		for (int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] arraySort(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length-1;j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[] = inputArray();
		printArray(arr);
		System.out.println();
		arraySort(arr);
		printArray(arr);
	}

}
