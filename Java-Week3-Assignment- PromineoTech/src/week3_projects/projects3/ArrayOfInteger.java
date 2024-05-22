package week3_projects.projects3;

import java.io.*;
import java.util.*;
import java.math.*;

public class ArrayOfInteger {
	/*
	 * In the method createInt create an Array
       Use the 6 variables that are passed in as num1, 
       num2, num3, num4, num5, and num6 to create the Array
       The Array of int should be called arrayInt
       Make sure to return the last item in arrayInt
	 */
	
	//method
	static int createInt (int num1, int num2, int num3, int num4, int num7, int num6) {
		//array of int
		int[] arrayInt = new int[5];

		//length of arrayInt
		int len = arrayInt.length;
		//new table to keep element of arrayInt
		int[] res = new int[len + 1];
		
		//looping
		for(int i = 0; i < len; i++) {
			//copying element
			res[i] = arrayInt[i];
			
			//adding element
			res[0] = num1;
			res[len-1] = num6;
			
			//System.out.println(res[i]);
		}
		return res[len-1];
	}
	
	//I could simply do
//	static int createInt(int num1, int num2, int num3, int num4, int num5, int num6) {
//			int[] arrayInt = {num1, num2, num3, num4, num5, num6};
//			
//			return arrayInt[arrayInt.length - 1];
//	}

	public static void main(String[] args) {
		// Test
		
		//user interaction
		Scanner sc = new Scanner(System.in);
		
		//user input
		System.out.println("Enter your numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		int num6 = sc.nextInt();
		
		int res = createInt(num1, num2, num3, num4, num5, num6);
		System.out.println("The last number of the array is " + res + ".");

	}

}
