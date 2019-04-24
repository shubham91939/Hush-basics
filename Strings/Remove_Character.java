package strings;

import java.util.Scanner;

public class Remove_Character {

	public static String removeCharacter(String str, char check) {

		String removed = "";

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != check) {

				removed = removed + str.charAt(i);
			} else {
				continue;
			}

		}

		return removed;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char check = s.next().charAt(0);
		
		String ans = removeCharacter(str, check);
		System.out.println(ans);
	}

}
