/*
 *Program Name: SortThreeNumbers.java
 *Author: Paloma Passos Vieira dos Santos 
 *Date: January 28, 2022
 *Course: CPSC 1150 – W01
 *Instructor: Leon Pan
*/

import java.util.Scanner;

//Purpose: to get 3 numbers and put in order from the smallest to the largest
public class SortThreeNumbers {

	// main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// get the three numbers
		System.out.println("Please enter 3 numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		// method
		sort(num1, num2, num3);
	}

	// method to put numbers in order to display from smallest to largest
	public static void sort(int n1, int n2, int n3) {
		int sort1 = 0;
		int sort2 = 0;
		int sort3 = 0;

		// find the smallest number
		if (n1 < n2 || n1 < n3) {
			sort1 = n1;
		} else if (n2 < n1 && n2 < n3) {
			sort1 = n2;
		} else {
			sort1 = n3;
		}
		// find the number between the smallest and the largest
		if (n1 > n2 && n1 < n3) {
			sort2 = n1;
		} else if (n2 > n1 && n2 < n3) {
			sort2 = n2;
		} else {
			sort2 = n3;
		}
		// find the largest number
		if (n1 > n2 && n1 > n3) {
			sort3 = n1;
		} else if (n2 > n1 && n2 > n3) {
			sort3 = n2;
		} else {
			sort3 = n3;
		}
		// print the message
		System.out.println("The integers from smallest to largest are: " + sort1 + " " + sort2 + " " + sort3);
	}
}