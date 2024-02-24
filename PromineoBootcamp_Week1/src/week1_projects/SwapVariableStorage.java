package week1_projects;

import java.io.*;
import java.util.*;
import java.math.*;

public class SwapVariableStorage {
	/*
	 * Given a method called swapNumbers, that takes in two parameters named x and y, 
	 * write a program that swaps the values of the variables.
	   For example, if x = 3 and y = 5 then after the swap, x will be 5 and y will be 3.
	   Use variables to store the integer values.
	   You may not reassign the variables by writing x = 5 or y = 3.
	   When the program runs, the following should print to the console: "After swapping, 
	   x is equal to 5 and y is equal to 3."
	 */
	
	//method
	
	 public static void swapNumbers(int x, int y) {
         
	        // WRITE YOUR CODE HERE 
	        //swapping variable
			int swap;
			
			//swapping the value here
			
			swap = y;
			
			y = x;
			
			x = swap;

	          
	          
	          
	    /***** Printing swapping number*****/
	          System.out.println("After swapping, x is equal to " + x + " and y is equal to " + y + ".");
	      }
	    	public static void main(String[] args) {
	    		//user interaction
				Scanner in = new Scanner(System.in);
				int a,b;
				
				//getting user input
				a = in.nextInt();
				b = in.nextInt();
				
				//calling our method
				swapNumbers(a, b);
		}

}
