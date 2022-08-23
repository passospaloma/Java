/*
 Name: Paloma Passos 
 Date: OCTOBER 07th 2021
 Purpose: This program compute the total number 
 Input:   Number 
 Output:  The total number
*/

import java.util.Scanner;

public class CountingNumbers {

	// a piece of magic - to allow values to be read from the keyboard
	private static Scanner keyboard = new Scanner(System.in);

	// "main" has to be here!
	public static void main(String[] args) {
		printIdentification();
		simpleEcho();
	}

	/*
	 * Test data: 6 8 0 10038 67 513 6632 0
	 */
	// runs the show!
	private static void simpleEcho() {

		final int ZERO_TARGET = 1; // the constant number of zeros to be expected
		int numZeros = 0; // the number of zeros seen so far in the input stream
		int value; // the inputed number

		while (numZeros < ZERO_TARGET) {
			System.out.println("Please enter a number : ");
			value = keyboard.nextInt();

			if (value == 0) {
				numZeros++;
			}
			System.out.println("The number is " + value);
		}
		System.out.println("End of Program");
	}

	// runs the show!
	private static void complexEcho() {
		final int ZERO_TARGET = 2; // the constant number of zeros to be expected
		int numZeros = 0; // the number of zeros seen so far in the input stream
		int value; // the inputed number
		boolean isGoodInput = true;// s a flag to detect when the input goes bad

		while (numZeros < ZERO_TARGET && isGoodInput == true) {
			System.out.println("Please enter a number : ");
			if (keyboard.hasNextInt()) {
				value = keyboard.nextInt();
				if (value == 0) {
					numZeros++;
				}
				System.out.println("The number is " + value);
			} else {
				isGoodInput = false;
			}
		}
		if (isGoodInput == false) {
			System.out.println("Program ended with illegal input");
		}
		System.out.println("End of Program");
	}

	private static void countNumbers() {
		final int ZERO_TARGET = 2; // the constant number of zeros to be expected
		int numZeros = 0; // the number of zeros seen so far in the input stream
		int value; // the inputed number
		boolean isGoodInput = true;// s a flag to detect when the input goes bad
		int evenCount = 0; // the number of even integers seen
		int oddCount = 0; // the number of odd integers seen
		int largest = 0; // the largest value seen
		boolean firstTime = true; // a flag to determine if this is the very first value entered

		while (numZeros < ZERO_TARGET && isGoodInput == true) {
			System.out.println("Please enter a number : ");
			if (keyboard.hasNextInt()) {
				value = keyboard.nextInt();
				if (value == 0) {
					numZeros++;
				}
				if (value % 2 == 0) {
					evenCount++;
				} else {
					oddCount++;
				}
				if (firstTime == true) {
					firstTime = false;
					largest = value;
				} else if (largest < value) {
					largest = value;
				}
			} else {
				isGoodInput = false;
			}
		}
		if (isGoodInput == false) {
			System.out.println("Program ended with illegal input");

		} else {
			System.out.println(oddCount + evenCount + largest);
		}
		System.out.println("End of Program");
	}

	// ========================================================
	// Method: Identification
	// Purpose: Input and Output
	// including the current date and time.
	// ========================================================
	private static void printIdentification() {
		System.out.println("### CountNumbers  Author: Paloma Passos Vieira dos Santos 100370953");
		System.out.println("### CountNumbers  Author: Christine Jane Pablo 100369675");
		System.out.println("### CountNumbers  Author: Gurleen Kaur 100381823");
		System.out.println("### Course/Section - CPSC1150-3    St.# - 33550336 ###\n");
		System.out.println(new java.util.Date());
	} // printIdentification

}
