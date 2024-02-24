package week1_projects;

import java.io.*;
import java.util.*;

public class ConcatenateStrings {
	/*
	 * Use the two already declared String variables, firstName and lastName.
	   Declare a variable named fullName of type String
	   Write an equation that will concatenate the two Strings and assign the value to fullName.
	   Make sure you add a space between firstName and lastName in your equation (ex. "John Doe").
	 */

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		
		//getting user input
		String firstName = in.nextLine();
		String lastName = in.nextLine();
		/***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/
		
		String fullName = firstName + " " + lastName;
		
	
	    
	    /***** printing full name *****/
		System.out.println(fullName);

	}

}
