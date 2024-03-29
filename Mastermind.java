
/*
Name: Paloma Passos 
Date: December 3nd 2021
Purpose: This program was created for the use to guess the random number generated by a computer
Input:   guess number
Output:  if the guess number was correct or not
*/
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mastermind {
    
    //main method
	public static void main(String[] args) {
		printInstructions();
		System.out.println("Computer is thinking for a guess number....");
		System.out.println("Done!");
		System.out.println();
		mastermindGame();

	}

	// this method gets the input from the user, put into an array, separate the
	// numbers and counts the the correct numbers in
	// the right place and the wrong place
	private static void mastermindGame() {

		char c;
		boolean cheat = false;
		int[] random = randomNumGenerator();
		int correctNum = 0;
		int maxGuess = 5;
		int matchNum = 0;
		Scanner keyboard = new Scanner(System.in);

		while (maxGuess > 0 && correctNum != 9) {
			int[] guess = theGuess();

			correctNum = 0;
			matchNum = 0;
			for (int i = 0; i < guess.length; i++) {
				if (guess[i] == random[i]) {
					correctNum++;
				} else if (random[i] == guess[0] || random[i] == guess[1] || random[i] == guess[2]
						|| random[i] == guess[3]) {
					matchNum++;
				}
			}
			if (correctNum == 4) {
				System.out.print("Well doooooone! Your guess is Correct! The number is: ");
				for (int i = 0; i < guess.length; i++) {
					System.out.print(guess[i]);
				}
				System.out.println();

			} else {
				maxGuess--;
				if (maxGuess == 4) {

					System.out.print("Activate cheat mode? [y/n]: ");
					while (true) {
						c = keyboard.next().charAt(0);
						if (c == 'y' || c == 'Y' || c == 'n' || c == 'N')
							break;
						else
							System.out.print("Please enter 'y' or 'n': ");
					}
					if (c == 'y' || c == 'Y')
						cheaterMode(random);
				} else if (maxGuess == 2) {
					hint(random);
				}

				if (maxGuess > 1) {
					System.out.println(
							"You have guess " + correctNum + " correct number in correct position," + " and " + matchNum
									+ " correct number in incorrect position. \n" + maxGuess + " attempt remaining.");
				} else if (maxGuess == 1) {
					System.out.println("You have guess " + correctNum + " correct number in correct position," + " and "
							+ matchNum + " correct number in incorrect position. \nLast attempt!");
				} else {
					System.out.println("Sorry, you failed to guess the number in 5 attempts.");
					System.out.print("The guess number is: ");
					for (int i = 0; i < random.length; i++) {
						System.out.print(random[i]);
					}

				}
			}
		}

	}

	// this method will generate a random number and put into a array
	public static int[] randomNumGenerator() {
		Random num = new Random();
		int[] Array = { 0, 0, 0, 0 };

		for (int i = 0; i < Array.length; i++) {
			int n = num.nextInt(5);
			while (n == Array[0] || n == Array[1] || n == Array[2] || n == Array[3]) {
				n = num.nextInt(5);
			}
			Array[i] = n;
		}
		return Array;
	}

	// this method gets the input from the user and checks if there is 4 digits
	public static int[] theGuess() {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your guess: ");

		String x = keyboard.nextLine();

		if (x.length() != 4 || x.replaceAll("\\D", "").length() != 4) {
			System.out.println("Invalid number. Please enter 4 digits between 0-9 only.");
			return theGuess();
		}
		int[] guessNum = new int[4];
		for (int i = 0; i < 4; i++) {
			guessNum[i] = Integer.parseInt(String.valueOf(x.charAt(i)));
		}
		return guessNum;
	}

	// this method shows the guess number to the user
	private static void cheaterMode(int Array[]) {
		System.out.println("Cheat mode on! The Guess number by computer is: ");
		int Array1[] = Array;
		int i;
		for (i = 0; i < 4; i++)
			System.out.print(Array1[i] + " ");
		System.out.println();
	}

	// this method multiply or add all the numbers in the array of the guess number
	// and shows as a hint to the user
	private static void hint(int[] random) {
		boolean status = false;
		Scanner sc = new Scanner(System.in);
		char c;
		System.out.print("Do you need a hint? [y/n]: ");
		while (true) {
			c = sc.next().charAt(0);
			if (c == 'y' || c == 'Y' || c == 'n' || c == 'N')
				break;
			else
				System.out.print("Please enter 'y' or 'n': ");
		}
		if (c == 'n' || c == 'N')
			return;
		if (status == true) {
			int i, y = 0;
			for (i = 0; i < 4; i++)
				y += random[i];
			y++;
			System.out.println("Here goes the hint: Addition of all the numbers are " + y);
			status = false;
		} else {
			int i, z = 1;
			for (i = 0; i < 4; i++)
				z *= random[i];
			System.out.println("Here goes the hint: Product of all the numbers are " + z);
			status = true;
		}
	}

	// this method print the instructions to the game
	public static void printInstructions() {
		System.out.println(
				" Welcome to MasterMind, this is a logic game\n To win you must guess correctly where each number is\n The Numbers Range from 1-4)\n "
						+ "The computer has generate a unique 4 digit number\n You will only get 5 tries, then you lose\n Soooo lets begin!");
		System.out.println();
		System.out.println("_______________________________________________________\n");
	}
}
