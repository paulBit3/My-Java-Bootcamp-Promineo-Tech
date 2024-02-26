package week2_projects.projects2;

import java.io.*;
import java.util.*;
import java.math.*;

public class NumberBetweenOneToHundred {
	/*
	 * Given the variable userNumber, do the following:
       Check to see if userNumber is between 
       1 and 100(Valid numbers are 1, 100, and all numbers in between)
       If it is, run a while loop that prints all integer values
        starting with userNumber to 100
       If not, print "Your number was not between 1 and 100." to the console.
	 */

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
	    int userNumber = in.nextInt();

	    do {
	    	
	    	if(!(userNumber >= 1 && userNumber <= 100)) {
	    		System.out.println("Your number was not between 1 and 100.");
				break;
			}
	    	if (userNumber >= 1 && userNumber <= 100) {
				//printing user number
				System.out.println(userNumber);
				userNumber++;
			} 
		}while(userNumber <=100);

	}

}
