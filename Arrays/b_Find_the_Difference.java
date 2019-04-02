package arrays_1;

import java.util.Scanner;
//sum of even indices - sum of odd indices
public class b_Find_the_Difference {


	public static int[] inputArray() {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[] arr = new int[n];
		
		for (int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	public static int findDifference(int[] arr) {
		int sumEven=0;
		int sumOdd=0;
		
		for (int i = 0;i<arr.length;i++) {
			if (i%2==0) {
				sumEven=arr[i]+sumEven;
			}
			else {
				sumOdd=arr[i]+sumOdd;
			}
		}
		
		
		return sumEven-sumOdd;
	}
	
	public static void main(String[] args) {
		int [] arr = inputArray();
		
		int ans = findDifference(arr);
		System.out.println(ans);
		
	}

}
