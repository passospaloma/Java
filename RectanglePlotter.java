/*
 Name: Paloma Passos 
 Date: NOVEMBER 15th 2021
 Purpose: This program was created to draw rectangles 
 Input:   X, Y Coordinates, Width and Height
 Output:  a single filled-in rectangle within the positive
Cartesian quadrant on a 40 x 20 labeled grid. 
*/
import java.util.Scanner;

public class RectanglePlotter {

	final static char EXIT = 'x';
	final static int MIN_VALUE = 0;
	final static int MAX_VALUEH = 20;
	final static int MAX_VALUEW = 40;

	public static void main(String[] args) {
		menu();

	}

	public static void menu() {
		int x = 0, y, width, height;

		Scanner input = new Scanner(System.in);

		// input the x,y coordinate
		while (x != EXIT) {

			System.out.print("Type x to Exit or Enter the X coordinate of the left corner of the Rectangle: ");
			x = input.nextInt();
			System.out.print("Enter the Y coordinate of the left corner of the Rectangle: ");
			y = input.nextInt();
			// input the width and height
			System.out.print("Enter the width of the Rectangle: ");
			width = input.nextInt();
			System.out.print("Enter the height of the Rectangle: ");
			height = input.nextInt();
			System.out.println();
			if (x >= MIN_VALUE && x <= MAX_VALUEW && y >= MIN_VALUE && y <= MAX_VALUEH && width >= MIN_VALUE
					&& width <= MAX_VALUEW && height >= MIN_VALUE && height <= MAX_VALUEH) {
				drawRectangle(x, y, width, height);
				System.out.println();
			} else {
				System.out.println("Please enter numbers according to the 40x20 grid");
				System.out.println();

			}

		}
		System.out.println("Until next time!");

	}

	// it prints the rectangle row by row
	public static void Row(int width) {
		// printing a row of the rectangle
		for (int j = width; j >= 1; j--) {
			System.out.print("*");
		}
	}

	public static void drawRectangle(int x, int y, int width, int height) {
		System.out.print("   ^");
		// Building the y-axis
		for (int i = 20; i >= 0; i--) {
			if (i % 5 == 0) {
				// if number is less than 10 then give a space at the beginning of the line
				if (i < 10) {
					System.out.print("\n" + " " + i + " +");
				} else {
					System.out.print("\n" + i + " +");
				}
				// if y-axis value is within the of the rectangle then draw a row of rectangle
				if (i <= y && height != 0) {
					// drawing the number of spaces required to get the rectangle in the correct
					// place
					for (int j = x; j >= 1; j--) {
						System.out.print(" ");
					}
					// Rectangle row
					Row(width);
					height--;
				}
			} else {
				System.out.print("\n" + "   |");
				if (i <= y && height != 0) {
					for (int j = x; j >= 1; j--) {
						System.out.print(" ");
					}
					Row(width);
					height--;
				}

			}

		}
		// the x-axis
		for (int i = 1; i <= 40; i++) {

			if (i % 5 == 0) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
		}
		System.out.print(">");
		System.out.println();
		System.out.print("   ");

		// numbers on the x-axis
		for (int i = 0; i <= 40; i++) {
			if (i % 5 == 0) {
				if (i >= 10) {
					System.out.print(i + "   ");
				} else {
					System.out.print(i + "    ");
				}

			}
		}
	}

}
