package week2_projects.projects1;

import java.io.*;
import java.util.*;
import java.math.*;

public class MultiplicationTable {
	/*
	 * Create a for loop that prints out a multiplication table 
	 * from 1 through 10 for a given variable num.
       Print the multiplication table to the console
       Make sure the spacing is the same as the expected output
       If the value of num is 1, each iteration of the loop 
       should look like the following:
       1 x 1 = 1
       1 x 2 = 2
       1 x 3 = 3 … and so on up to 1 x 10 = 10.
	 */

	public static void main(String[] args) {
		
		// User interaction
		  Scanner in = new Scanner(System.in);
		  
		  System.out.println("Enter a number: ");
	      int num = in.nextInt();

	      System.out.println("Multiplication Table of " + num + ":");
	
	      for(int i = 1; i <= 10; i++) {
	    	  //printing a formating result
	    	  System.out.printf("%d x %d = %d\n",num, i, num * i);
				;
				
			}

	}

}
