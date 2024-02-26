package week2_projects.projects1;

import java.io.*;
import java.util.*;


public class IsGreatThanNum2OrNum3 {
	/*
	 * Given four variables num1, num2, num3, and num4, 
	 * create a Boolean Expression.
       If num1 is greater than num2 OR num3 is less than num4, 
       then true should print to the console
       Otherwise, false should print to the console.
	 */

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		
		int num1, num2, num3, num4;
		
		//Getting user input
		System.out.print("Enter numbers:  ");
		num1 = in.nextInt();
		num2 = in.nextInt();
        num3 = in.nextInt();
        num4 = in.nextInt();


		//boolean expression
		boolean isGreater = false;
			
		//If num1 is greater than num2 OR num3 is less than num4
		isGreater = (num1 > num2 || num3 < num4);
		System.out.println(isGreater);

	}

}
