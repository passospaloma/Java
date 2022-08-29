/**
Author: Paloma Passos
purpose: Simple line-oriented calculator program. The class can also be used to create
 * other calculator programs as it has methods to provide calculation like add,
 * subtract, multiply, divide, remainder and average using two parameters to
 * return a result. 
*/
import java.util.Arrays;

public class Calculator {
	/**
	 * This method is used to return a remainder of a number.
	 * 
	 * @param a This is the first parameter to remainder method
	 * @param b This is the second parameter to remainder method
	 * @return int This returns the remainder of a and b.
	 */
	public static int remainder(int a, int b) {
		return a % b;
	}

	/**
	 * This method is used to add two integers.
	 * 
	 * @param a This is the first parameter to addNum method
	 * @param b This is the second parameter to addNum method
	 * @return int This returns sum of a and b.
	 */
	public static double add(double a, double b) {
		return a + b;
	}

	/**
	 * This method is used to multiply two integers.
	 * 
	 * @param a This is the first parameter to multiply method
	 * @param b This is the second parameter to multiply method
	 * @return int This returns multiplication of a and b.
	 */
	public static double multiply(double a, double b) {
		return a * b;
	}

	/**
	 * This method is used to subtract two integers.
	 * 
	 * @param a This is the first parameter to subtract method
	 * @param b This is the second parameter to subtract method
	 * @return int This returns subtraction of a and b.
	 */
	public static double subtract(double a, double b) {
		return a - b;
	}

	/**
	 * This method is used to divide two integers.
	 * 
	 * @param a This is the first parameter to divide method
	 * @param b This is the second parameter to divide method
	 * @return int This returns division of a and b.
	 */
	public static double divide(double a, double b) {
		return a / b;
	}

	/**
	 * This method is used to find the average of a number.
	 * 
	 * @param double This is the first parameter to average method
	 * @param values This is the second parameter to average method
	 * @return int This returns the average of a number.
	 */
	public static int average(double... values) {
		int sum = 0;
		for (double n : values) {
			sum += n;
		}
		return sum / values.length;
	}

	/**
	 * This method is used to add two integers.
	 * 
	 * @param double This is the first parameter to median method
	 * @param values This is the second parameter to median method
	 * @return int This returns the median of a number. calculate arithmetic median
	 *         the median of a finite list of numbers can be found by arranging all
	 *         the numbers from smallest to greatest. If there is an odd number of
	 *         numbers, the middle one is picked. If there is an even number of
	 *         observations, then there is no single middle value; the median is
	 *         then usually defined to be the mean of the two middle values
	 */
	public static double median(double... values) {
		Arrays.sort(values);
		return values[values.length / 2];

	}

	/**
	 * This method is used to calculate the max of two numbers
	 * 
	 * @param double  This is the first parameter to max method
	 * @param integer This is the second parameter to max method
	 * @return double This returns the max number
	 */
	public static double max(double... values) {
		double max = 0;
		if (values.length > 0 || values != null) {
			max = values[0];
			for (int i = 1; i < values.length; i++) {
				if (values[i] > max)
					max = values[i];
			}
		}
		return max;
	}

	/**
	 * This method is used to calculate the minor of two numbers
	 * 
	 * @param double  This is the first parameter to min method
	 * @param integer This is the second parameter to min method
	 * @return double This returns the min number
	 */
	public static double min(double... values) {
		double min = 0;
		if (values.length > 0 || values != null) {
			min = values[0];
			for (int i = 1; i < values.length; i++) {
				if (values[i] < min)
					min = values[i];
			}
		}
		return min;
	}

}
