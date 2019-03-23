package lecture2;

import java.util.Scanner;

// here our pattern is dependent on the rows rather than n
public class Pattern2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int i = s.nextInt();
		int row = 1;

		while (row <= i) {
			int count = 1;
			while (count <= row) {
				System.out.print("*");
				count = count + 1;
			}
			System.out.println("");
			row = row + 1;

		}
	}
}
