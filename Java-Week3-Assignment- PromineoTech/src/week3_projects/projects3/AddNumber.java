package week3_projects.projects3;

import java.io.*;
import java.util.*;
import java.math.*;

public class AddNumber {
	/*
	 * Given an Array of int called arr and an integer variable x, do the following:
       Part 1:

        Loop through the Array arr to print the values of the Array, 
        using System.out.println();
        Then add the value in x to each element in arr 
        (after using System.out.println();)
        
       Part 2:
       Loop through the Array arr a second time, use System.out.println(); 
       to print out each element to the console
	 */
	
	//we going to create an array to handle the part 1:
	
	//Our method
	static void addNumber(int[] arr, int x) {
		int sum = 0;
		
		//Loop through the Array arr 
		for(int i = 0 ; i < arr.length; i++) {
			//print the value of the array arr
			System.out.println(arr[i]);
			
			//Then add the value in x to each element in arr
			arr[i] += x;
			//System.out.println(sum);
		}
		
		//Loop through the Array arr a second time
		for(int j = 0 ; j < arr.length; j++) {
			// print the values of the Array
			System.out.println(arr[j]);
		}
		
		
	
	}
	
	

	public static void main(String[] args) {
		// Test
		
		//user interaction
		Scanner in = new Scanner(System.in);
		
		int x;
		int[] arr = { 5, 10, 44, -4, 10 };
		
		//user input
		System.out.println("Enter numbers: ");
		x = in.nextInt();
		addNumber(arr, x);
		
		//that will print for example
		/*
		 * **Original** 5 10 44 -4 10 
		 * New Array** 6 11 45 -3 11
		 */

	}

}
