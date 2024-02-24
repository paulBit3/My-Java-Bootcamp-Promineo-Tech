package week2_projects;

import java.io.*;
import java.util.*;
import java.math.*;

public class PowerOfNumber {
	/*
	 * Given variables power, base, and result, 
	 * use a for loop to raise the base to the power of power (i.e. base^power).
       The loop should run from 1 to the number stored in power
       In the loop body, result should be multiplied by the base every 
       time the loop iterates and that value stored in result, 
       like this: result *= base or result = result * base
       Print the value of result to the console
	 */

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		
		//getting user input
		System.out.println("Enter a number: ");
        int base = in.nextInt();
        int power = in.nextInt();
        int result = 1;


	    for(int i = 1; i <= power ; i++ ) {
	    	result= result * base;
		
		}
	    //print result value
		System.out.println(result);
	
	}

}
