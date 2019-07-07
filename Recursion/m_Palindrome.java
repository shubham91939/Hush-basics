package Recursion;

import java.util.Scanner;

public class m_Palindrome {

	public static boolean checkPalindrome(String str) {

		if (str.length() == 1 || str.length() == 0) {
			return true;
		}

		// do with substring, check first and last Index of substring, if true return
		// the substring excluding fist and last of previous substring.

		if (str.charAt(0) == str.charAt(str.length() - 1)) {

			boolean check = checkPalindrome(str.substring(1, str.length() - 1));
			return check;
		}
		
		else {
			return false;
		}

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String str = s.nextLine();
		// int startIndex = 0;
		// int lastIndex = str.length() ;

		boolean ans = checkPalindrome(str);

		System.out.println(ans);
	}

}
