/*
Name: Paloma Passos 
Purpose: This program was created for the user to input kg and height to calculate the bmi
Input:   the user kg and height
Output:  the user bmi 
*/

import java.util.Scanner;

public class CalculateBmi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your weight in kg:");
		double kg = input.nextDouble();
		System.out.println("Please enter your height in meters:");
		double h = input.nextDouble();

		double BMI = kg / Math.pow(h, 2);

		System.out.printf("Your BMI is: %2.2f", BMI);
	}
}
