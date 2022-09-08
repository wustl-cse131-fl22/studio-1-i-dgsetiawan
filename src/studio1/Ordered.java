package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();

		boolean ascending = (x < y) && (y < z);
		
		boolean descending = (x > y) && (y > z);
		
		boolean isOrdered = ascending || descending;
		
		System.out.println(isOrdered);
		
		// && makes it so that both statements have to be true for it to print true
		// || or makes it so that if only one statement is true, it'll make it true
	}

}
