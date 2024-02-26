package week2_projects.projects1;

import java.io.*;
import java.util.*;

public class GreaterThanLessThan {
	
	/*
	 * Given two integer variables, a and b, write a Boolean Expression 
	 * that will check if a is less than b AND if b is greater than 100. 
	 * Print the result to the console.
	 */

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		
		int a, b;
		
		//Getting user input
		System.out.print("Enter numbers:  ");
		a = in.nextInt();
		b = in.nextInt();
		
       
      boolean isGreaterOrNot = (a < b && b > 100);
      
      /***** Printing *****/ 
      System.out.println(isGreaterOrNot);

	}

}
