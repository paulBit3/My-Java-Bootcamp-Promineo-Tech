package week1_projects.projects2;

import java.io.*;
import java.util.*;
import java.math.*;

public class RemainderUsingModulo {
	/*
	 * Using the modulo operator:
       Find the remainder of num1 divided by num2.
       Assign that answer to an int variable called finalAnswer.
       Then write a System.out.println(); 
       statement that will print finalAnswer to the console.
	 */

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		
		int num1, num2;
		
		//Getting user input
		System.out.println("Enter number:");
		num1 = in.nextInt();
		num2 = in.nextInt();
		
		int finalAnswer = num1 % num2;
		
		//printing
		System.out.println(finalAnswer);

	}

}
