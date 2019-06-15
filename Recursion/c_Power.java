package Recursion;

import java.util.Scanner;

public class c_Power {
	public static int power(int x, int n) {

		if (n == 0) {
			return 1;
		}
		int previousPowers = power(x, n - 1);
		int finalPower = previousPowers * x;

		return finalPower;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();

		int ans = power(x, n);
		System.out.println(ans);

	}

}
