package week3_projects.projects3;

import java.io.*;
import java.util.*;
import java.math.*;

public class AddThemUp {
	/*
	 * Using the given Array of 5 integers named numbers and the given variable sum, 
	 * print out the sum of all the elements in the Array.
       Write a for loop that will iterate over the numbers 
       Array and add each element of the Array to sum
	 */
	

	public static void main(String[] args) {
		
		// array of integer
		//this also initializes the array
		int[] numbers = {2, 4, 6, 8, 10};
		int sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		// or we could also do it like this
		//declares an integer Array with a size of 5
		// int[] array1 = new int[5];
		
		//declares an integer Array reference without allocating memory for the Array
		//int[] array3; 

		
		//printing
		System.out.println("Element sum: " +sum);
		

	}

}
