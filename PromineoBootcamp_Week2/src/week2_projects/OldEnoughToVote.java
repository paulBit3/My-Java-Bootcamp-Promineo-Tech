package week2_projects;

import java.io.*;
import java.util.*;

public class OldEnoughToVote {
	/*
	 * Given the variable age, create an if/else statement that 
	 * checks if the value stored in age is old enough to vote.
       If the age is greater than or equal to 18, then print 
       "You are old enough to vote."
       If the age is not, then print "You are not old enough to vote."
	 */

	public static void main(String[] args) {
		
		// user interaction
		Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        
        
        if(age >= 18) {
			System.out.println("You are old enough to vote.");
		} else {
			System.out.println("You are not old enough to vote.");
		}
		

	}

}
