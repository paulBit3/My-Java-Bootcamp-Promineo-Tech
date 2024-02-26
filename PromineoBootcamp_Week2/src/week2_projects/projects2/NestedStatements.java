package week2_projects.projects2;

import java.io.*;
import java.util.*;

public class NestedStatements {
	
	/*
	 * Create a nested if statement:
       Check to see if num1 is greater than or equal to num2
       Note: The second if statement should only run
       if the first if evaluates to true
       If the first statement is true then check to see 
       if num3 is greater than or equal to num4
       If both conditions are true print "both statements are true"
       At the end of the main() method, print "program ended"
	 */

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		
		//getting user input
		System.out.println("Enter number: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();
    
        
        if(num1 >= num2) {
			if(num3 >= num4) {
				System.out.println("both statements are true");
			}
		} System.out.println("program ended");

	}

}
