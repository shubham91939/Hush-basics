package strings2;

import java.util.Scanner;

public class Different_Lines {
	
	public static void printString(String str) {
		
		for (int i=1;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner( System.in);
		String str = s.nextLine();
		printString(str);
	}

}
