package week2_projects.projects2;

import java.io.*;
import java.util.*;

public class PrintTrueOrFalse {
	
	/*
	 * Write a program that takes in three given boolean values: a, b, and c.
       Declare a variable named result that is a boolean, set it equal to a 
       statement that compares if a AND b are true OR if a AND c are true, 
       OR if b AND c are true
       Print the value of result to the console
       The program should print true if two of the values are true, 
       and "false" otherwise.
	 */

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		
		//Getting user input
		System.out.print("Enter numbers:  ");
        boolean a = in.nextBoolean();
        boolean b = in.nextBoolean();
        boolean c = in.nextBoolean(); 
    
      
      //result
		boolean result = ((a == true && b == true) || (a == true && c == true) || (b == true && c == true));
		
		//printing the result
		System.out.println(result);
		

	}

}
