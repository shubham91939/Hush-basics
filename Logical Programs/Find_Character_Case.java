package lecture_2_programming_Fundamentals_1;

import java.util.Scanner;

public class Find_Character_Case {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		char check = s.next().charAt(0);
		
		if(check>='a'&& check<='z') {
			System.out.println("0");
		}
		
		else if (check>='A'&& check<='Z') {
			System.out.println("1");
			
		}
		else {
			System.out.println("-1");
		}
	}

}
