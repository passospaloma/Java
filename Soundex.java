/*
Name: Paloma Passos 
Date: NOVEMBER 1th 2021
Purpose: This program was created to determine whether they sound the same
based on the Soundex encoding scheme.
Input:   two names.
Output:  if the sound or not the same.
*/
import java.util.Scanner;

public class Soundex {

	static String name1;
	static String name2;
	static String codes;
	final static char EXIT = 'X';

    //main method
	public static void main(String[] args) {
		interactiveMenu();
	}

	private static void interactiveMenu() {
		Scanner keyboard = new Scanner(System.in);
		char command = ' '; // initialize command to any other value so I can start the loop
		while (command != EXIT) {
			System.out.println("Please type a name: ");
			name1 = keyboard.next();
			System.out.println("Please type a second name: ");
			name2 = keyboard.next();

			// testNames();
			if (testNames(name1).equals(testNames(name2))) {
				System.out.println(
						"the name: " + name1 + " with the soundex encoding: " + testNames(name1) + "\nand the name "
								+ name2 + " with the soundex encoding: " + testNames(name2) + " \nsound the same");
				System.out.println("------------------------------------------");

			} else {
				System.out.println("the name: " + name1 + " with the soundex encoding: " + testNames(name1)
						+ "\nand the name " + name2 + " with the soundex encoding: " + testNames(name2)
						+ " \ndoes not sound the same");
				System.out.println("------------------------------------------");
			}

			System.out.println("Press any key to continue or press " + EXIT + " to leave the program");
			command = keyboard.next().toUpperCase().charAt(0); // get the single letter command

		}
		System.out.println("Program Finished. Thanks for playing.");
	}

	public static String testNames(String name) {

		firstLetter(name);
		translateLetters(name);
		firstNumbersRemove(translateLetters(name));
		adjacentNumbersRemove(firstNumbersRemove(translateLetters(name)));
		turnUppercase(adjacentNumbersRemove(firstNumbersRemove(translateLetters(name))), firstLetter(name));
		removeZeros(
				turnUppercase(adjacentNumbersRemove(firstNumbersRemove(translateLetters(name))), firstLetter(name)));
		sufficientNumber(removeZeros(
				turnUppercase(adjacentNumbersRemove(firstNumbersRemove(translateLetters(name))), firstLetter(name))));

		return sufficientNumber(removeZeros(
				turnUppercase(adjacentNumbersRemove(firstNumbersRemove(translateLetters(name))), firstLetter(name))));
	}

	public static String firstLetter(String name) {

		String letter = name.substring(0, 1);
		return letter;
	}// this method consists in make a copy of the first letter of the name. It will
		// become the first character in the Soundex code.

	public static String translateLetters(String name) {
		String codes = "";
		name = name.toLowerCase();

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'h' || name.charAt(i) == 'i'
					|| name.charAt(i) == 'o' || name.charAt(i) == 'u' || name.charAt(i) == 'y'
					|| name.charAt(i) == 'w') {
				codes += 0;
			} else if (name.charAt(i) == 'b' || name.charAt(i) == 'p' || name.charAt(i) == 'f'
					|| name.charAt(i) == 'v') {
				codes += 1;
			} else if (name.charAt(i) == 'c' || name.charAt(i) == 's' || name.charAt(i) == 'k' || name.charAt(i) == 'g'
					|| name.charAt(i) == 'j' || name.charAt(i) == 'q' || name.charAt(i) == 'x'
					|| name.charAt(i) == 'z') {
				codes += 2;
			} else if (name.charAt(i) == 'd' || name.charAt(i) == 't') {
				codes += 3;
			} else if (name.charAt(i) == 'l') {
				codes += 4;
			} else if (name.charAt(i) == 'm' || name.charAt(i) == 'n') {
				codes += 5;
			} else if (name.charAt(i) == 'r') {
				codes += 6;
			}
		}
		return codes;
	}// this method consists in translating all of letters of the name to their
		// corresponding numeric codes, based upon the Soundex Key table.

	public static String firstNumbersRemove(String codes) {
		if (codes.charAt(0) == codes.charAt(1)) {
			codes = codes.substring(1, codes.length());
		}
		return codes;
	}// this method consists in remove all but the first if the Soundex code values
		// are the same for the initial portion of the string one.

	public static String adjacentNumbersRemove(String codes) {
		String newCode = "";
		for (int i = 1; i < codes.length(); i++) {
			if (codes.charAt(i) != codes.charAt(i - 1)) {
				newCode += codes.charAt(i - 1);
			}
		}
		if (codes.charAt(codes.length() - 1) != codes.charAt(codes.length() - 2)) {
			newCode += codes.charAt(codes.length() - 1);
		}
		return newCode;

	}/// this method consists in remove the first one if two
		// adjacent codes are the same.

	public static String turnUppercase(String codes, String letter) {
		codes = letter + codes.substring(1, codes.length());
		codes = codes.toUpperCase();
		return codes;
	}// this method consists in overwrite the first value of the Soundex code with an
		// uppercase version of the letter stored in the firstLetter method.

	public static String removeZeros(String codes) {
		codes = codes.replace("0", "");
		return codes;
	}// this method consists in removing all zeros from the Soundex code.

	public static String sufficientNumber(String codes) {
		if (codes.length() > 4) {
			codes = codes.substring(0, 4);
		} else {
			while (codes.length() < 4) {
				codes += "0";
			}
		}
		return codes;
	}// this method will consists of the original first letter, followed by exactly 3
		// numeric code values. If there are more than 3 digits, it will remove it. If
		// there are less than 3 digits, append a sufficient number of zeros

	
};
