package week1_projects.projects1;

import java.io.*;
import java.util.*;
import java.math.*;

public class DivideThenDivide {
	
	/*
	 * Given the already declared variables of type double, num1, num2, and num3:
       Divide num1 by num2 and then divide that answer by num3
       Assign the answer to a variable of type double named myDivision
       Print the value of myDivision to the console
	 */

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		double num1, num2, num3;
		
		//getting user input
		System.out.println("Enter number:");
		num1 = in.nextDouble();
		num2 = in.nextDouble();
		num3 = in.nextDouble();
		
		//dividing
		double div = (num1 / num2);
		
		//dividing by num3
		double myDivision = div / num3 ;
		
		//Printing
		System.out.println(myDivision);

	}

}
