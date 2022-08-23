
/*
 Name: Paloma Passos 
 Date: OCTOBER 18th 2021
 Purpose: This program compute the sum of the first n
terms of the series
 Input:   Number 
 Output:  last number
*/

public class NaturalLog {

    //main method
	public static void main(String[] args) {
		final int n = 100000;
		printIdentification();
		System.out.println("sumForwards" + sumForwards(n));
		System.out.println("sumBackwards"+ sumBackwards(n));
		System.out.println("sumForwardsFloat" + sumForwardsFloat(n));
		System.out.println("sumBackwardsFloat" + sumBackwardsFloat(n));
		System.out.println("Math.log(2)" + Math.log(2));

	}

	private static double sumForwards(int numberOfTerms) {
		double sumOfAll = 0.0;
		for (int i = 1; i <= numberOfTerms; i++) {
			int j = i;
			if (j % 2 == 0) {
				j = -1 * j;
				sumOfAll = sumOfAll + 1 / (j * 1.00);
			}
		}
		return sumOfAll;
	}

	private static double sumBackwards(int numberOfTerms) {
		double sumOfAll = 0.0;
		for (int i = numberOfTerms; i > 0; i--) {
			int j = i;
			if (j % 2 == 0) {
				j = -1 * j;
				sumOfAll = sumOfAll + 1 / (j * 1.00);
			}
		}
		return sumOfAll;
	}

	private static double sumForwards2Halves(int numberOfTerms) {
	}

	private static double sumBackwards2Halves(int numberOfTerms) {

	}

	private static float sumForwardsFloat(int numberOfTerms) {
		float sumOfAll = 0;
		for (int i = 1; i <= numberOfTerms; i++) {
			int j = i;
			if (j % 2 == 0) {
				j = -1 * j;
				sumOfAll = (float) (sumOfAll + 1 / (j * 1.00));
			}
		}
		return sumOfAll;
	}

	private static float sumBackwardsFloat(int numberOfTerms) {
		float sumOfAll = 0;
		for (int i = numberOfTerms; i > 0; i--) {
			int j = i;
			if (j % 2 == 0) {
				j = -1 * j;
				sumOfAll = (float) (sumOfAll + 1 / (j * 1.00));
			}
		}
		return sumOfAll;
	}
}
