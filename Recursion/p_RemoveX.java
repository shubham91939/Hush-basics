package Recursion;

import java.util.Scanner;

public class p_RemoveX {

	public static String removeX(String str ) {
		
		if (str.length()==0) {
			String ans ="";
			return ans;
		}
		
		String i =removeX(str.substring(1));
		if (str.charAt(0)!='x') {
			i = str.charAt(0)+i;
		}
		return i;
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		String ans = "";
		
		String answer = removeX(str);
		
		for (int i=0;i<answer.length();i++) {
			System.out.print(answer.charAt(i));
		}
	}

}
