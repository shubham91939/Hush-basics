package array_2;

import java.util.Scanner;

public class f_Maximize_the_Sum {

	public static int[] arrayInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void arrayPrint(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static long maximizeSum(int[] arr1, int[] arr2) {
		long finalSum =0;
		long s1=0;
		long s2=0;
		int i=0,j=0;
		
		while (i<arr1.length&&j<arr2.length) {
			
			if (arr1[i]>arr2[j]) {
				s2=s2+arr2[j];
				j++;
			}
			else if (arr2[j]>arr1[i]) {
				s1=s1+arr1[i];
				i++;
			}
			
			else if (arr1[i]==arr2[j]) {
				s1=s1+arr1[i];
				s2=s2+arr2[j];
				
				if (s1>s2) {
					finalSum = s1+finalSum;
				}
				else {
					finalSum = s2+finalSum;
				}
				i++;j++;
				s1=0;s2=0;
			}
			
		}
		
/*		5
		1 3 6 35 75
		7
		1 2 4 25 33 39 45*/
		
		while (i<arr1.length) {
			s1 = s1+arr1[i];
			i++;
		}
		
		while (j<arr2.length) {
			s2=s2+arr2[j];
			j++;
		}
		if (s1>s2) {
			finalSum = s1+finalSum;
		}
		else {
			finalSum = s2+finalSum;
		}
		
		
		return finalSum;			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = arrayInput();
		int[] arr2 = arrayInput();
		
		long ans = maximizeSum(arr1, arr2);
		System.out.println(ans);
	}

}
