package week3_projects.projects1;

import java.io.*;
import java.util.*;
import java.math.*;

public class ReturnSum {
	/*
	 * Create a static method named returnSum that accepts 3 int 
	 * variables named num1, num2, and num3
       The method should return the sum of the three variables
       Note: Don't forget to include the opening and closing curly 
       braces for the method
	 */
	
	//method
	public static int returnSum(int num1, int num2, int num3) {
		
		int sum = num1 + num2 + num3;
	
		return sum;
		
		//or we can do
		//return num1 + num2 + num3;
		
	}

	public static void main(String[] args) {
		
		// testing methods
		int a = 4;
		int b = 45; 
	    int c = 23;
	
	    //calling our method
	    int mySum = returnSum(a,b,c);
	    
	    System.out.println(mySum);
	    
	    //or we could do
	    //System.out.println(returnSum(a, b, c));

	}

}
