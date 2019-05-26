package strings2;

import java.util.Scanner;

public class Palindrome {

	public static boolean checkPalindrome(String str) {

		boolean isPalindrome = false;

		int i = 0;
		int j = str.length()-1;

		while (i < j) {

			if (str.charAt(i) == str.charAt(j)) {
				isPalindrome = true;

				i++;
				j--;

			} else {
				isPalindrome = false;
				break;
			}
		}

		return isPalindrome;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		boolean ans = checkPalindrome(str);
		System.out.println(ans);
	}

}
