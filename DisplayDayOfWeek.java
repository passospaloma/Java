/*
 *Program Name: DisplayCalendar.java
 *Author: Paloma Passos 
 *Date: April 1, 2022
 */
import java.util.Scanner;

public class DisplayDayOfWeek {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a integer from 0 to 6: ");
		int day = input.nextInt();

		String today = "";

		switch (day) {
		case 0:
			today = "Sunday";
			break;
		case 1:
			today = "Monday";
			break;
		case 2:
			today = "Tuesday";
			break;
		case 3:
			today = "Wednesday";
			break;
		case 4:
			today = "Thursday";
			break;
		case 5:
			today = "Friday";
			break;
		case 6:
			today = "Saturday";
			break;
		default:
			System.out.println("Errors: invalid status");
			System.exit(0);
		}
		System.out.println(day + "-" + today);

	}
}
