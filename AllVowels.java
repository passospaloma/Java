/*
 *Program Name: AllVowels.java
 *Author: Paloma Passos Vieira dos Santos 
 *Date: March 1, 2022
 *Course: CPSC 1150 – W01
 *Instructor: Leon Pan
*/
public class AllVowels {
	
	//main method
	public static void main(String[] args) {
		printVowels();
	}
	
	//method to generate letter and print vowels
	public static void printVowels() {
		int counter = 0; // Counter for number of capitals generated.
		int numberToGenerate = 4; // Number of capitals to generate.
		char symbol = 0; // Variable to store a random character.

		// keeps doing it until while
		do {

			// Generate a random symbol between a and z:
			symbol = (char) (26 * Math.random() + 'a');

			switch (symbol) {
			// ignore the consonants
			case 'a':	
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				// counts when there is a vowel
				counter++;
				// prints the vowel
				System.out.print(symbol + " ");
				break;
			default:

			}
			// While there are still letters to generate:
		} while (counter < numberToGenerate);
	}
}