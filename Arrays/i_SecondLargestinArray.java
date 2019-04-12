package array_2;

import java.util.Scanner;

public class i_SecondLargestinArray {

	public static int[] arrayInput() {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[] arr = new int[n];
		
		for (int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	//up80at1005 honda city white 
	public static void arrayPrint(int[] arr) {
		
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static int secondLargest(int[] arr) {
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for (int i=0;i<arr.length;i++) {

			if (largest<arr[i]) {
				secondLargest=largest;
				largest=arr[i];
			}
			else if (arr[i]==largest) {
				continue;
			}
			else if (secondLargest<arr[i])  {
				
				secondLargest= arr[i];
			}
		}
		return secondLargest;
	}
	public static void main(String[] args) {

		int[] arr= arrayInput();
		
		int ans = secondLargest(arr);
		System.out.println(ans);
	}

}
