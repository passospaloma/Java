/*
 *Program Name: ValidadeTriangle.java
 *Author: Paloma Passos Vieira dos Santos 
 *Date: January 28, 2022
 *Course: CPSC 1150 – W01
 *Instructor: Leon Pan
*/

import java.util.Scanner;

//Purpose: To calculate the edges and check if it is a triangle
public class ValidateTriangle {

	// main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// get the three edges
		System.out.println("Please enter the first edge lenght: ");
		double edge1 = input.nextDouble();
		System.out.println("Please enter the second edge lenght: ");
		double edge2 = input.nextDouble();
		System.out.println("Please enter the third edge lenght: ");
		double edge3 = input.nextDouble();
		// method
		triangle(edge1, edge2, edge3);
	}

	// method to get the three edges, calculate and validate the triangle with true
	// or false
	public static void triangle(double n1, double n2, double n3) {
				
		// sum of the first and second edge
		double edges = n1 + n2;

		// boolean to check if is true or false
		boolean isValid = edges > n3 ? true : false;

		// print the message
		System.out.println("Can edges " + n1 + ", " + n2 + " and " + n3 + " form a triangle? " + isValid);
	}
}