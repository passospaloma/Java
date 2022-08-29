/*
Name: Paloma Passos Vieira dos Santos Student Number: 100370953
Purpose: This program was created for the user to input a number and get the digits and the sum of the number
Input:   a number between 0 and 999
Output:  the digits of this number and the sum of them
*/

import java.util.Scanner;

public class DisplayDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter an integer between 0 and 999");
		int n = input.nextInt();

		int d1 = n / 100;
		int d2 = n / 10 % 10;
		int d0 = d2 %10;
		int d3 = n % 10;
		int sum = d1 + d2 + d3;
		
		System.out.println("The three digits int the number are: " + d1 + " " + d2 + " " + d3);
		System.out.println("The sum of the three digits is: " + sum);

	}
}