/*
 *Program Name: Elevator.java
 *Author: Paloma Passos Vieira dos Santos 
 */

import java.util.Scanner;

public class Elevator {

	// main method
	public static void main(String[] args) {
		elevator();
	}

	//method to print the elevator
	public static void elevator() {
		Scanner input = new Scanner(System.in);
		// get the elevator floor
		int selectedFloor = 1, currentFloor = 1;
		// print the draw if selected floor is different from 0
		while (selectedFloor != 0) {

			System.out.println("The elevator is at Floor " + currentFloor);
			System.out.println("o-------o");
			System.out.println("| " + currentFloor + " |");
			System.out.println("o-------o");
			System.out.println("Enter a floor number between 1 and 9, or enter 0 to quit:");

			selectedFloor = input.nextInt();
			// if the selected floor is 0 is quits the program
			if (selectedFloor == 0) {
				break;
				// calling the method to print the elevator
			} else if (selectedFloor > currentFloor) {
				currentFloor = elevatorGoingUp(currentFloor, selectedFloor);
			} else {
				currentFloor = elevatorGoingDown(currentFloor, selectedFloor);
			}
		}
		// print the message if the program ends
		System.out.println("Thank you for using the elevator program. Goodbye!");
	}


	// method to calculate draw the elevator going up
	public static int elevatorGoingUp(int a, int b) {

		int c = b;

		System.out.println("The elevator is moving up from Floor " + a + " to " + b);

		while (a <= b) {
			// print the elevator going up
			System.out.println("o-------o   /\\");

			System.out.println("| " + b + " |      //\\\\");

			System.out.println("o-------o //  \\\\");

			b -= 1;
		}
		return c;
	}

	// method to calculate draw the elevator going down
	public static int elevatorGoingDown(int a, int b) {

		int c = b;

		System.out.println("The elevator is moving down from Floor " + a + " to " + b);

		while (a >= b) {
			// print the elevator going down
			System.out.println("o-------o \\\\  //");

			System.out.println("| " + a + " |      \\\\//");

			System.out.println("o-------o   \\/");

			a -= 1;

		}
		return c;
	}
}
