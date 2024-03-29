package week2_projects.projects1;

import java.io.*;
import java.util.*;

public class HowManyDayInMonth {
	/*
	 * Given the String variable month, determine how many 
	 * days is in the given month or if it's an Invalid month.
       Currently, the program works but only if the name of 
       the month stored in the variable month is lowercase.
       Change something in the switch statement that will 
       make the program work as desired no matter the letter 
       case of the name of the month.
	 */

	public static void main(String[] args) {
		
		// User interaction
		Scanner input = new Scanner(System.in);
		
		//getting user input
		System.out.println("Enter a month: ");
        String month = input.nextLine();
        
        int days = -1; 
        switch( month.toLowerCase() ) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                days = 31;
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                days = 30;
                break;
            case "february":
                days = 28;
                break;
        }
        
        //printing
        if (days == -1) {
            System.out.println("Invalid month");
        } else {
            System.out.println("Has " + days + " days");
        }

	}

}
