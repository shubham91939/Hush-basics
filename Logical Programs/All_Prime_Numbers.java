package lecture_3_Programming_Fundamentals_2;

import java.util.Scanner;

public class All_Prime_Numbers {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		long n = s.nextInt();
		int j;
		int i;
		int check = 0;

		for (j = 2; j <= n; j++) {

			for (i = 2; i < j; i++) {
				if (j % i == 0) {
					check = 1;
					break;
				}
			
			}
			if (check==1) {
				System.out.println(j);
			}
		}

		

	}

}
