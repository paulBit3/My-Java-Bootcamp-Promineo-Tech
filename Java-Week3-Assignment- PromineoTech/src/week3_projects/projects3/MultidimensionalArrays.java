package week3_projects.projects3;

import java.io.*;
import java.util.*;

public class MultidimensionalArrays {
	/*
	 * In this problem you will create a multidimensional Array of int named arr.
       You are given two integer variables, a and b that are user inputs
       Use these integer values to initially declare your new Array arr, 
       where these integers determine the size of both dimensions of the Array
       Then, use these int values to create both an inner and outer Array using 
       some type of loop (maybe a for loop) that starts at zero and goes to whatever 
       number values are stored in a and b
       To complete this problem, when you've populated the Arrays 
       (after the nested loops have completed), print the last element of the
        first Array to the console.
       Here are a few tips:

       Error Checking: Make sure both numbers entered by the 
       user are greater than two (2). If not, print the following
       message to the console: "Both numbers need to be greater than 2."
       You will need to create two loops to populate the multidimensional
       Array, storing the index of the second loop in the Array positions.
	 */
	
	//our static method
	static void myMultiDimension(int a, int b) {
		
		//checking for error
		if ((a <= 2) || (b <= 2)) {
			//printing to user
			System.out.println("Both numbers need to be greater than 2.");
		} else {
			//creating our multidimensional array
			//a is a row and b is a column
			int[][] arr = new int[a][b];
			int i, j;

			int val = 1;
			//looping through our multidimensional array
			for(i = 0; i < a; i++) {
				for(j = 0; j < b; j++) {
					//populating the multidimensional array with i*j
					//arr[i][j] = (i +1) * (j +1 );
					//or we can do
					arr[i][j] = j;
					//printing element
					System.out.println("arr element[" + i +"][" + j +"] = " + arr[0][arr[0].length -1]);
					
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		// Test
		
		//user interaction
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		//user input
		System.out.println("Enter your number: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		//calling our method
		myMultiDimension(a,b);

	}

}
