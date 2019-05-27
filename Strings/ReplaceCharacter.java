package strings2;

import java.util.Scanner;

public class ReplaceCharacter {

	public static void printString (String str) {
		for (int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
	}
	public static String replaceCharacter(String str, char c1, char c2) {
		
		String retval ="";

		for (int i=0;i<str.length();i++) {
		
			if (str.charAt(i)==c1) {
				retval= retval+c2;
			}
			
			else {
				retval=retval+str.charAt(i);
			}
		}
		return retval;
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char c1 = s.next().charAt(0);
		char c2 = s.next().charAt(0);
		
		String ans =replaceCharacter(str,c1,c2);
		printString(ans);
	
	}

}
