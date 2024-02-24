package week2_projects;

import java.io.*;
import java.util.*;

public class Num1IsTrueOrNum2IsTrue {
	/*
	 * Given the variables a and b, write a Boolean Expression 
	 * that checks if either is true.
       Check to see if the value of a is true OR if the value of b is true
       Print the result to the console
	 */

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		
		//getting user input
		System.out.print("Enter numbers:  ");
    	boolean a = in.nextBoolean();
    	boolean b = in.nextBoolean();
    
    	
      //boolean expression
		boolean check = true;
		check = (a == true || b == true);
		
		//printing the result
		System.out.println(check);

	}

}
