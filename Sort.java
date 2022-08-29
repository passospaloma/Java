/*
Name: Paloma Passos
Date: NOVEMBER 25th 2021
*/
import java.util.*;

public class Sort {
	static int size;

	public static void main(String[] args) {
		printIdentification();
		System.out.println();
		linearSearchFunc();
		selectionSortFunc();
		System.out.println();
		int x = 23;
		int y = 45;
		swapNumbers(x, y);
		System.out.println();
		binarySearchFunc();
		System.out.println();
		binarySearchFunc1(y);

	}

	private static double[] createArray(int size) {
		double[] list = new double[size];
		for (int i = 0; i < size; i++) {
			list[i] = (int) (Math.random() * 10);
			System.out.print(" " + list[i]);
		}
		return list;
	}

	private static void showArray() {
		createArray(10);
	}

	private static int linearSearch(double list[], double target, int start, int end) {

		for (int i = start; i < end; i++) {
			if (list[i] == target)
				return i;
		}
		return -1;
	}

	private static double[] linearSearchFunc() {

		double[] list = createArray(10);
		int start = 0;
		double target = 2;
		int end = list.length;
		int result = linearSearch(list, target, start, end);

		System.out.println();
		System.out.println("The element searched is - " + target);
		for (int i = 0; i < end; i++) {
			int count = result;
			count++;
		}
		if (result == -1) {
			System.out.println("This element is not in the array");

		} else {
			System.out.println("The element is present at the " + result + " position of the array");
		}
		System.out.println();
		return list;
	}

	public static void selectionSort(double[] list, int start, int end) {

		for (int i = start; i < end - 1; i++) {
			int index = i;
			for (int j = i + 1; j < end; j++) {
				if (list[j] < list[index]) {
					index = j;
				}
			}
			double smallerNumber = list[index];
			list[index] = list[i];
			list[i] = smallerNumber;
		}
	}

	private static void selectionSortFunc() {

		double[] list1 = createArray(10);
		int start = 0;
		int end = list1.length;
		System.out.println();
		System.out.println("Before Selection Sort: ");
		for (double i : list1) {
			System.out.print(i + " ");
		}
		System.out.println();
		selectionSort(list1, start, end);
		System.out.println("After Selection Sort:");
		for (double i : list1) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private static void swapNumbers(int x, int y) {

		System.out.println("Before swapping numbers");
		System.out.println("x = " + x + ", y = " + y);
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("After swapping numbers");
		System.out.println("x = " + x + ", y = " + y);
	}

	private static int binarySearch(double[] list, double target, int start, int end) {

		if (end >= start) {
			int middle = start + (end - start) / 2;

			if (list[middle] == target)
				return middle;

			if (target < list[middle]) {
				return binarySearch(list, target, start, middle - 1);
			}
			return binarySearch(list, target, middle + 1, end);
		}
		return start - 1;

	}

	private static int binarySearch1(double[] list, int target) {

		int start = 0;
		int end = list.length - 1;
		while (start <= end) {
			target = start + (end - start) / 2;
		}
		System.out.println(target);

		return target;
	}

	private static int binarySearchFunc() {

		double[] list = { 2, 5, 7, 11, 15, 22, 35, 55, 67, 78 };
		int end = list.length;
		int target = 22;
		for (int i = 0; i < end; i++) {
			System.out.print(" " + list[i]);
		}
		System.out.println("\nThe target is: " + target);
		int result = binarySearch(list, target, 0, end - 1);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
		return result;
	}

	private static int binarySearchFunc1(int target) {
		double[] list = { 2, 5, 7, 11, 15, 22, 35, 55, 67, 78 };
		int end = list.length;
		for (int i = 0; i < end; i++) {
			System.out.print(" " + list[i]);
		}
		int result = binarySearch1(list, target);
		if (result == -1)
			System.out.println("Element is not present");
		else
			System.out.println("Element found at " + "index " + result);
		return result;
	}

	// ========================================================
	// Method: Identification
	// Purpose: Input and Output
	// including the current date and time.
	// ========================================================
	private static void printIdentification() {
		System.out.println("### Number Serching and Sorting");
		System.out.println("### Author: Paloma Passos Vieira dos Santos 100370953");
		System.out.println("### Course/Section - CPSC1150-3 \n");
		System.out.println(new java.util.Date());
	} // printIdentification
}
