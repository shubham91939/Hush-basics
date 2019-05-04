package lecture_2_programming_Fundamentals_1;

import java.util.Scanner;

public class Sum_of_Even_Numbers_till_N {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int evensum = 0;

		while (n >= i) {
			
			if (i % 2 == 0) {
				evensum = evensum + i;
			}
			i += 1;
		}
		System.out.println(evensum);
	}

}
