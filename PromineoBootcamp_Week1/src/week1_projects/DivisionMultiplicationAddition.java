package week1_projects;

import java.io.*;
import java.util.*;
import java.math.*;

public class DivisionMultiplicationAddition {
	/*
	 * Given the variables num1, num2, num3, and num4, do the following:
	   Divide num1 by num2 and assign that value to a 
	   double variable named answer1
	   Create a second double variable named answer2 and assign 
	   it the product of num3 and num4
	   Create one more double variable named finalAnswer and 
	   assign to that the value of answer1 added to answer2
	 */

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		double num1, num2, num3, num4;
		
		//getting user input
		System.out.println("Enter number:");
		num1 = in.nextDouble();
		num2 = in.nextDouble();
		num3 = in.nextDouble();
		num4 = in.nextDouble();
		
		//double variable 1
		double answer1 = num1 / num2;
						
		//double variable 2
		double answer2 = num3 * num4;
						
		// final answer
		double finalAnswer = answer1 + answer2;
		
		/***** Printing *****/
		System.out.println(finalAnswer);

	}

}
