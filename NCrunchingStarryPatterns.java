/*
 Name: Paloma Passos 
 Date: OCTOBER 21th 2021
*/

import java.util.*;
import java.util.Scanner;

public class NCrunchingStarryPatterns {
	private static Scanner keyboard = new Scanner(System.in);

	private static int howMany;
	private static char whatSymbol;
	private static int num;
	private static int n;
	private static int nb;

	public static void main(String[] args) {
		printIdentification();
		printSymbol(howMany, whatSymbol);
		perfectNumber(num);
		Fibonacci(n);
		printLargest(nb);
	}

	/**
	 * Outputs a single row of characters onto the console. Different values of
	 * howMany will produce rows of different lengths.
	 * 
	 * @param howMany    how many of this symbol should be output
	 * @param whatSymbol the single symbol to print onto the console
	 */
	private static void printSymbol(int howMany, char whatSymbol) {

		whatSymbol = '*';

		System.out.print("Type a number: ");
		if (keyboard.hasNextInt()) {
			howMany = keyboard.nextInt();

			for (int i = howMany; i >= 1; i--) {
				for (int j = 1; j < i; j++) {
					System.out.print(" ");
				}
				for (int k = howMany; k >= i; k--) {
					System.out.print(whatSymbol);
				}
				System.out.println();
			}

		}
	}

	private static void perfectNumber(int num) {

		int sum = 0;

		System.out.println("Enter a number");
		num = keyboard.nextInt();
		int i = 1;
		while (i <= num / 2) {
			if (num % i == 0) {
				sum += i;
			}
			i++;
		}
		if (sum == num) {
			System.out.println(num + " is a perfect number");
		} else
			System.out.println(num + " is not a  perfect number");
	}

	private static void Fibonacci(int n) {
		n = 50;
		int n1 = 0;
		int n2 = 1;
		int n3;

		int counter = 0;
		System.out.println("Fibonacci first 50 numbers: ");
		while (counter <= n) {
			System.out.print(counter + " " + n1 + " ");

			n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
			int ratio = n2 / n1;
			System.out.println(ratio);
			counter = counter + 1;
			System.out.println();
		}
	}

	private static void printLargest(int nb) {

		System.out.println("Enter a number");
		if (keyboard.hasNextInt()) {
			nb = keyboard.nextInt();
			String nStr = String.valueOf(nb);
			int length = nStr.length();
			int largestPair = -1;
			for (int i = 0; i < length; i++) {
				String nb1 = nStr.charAt(i) + "";
				if (length > i + 1) {
					String nb2 = nStr.charAt(i + 1) + "";
					if (nb1 == nb2) {
						int pair = Integer.valueOf(nb1 + nb2);

						if (largestPair < pair) {

							largestPair = pair;
						}
					}
				}
			}

			System.out.println(largestPair);
		}
	}

	// ========================================================
	// Method: Identification
	// Purpose: Input and Output
	// including the current date and time.
	// ========================================================
	private static void printIdentification() {
		System.out.println("### Number Crunching and Starry Patterns");
		System.out.println("### Author: Paloma Passos Vieira dos Santos 100370953");
		System.out.println("### Course/Section - CPSC1150-3 \n");
		System.out.println(new java.util.Date());
	} // printIdentification

}
