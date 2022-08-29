/*
 *Program Name: DisplayPyramid.java
 *Author: Paloma Passos Vieira dos Santos 
 *Date: February 19, 2022
 */
import java.util.Scanner;

public class DisplayPyramid {

	// main method
	public static void main(String[] args) {

		// calling the method to print a pyramid
		printPyramid();
	}

	// method to print a pyramid
	public static void printPyramid() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer from 1 to 15: ");
		// get the number for the rows
		int rows = input.nextInt();

		// loop to create the rows and spaces
		for (int i = 0; i < rows; i++) {

			System.out.format("%" + 4 * (rows - i + 1) + "s", "");
			for (int j = i + 1; j > 1; j--)
				System.out.format("%4d", j);
			for (int j = 1; j <= i + 1; j++)
				System.out.format("%4d", j);

			System.out.println();
		}
	}
}
