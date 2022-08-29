
/*
 *Program Name: FindMiddleName.java
 *Author: Paloma Passos Vieira dos Santos 
 *Date: February 19, 2022
 *Course: CPSC 1150 – W01
 *Instructor: Leon Pan
*/
import java.util.Scanner;

public class FindMiddleName {

	// main method
	public static void main(String[] args) {

		// calling middlename method
		middleName();

	}

	// method to find the middle name
	public static void middleName() {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first name, middle name, and last name: ");

		// get the full name
		String fullName = input.nextLine();

		// get the first name
		int firstName = fullName.indexOf(" ");

		// get the last name
		int lastName = fullName.lastIndexOf(" ");

		// get the middle name
		String middleName = fullName.substring(firstName, lastName);

		// Display middle name
		System.out.println("Your middle name is: " + middleName);
	}
}
