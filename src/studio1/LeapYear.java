package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println ("year?");
		int year = in.nextInt();
		
		boolean divFour = (year % 4 == 0);
		
		boolean hundred = (year %100 != 0) || (year % 400 == 0);
		
		boolean leapYear = divFour && hundred;
		
		System.out.println(year + " is a leap year: " + leapYear);
		
		
		
		
	}

}
