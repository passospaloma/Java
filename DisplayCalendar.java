/*
 *Program Name: DisplayCalendar.java
 *Author: Paloma Passos Vieira dos Santos 
 *Date: March 1, 2022
 *Course: CPSC 1150 – W01
 *Instructor: Leon Pan
*/
import java.util.Scanner;

public class DisplayCalendar {
	
	//main method
	public static void main(String[] args) {
		printCalendar();
	}
	
	//method to print an specific calendar
	public static void printCalendar() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
		
		//get the year
		int year = input.nextInt();	
		
		System.out.print("Enter first day of the year(0-6):  ");
		
		//get the day
		int day = input.nextInt();
		
		// loop through 12 months
		for (int m = 1; m <= 12; m++) {

			String month = "";
			int days = 0;
			
			//switch case to go through each month and 
			//get the month name and number of the days
			//and if is a leap year
			switch (m) {
			case 1:
				month = "January ";
				days = 31;
				break;
			case 2:
				month = "February ";
				//check if is a leap year
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
					days = 29;
				else
					days = 28;
				break;
			case 3:
				month = "March ";
				days = 31;
				break;
			case 4:
				month = "April ";
				days = 30;
				break;
			case 5:
				month = "May ";
				days = 31;
				break;
			case 6:
				month = "June ";
				days = 30;
				break;
			case 7:
				month = "July ";
				days = 31;
				break;
			case 8:
				month = "August ";
				days = 31;
				break;
			case 9:
				month = "September ";
				days = 30;
				break;
			case 10:
				month = "October ";
				days = 31;
				break;
			case 11:
				month = "November ";
				days = 30;
				break;
			case 12:
				month = "December ";
				days = 31;
				break;
			}
			//prints the calendar
			System.out.println("             " + month + year);
			System.out.println("\n_______________________________________\n");
			System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
			
			// loop to print the days of the calendar
			for (int i = 1; i <= day; i++)
				System.out.print("      ");
			for (int j = 1; j <= days; j++) {
				if (day % 7 == 0 && day != 0)
					System.out.println();
				System.out.printf("%3d   ", j);
				day += 1;
			}
			day %= 7;
			System.out.print("\n\n");
		}
	}
}