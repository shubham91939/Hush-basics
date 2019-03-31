package arrays_1;

import java.util.Scanner;

public class c_Linear_Search {
	
	public static int[] inputArray() {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[] arr = new int[n];
		
		for (int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	public static int binarySearch(int[] arr, int check) {
		
		int index =-1;
		for (int i = 0; i<arr.length;i++) {
			
			if (arr[i]==check) {
				index = i;
				break;
			}
			
		}
		return index;
	}
	
	public static void main(String[] args) {
		
		int [] arr = inputArray();
		Scanner s = new Scanner(System.in);
		int check = s.nextInt();
		
		int ans =binarySearch(arr, check);
		
		System.out.println(ans);
	}

}
