package week2_projects;

import java.io.*;
import java.util.*;

public class SmallerLargerEqual {
	/*
	 * Given the variables num1 and myNumber, 
	 * create an if/else if statement that compares 
	 * myNumber to num1. Based on which condition 
	 * evaluates to true, print one of the following messages:
       num1 + " is smaller than my number, " + myNumber
       num1 + " is larger than my number, " + myNumber
       num1 + " is equal to my number, " + myNumber
	 */

	public static void main(String[] args) {
		
		
		// User interaction
		 int num1 = 156;
	     Scanner in = new Scanner(System.in);
	     
	     //getting user input
	     System.out.println("Enter number:  ");
	     int myNumber = in.nextInt();
	    
	      
	     //compares myNumber to num1
		if(num1 < myNumber) {
			//printing message
			System.out.println(num1 + " is smaller than my number, " + myNumber);
		} else if(num1 > myNumber) {
			//printing message
			System.out.println(num1 + " is larger than my number, " + myNumber);
		} else if(num1 == myNumber) {
			//printing message
			System.out.println(num1 + " is equal to my number, " + myNumber);
		}
	       

	}

}
