package week1_projects.projects2;

import java.io.*;
import java.util.*;

public class Multiplication {
	/*
	 * Write a program that creates a new variable 
	 * of type int named multiplyResults.
      Multiply the values num1 and num2 and assign 
      that product to multiplyResults.
	 */
	

	public static void main(String[] args) {
		// User interaction
		Scanner in = new Scanner(System.in);
		int num1, num2;
		
		//getting user input
		System.out.println("Enter number:");
		num1 = in.nextInt();
		num2 = in.nextInt();
    		
		
		//result variable
		int multiplyResults;
		multiplyResults = num1 * num2;
	
	
	/***** Printing result *****/	
		System.out.println(multiplyResults);

	}

}
