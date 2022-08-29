/*
 *Program Name: CheckBMI.java
 *Author: Paloma Passos Vieira dos Santos 
 *Date: January 28, 2022
 *Course: CPSC 1150 – W01
 *Instructor: Leon Pan
*/

import java.util.Scanner;
//Purpose: To calculate the BMI with the weight and height 

public class CheckBMI {

	// main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// get the weight and the height
		System.out.println("Please enter your weight in kg:");
		double w = input.nextDouble();
		System.out.println("Please enter your height in meters:");
		double h = input.nextDouble();

		message(w, h);
	}

	// method to calculate BMI and display the message
	public static void message(double w, double h) {
		if (w > 0 && h > 0) {
			// calculate the body mass index
			double BMI = w / Math.pow(h, 2);

			// Display the BMI
			System.out.printf("Your BMI is: %2.2f", BMI);
			
			// check the BMI and display message
			if (BMI < 20) {
				System.out.println(" You are underweight");
			} else if (BMI > 25) {
				System.out.println(" You are overweight");
			} else {
				System.out.println(" Your BMI is normal");
			}
		} else {
			System.out.println("Program ended with illegal input");

		}
	}
}