package Recursion;

import java.util.Scanner;

public class n_RemovePi {

	public static String removePi(String str) {
		
		if (str.length()==0) {
			return "";
		}

		if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {

			String replace = "3.14";

			String finalAns = replace+ removePi(str.substring(2));

			return finalAns;
		}

		else {
			String finalAns2 = str.charAt(0) + removePi(str.substring(1));
		
			return finalAns2;
			}
		

	}

	public static void main(String... a) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		int startIndex = 0;

		String temp = "";
		String ans = removePi(str);
		System.out.println(ans);

	}

}
