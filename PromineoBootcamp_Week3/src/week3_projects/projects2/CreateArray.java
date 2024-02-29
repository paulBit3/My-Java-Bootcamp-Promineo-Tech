package week3_projects.projects2;

import java.io.*;
import java.util.*;

public class CreateArray {
	/*
	 * Complete the method that accepts five integer 
	 * values stored in the variables a, b, c, d, e.
       In the method, you will create an Array of int 
       that stores the value of the five parameters
       The method should return the Array
	 */
	
	//method
	static int[] createArray(int a, int b, int c, int d, int e) {
		//declaring int array
		int [] myArray = new int[6];
		myArray[0] = a;
		myArray[1] = b;
		myArray[2] = c;
		myArray[3] = d;
		myArray[4] = e;
		
		//or we can create array like this
		//int[] myArray = {a, b, c, d, e};
		
		//just to print the table for test
       // for (int i : myArray) {
       //	 System.out.println(myArray[i]);
       // }
		return myArray;
	}

	public static void main(String[] args) {
		// Test
		Scanner sc = new Scanner(System.in);
		
		//variables
		int a, b, c, d, e;
		
		//user input
		System.out.println("Enter numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		//calling our method
		int [] testArray = createArray(a, b, c, d, e);
		
		//printing
		System.out.println("The 3rd number of your array is: " + testArray[2]);

	}

}
