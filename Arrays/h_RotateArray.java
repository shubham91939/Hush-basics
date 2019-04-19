package array_2;

import java.util.Scanner;

public class h_RotateArray {
	
	public static int[] arrayInput() {
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
	
	public static int[] rotateArray(int[] arr, int num) {
		int i=0;
		while (i<num) {
			for (int j=0;j<arr.length-1;j++) {
				int temp = arr[j];
				arr[j]= arr[j+1];
				arr[j+1]=temp;
			}
			i++;
		}
		
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = arrayInput();
		Scanner s = new Scanner( System.in);
		int num = s.nextInt();
		int[] ans  = rotateArray(arr, num);
		arrayPrint(ans);
	}

}
