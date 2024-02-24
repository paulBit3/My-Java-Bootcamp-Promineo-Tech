package week2_projects;

import java.io.*;
import java.util.*;

public class Discount {
	/*
	 * Discounts are awarded if a person is a student OR if 
	 * they are under the age of 18. Using an integer variable 
	 * called age and a boolean variable called isStudent, 
	 * write an if/else statement that checks if age is under 18
	 *  or if isStudent is true.
       If age is less than 18 years old or isStudent is true then 
       print to the console "You get a discount!"
       Else, print "Sorry, no discount for you."
	 */

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		
		int age;
		boolean isStudent;
		
		//getting user input
		System.out.print("Enter numbers:  ");
		
		age = in.nextInt();
		isStudent = in.nextBoolean();
		
		//if age is less than 18, and is a student
		 if(age < 18 || isStudent) {
				
				//printing you got a discount
				System.out.println("You get a discount!");
			} else {
				//printing no discount
				System.out.println("Sorry, no discount for you");
			}


	}

}
