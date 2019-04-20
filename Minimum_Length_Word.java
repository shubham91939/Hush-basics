package strings;

import java.util.Scanner;

public class Minimum_Length_Word {

	public static String minLengthWord(String str) {
		
		
		String minWord = "";
		String word = "";//temporarily storing word
		String wordEnd=""; //to store temporarily, here end word is checked (later 'for' loop)
		
		int previouscount = Integer.MAX_VALUE;
		int startingIndex=0;
		int count = 0;
		
		
		for (int i = 0; i < str.length(); i++) {
			
			word = word + str.charAt(i);
			count++;

			if (str.charAt(i) == ' ') {

				if (previouscount > count) {
					previouscount = count;
					minWord = word;
				}
				
				startingIndex =i+1;
				count = 0;
				word = "";
			}
			
		}// for abcd efg hi j
		//System.out.println(word);//it has reached j but theres no space to stop.
		
		for (int i=str.length()-1;i>startingIndex;i--) {
			count++;
			
			wordEnd= wordEnd+str.charAt(i);//took different string because if tool the same string then the last word is printed twice
			
			if (previouscount >= count) {
				previouscount = count;
				minWord = wordEnd;// printing jj instead of j in case of abcd efg hi j as it has already reached j in previous loop and word have that value
			}
		}
		return minWord;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		String ans = minLengthWord(str);
		System.out.println(ans);

	}

}
