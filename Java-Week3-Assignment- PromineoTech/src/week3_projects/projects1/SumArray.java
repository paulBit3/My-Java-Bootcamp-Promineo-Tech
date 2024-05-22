package week3_projects.projects1;

import java.io.*;
import java.util.*;
import java.math.*;

public class SumArray {
	/*
	 * Takes an array of integer and return the sum of all integer
	 * 
	 */
	
	//method that takes an array
	public static int sumArray(int[] x) {
		//initializing
		int sum = 0;
		
		//looping
		for (int i : x ) {
			sum += i;
		}
		
		//return value
		return sum;
	}
	

	public static void main(String[] args) {
		
		//an integer array
		int[] number = {4, 5};
	
		
		//calling our method
		int mySum = sumArray(number);
		
		// printing sum
		System.out.println("The sum: " + mySum);

	}

}
