package Recursion;

import java.util.Scanner;

public class r_StringtoInteger {

	public static int stringsToInteger(String str) {
		
		if (str.length()==0) {
			return 0;
		}
		
		int previousAns =  stringsToInteger(str.substring(1));
		
		int totalAns = str.charAt(0)-'0';
		
		totalAns=(int) (totalAns*Math.pow(10, str.length()-1))+previousAns;
		
		return totalAns;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int ans = stringsToInteger(s.nextLine());
		
		// ans = ans/10;
		
		System.out.println(ans);
	}

}
