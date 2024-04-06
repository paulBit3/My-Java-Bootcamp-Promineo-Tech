package week1_projects.projects2;

import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;
import java.util.regex.*;

public class MultiplicationModulo {
	/*
	 * Given the int variables, num1, num2, and num3.
       Multiply num1 and num2 together.
       Find the remainder of that product (num1 * num2) when divided by num3
       Do the entire operation in one line and assign the answer to the variable myAnswer.
       Make sure you use the standard order of operations (PEMDAS).
       Then write a System.out.println(); statement that will print myAnswer to the console.
	 */

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		
		int num1, num2, num3;
		
		//Getting user input
		System.out.println("Enter number:");
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		
		//computing variables
		int myAnswer = (num1 * num2) % num3;
		
		//printing result
		
		System.out.println(myAnswer);
		

	}

}
