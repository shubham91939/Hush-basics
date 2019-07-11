package Recursion;

import java.util.Scanner;

public class q_pairSum {

	public static String pairSum(String str) {
		if (str.length() == 1) {
			return str;
		}
		if (str.charAt(0) == str.charAt(1)) {
			String previousAns = pairSum(str.substring(1));
			String finalAns = str.charAt(0) + "*" + previousAns;
			return finalAns;
		}

		else {
			String finalAns = str.charAt(0) + pairSum(str.substring(1));
			return finalAns;
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String ans = pairSum(str);
		System.out.println(ans);
	}

}
