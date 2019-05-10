package assignment_2_Programming_Fundamentals_1;

import java.util.Scanner;

public class Total_Salary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double basic = s.nextLong();

		char grade = s.next().charAt(0);
		int allow = 0;

		if (grade == 'A') {
			allow = 1700;
		} else if (grade == 'B') {
			allow = 1500;
		}

		else if (grade == 'C') {
			allow = 1300;
		}

		else if (grade > 'C') {
			allow = 1300;
		}

		double hra = (20 * basic) / 100;
		double da = (50*basic)/100;
		double pf = Math.round((11*basic)/100);
		
		double totalsalary = ((basic + hra + da + allow) -pf);
	
		int ans =(int) Math.round(totalsalary);
		System.out.println(ans);
	}
	
}
