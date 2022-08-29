/*
 *Program Name: KilogramsAndPounds.java
 *Author: Paloma Passos Vieira dos Santos 
 *Date: February 19, 2022
 *Course: CPSC 1150 – W01
 *Instructor: Leon Pan
*/
import java.text.DecimalFormat;
// importing DecimalFormat

public class KilogramsAndPounds {

	// main method
	public static void main(String[] args) {

		// defining how many decimal to print
		DecimalFormat format = new DecimalFormat("0.000");

		// constant value for pound
		final double pound = 2.2;
		int i = 1, j = 20;
		// print the table
		System.out.println("kilograms \t pounds \t|\tpounds \t kilograms");
		System.out.println("-----------------------------------------------------------");
		// loop through for kilograms 1 to 19 and pound 20 to 65
		while (i < 20 && j <= 65) {

			// print the result as table format
			System.out.printf("\t" + i + "\t" + format.format(i * pound) + "\t\t|\t" + j + "\t"
					+ format.format(j / pound) + "\n");
			// incrementing kilograms and pounds values
			i = i + 2;
			j = j + 5;

		}
	}
}