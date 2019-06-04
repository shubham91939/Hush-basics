package Recursion;

import java.util.Scanner;

public class Check_Number_in_Array {

	public static boolean checkNumber1 (int[] arr, int check, int startIndex) {
		//base case;
		
		if (arr.length==startIndex) {
			return false;
		}
		if (arr[startIndex]==check) {
			return true;
		}
		//checking
			boolean nextcheck=checkNumber1(arr, check, startIndex+1);
			
			return nextcheck;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		int check = s.nextInt();
		int startIndex = 0;
		boolean isPresent=false;
		
		boolean ans = checkNumber1(arr, check, startIndex);
		System.out.println(ans);
		
	}

}
