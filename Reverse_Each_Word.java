package strings;

import java.util.Scanner;

public class Reverse_Each_Word {

	public static String reverseEachWord(String str) {
		String retVal = "";// main string
		int startWord=0;

		for (int i = 0; i < str.length(); i++) {
			String reverseWord = "";

			if (str.charAt(i) == ' ') {

				for (int j = i - 1; j >= startWord; j--) {
					reverseWord = reverseWord +str.charAt(j);
				}
				startWord = i+1;
				retVal=retVal+reverseWord+" ";
			}
			
		}
		for (int j=str.length()-1;j>=startWord;j--) {
			retVal=retVal+str.charAt(j);
		}
		
		return retVal;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String ans=  reverseEachWord(str);
	
		System.out.print(ans);
	}

}
