package week2_projects.projects2;

import java.io.*;
import java.util.*;

public class NotTrueOrTrue {
	
	/*
	 * Write a program that takes in three boolean inputs a, b, c 
	 * and checks if a statement is true or false.
       Check to see if a AND b is true OR if c OR NOT b is true.
       Set the value of that equal to a boolean variable called result
       Print result to the console
	 */

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		
		//getting user input
		System.out.print("Enter numbers:  ");
		
        boolean a = in.nextBoolean();
        boolean b = in.nextBoolean();
        boolean c = in.nextBoolean();
        
        // boolean variable
        boolean result = (a && b) || (c || !b);
        
        //printing
        System.out.println(result);
        

	}

}
