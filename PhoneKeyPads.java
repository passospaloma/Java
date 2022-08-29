import java.util.Scanner;

public class PhoneKeyPads {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter (uppercase or lowercase): ");
		String letter = input.next();
		
		String letterUp = letter.toUpperCase();
		char ch = letterUp.charAt(0);	
		int digit = 0;
		
		
		switch (ch) {
		case 'A':
		case 'B':
		case 'C':
			digit = 2;
			break;
		case 'D':
		case 'E':
		case 'F':
			digit = 3;
			break;
		case 'G':
		case 'H':
		case 'I':
			digit = 4;
			break;
		case 'J':
		case 'K':
		case 'L':
			digit = 5;
			break;
		case 'M':
		case 'N':
		case 'O':
			digit = 6;
			break;
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
			digit = 7;
			break;
		case 'T':
		case 'U':
		case 'V':
			digit = 8;
			break;
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			digit = 9;
			break;
		default:
			System.out.println("Errors: invalid status");
			System.exit(0);
		}
		System.out.println(letter + " is on the number key " + digit);
	}
}