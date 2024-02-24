package week1_projects;

import java.io.*;
import java.util.*;

public class Division {
	
	/*
	 * Given the variables num1 and num2 of type int, do the following:
       Divide the value stored in num1 by the value stored in num2.
       Store the resulting value of the division in a new 
       variable called finalAnswer
	 */

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		int num1, num2;
		
		//Getting user input
		System.out.println("Enter number:");
		num1 = in.nextInt();
		num2 = in.nextInt();
		
		int finalAnswer = num1 / num2;
		
		//printing
		System.out.println(finalAnswer);

	}

}
