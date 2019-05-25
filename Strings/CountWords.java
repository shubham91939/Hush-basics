package strings2;

import java.util.Scanner;

public class CountWords {

	public static void printString (String str) {
		for (int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
	}
	
	public static int countWords(String str) {
		int count=1;
		
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i)==' ') {
				count++;
			}
			
		}
		
		return count;
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int ans = countWords(str);
		System.out.println(ans);
	
	}

}
