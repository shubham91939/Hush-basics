package lecture2;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String... s) {

		Scanner s1 = new Scanner(System.in);
		int n = s1.nextInt(); // number of pattern to be printed in each row and column

		int row = 1; // minimum there will be 1 row

		while (row <= n) { //print no of rows

			int c = 1; // min 1 star (column)
			while (c <= n) // this prints 1 row
			{
				System.out.print("*");
				c = c + 1;
			}
			System.out.println("");
			row = row + 1;
		}
	}
}
