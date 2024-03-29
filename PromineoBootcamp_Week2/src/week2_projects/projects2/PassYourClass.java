package week2_projects.projects2;

import java.io.*;
import java.util.*;

public class PassYourClass {
	/*
	 * In this problem, you are given four variables of type 
	 * double called assignment1, assignment2, assignment3, 
	 * and assignment4. To pass the class you need to have 
	 * the sum of assignment1 and assignment2 be greater 
	 * than 150.0 AND either assignment3 OR assignment4 needs 
	 * to be greater than 70.0.
       Write an if/else statement that checks these parameters
       If you can pass the class, print this statement to the console: 
       "You passed the class."
       Otherwise, print "You failed the class."
	 */

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		
		double assignment1, assignment2, assignment3, assignment4;
		
		//getting user input
		System.out.println("Enter your grade:  -----");
		
		System.out.println("Grade 1:  ");
		assignment1 = in.nextDouble();
		
		System.out.println("Grade 2:  ");
		assignment2 = in.nextDouble();
		
		System.out.println("Grade 3:  ");
		assignment3 = in.nextDouble();
		
		System.out.println("Grade 4:  ");
		assignment4 = in.nextDouble();
		
		//the sum of assignment1 and assignment2 be greater than 150.0
		//AND either assignment3 OR assignment4 needs to be greater than 70.0.
		
		if((assignment1 + assignment2 > 150.0) && (assignment3 > 70.0 || assignment4 > 70.0)) {
			//printing statement
			System.out.println("You passed the class.");
			} else {
				//printing statement
				System.out.println("You failed the class.");
		}

	}

}
