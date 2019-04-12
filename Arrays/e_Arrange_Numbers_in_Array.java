package arrays_1;

import java.util.Scanner;

public class e_Arrange_Numbers_in_Array {

	public static int[] inputArray() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		
		int j=1;
		for (int i = 0; i < n; i++) {
			arr[i] = j;
			j++;
		}
		return arr;
	}
	
	public static void arrayPrint(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static int[] arrangeNumber(int[] arr) {
		int[] arrangedNumbers=new int[arr.length];
		
		int a= 0;//arrange even numbers in new array arrangeNumbers
		int b=arr.length-1;//arrange odd numbers in new array 
		
		for (int i=0;i<arr.length;i++) {
			if (i%2==0) {
				arrangedNumbers[a]=arr[i];
				a++;
			}
			
			else {
				arrangedNumbers[b]=arr[i];
				b--;
			}
			
		}
		
		return arrangedNumbers;
	}
	
	public static void main(String[] args) {
		
		int[] arr = inputArray();
		int[] ans = arrangeNumber(arr);
		arrayPrint(arr);
		System.out.println();
		arrayPrint(ans);
		
	}

}
