/*
Name: Paloma Passos 
Purpose: This program was created for the user to input numbers to calculate the triangle area
Input:   6 numbers to form the 3 points of the triangle
Output:  the area of the triangle
*/

import java.util.Scanner;

public class ComputeTriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter three points: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		double side1 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		double side2 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
		double side3 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		System.out.printf("The area of the triangle is: %2.2f", area);

	}
}
