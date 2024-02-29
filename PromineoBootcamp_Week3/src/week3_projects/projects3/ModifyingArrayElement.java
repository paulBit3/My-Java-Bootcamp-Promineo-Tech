package week3_projects.projects3;

import java.io.*;
import java.util.*;
import java.math.*;

public class ModifyingArrayElement {
	/*
	 * Given an Array of int, replace the first and last value stored in the Array.
       Use the given integer values a and b provided by the user to replace 
       the first and last elements, respectively
       Loop through the Array and print each element in the Array to the console
	 */
	
	//we'll use a method that takes 3 parameter a, b, array
	static void replaceFirstLast(int a, int b, int[] arr) {
		//determines length of firstArray
		int len = arr.length;
		
		//determines length of secondArray
		//creating a new array with larger size to store new elements
		int[] res = new int[len + 1];

		//looping through
		for(int i = 0; i < len; i++) {
			//copying element
			res[i] = arr[i];
			
			//adding element
			res[0] = a;
			res[len-1] = b;
			
			//printing new array element
			System.out.println(res[i]);
		}
	}
	
	//or we could do something simply
//	static void replaceFirstLast(int a, int b, int[] arr) {
//		  arr[0] = a;
//	      arr[arr.length - 1] = b;
//	        
//	      for ( int x : arr ) {
//	            System.out.println(x);
//	      }
//	}


	public static void main(String[] args) {
		// Test
		
		//user interaction
		Scanner sc = new Scanner(System.in);
		
		//user input
		System.out.println("Enter numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[] arr = { 3, 7, 0, 4, -6, 10, 55 };
		
		replaceFirstLast(a, b, arr);

	}

}
