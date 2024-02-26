package week2_projects.projects1;

import java.io.*;
import java.util.*;

public class NameOfMonth {
	/*
	 * Given a variable monthNumber, write a switch statement 
	 * to check the value stored in the variable that will 
	 * produce the name of the month.
       When a match is made, print out that month in word 
       format (i.e. 7 should print July)
       If a match is not made, print out "Invalid Month"
       Use System.out.println() to print statements to the console.
	 */

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		
		//getting user input
		System.out.println("Enter month number: ");
		int monthNumber = in.nextInt();
	
	
				//checking the value
		switch(monthNumber) {
			case 1:
				//Printing the month
				System.out.println("January");
				break;
			case 2:
				//Printing the month
				System.out.println("February");
				break;
			case 3:
				//Printing the month
				System.out.println("March");
				break;
			case 4:
				//Printing the month
				System.out.println("April");
				break;
			case 5:
				//Printing the month
				System.out.println("May");
				break;
			case 6:
				//Printing the month
				System.out.println("June");
				break;
			case 7:
				//Printing the month
				System.out.println("July");
				break;
			case 8:
				//Printing the month
				System.out.println("August");
				break;
			case 9:
				//Printing the month
				System.out.println("September");
				break;
			case 10:
				//Printing the month
				System.out.println("October");
				break;
			case 11:
				//Printing the month
				System.out.println("November");
				break;
			case 12:
				//Printing the month
				System.out.println("December");
				break;
			
			default:
				//printing if not match any month
				System.out.println("Invalid Month");
		}

	}

}
