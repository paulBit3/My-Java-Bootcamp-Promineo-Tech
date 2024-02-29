package week3_projects.projects3;

import java.io.*;
import java.util.*;

public class BuildArray {
	/*
	 * In the method buildArray you will take the int value stored in the given 
	 * variable num and declare an Array of that size called numArray.
       Write a for loop that starts with a loop variable or index of zero (0)
        and checks to see if the loop variable is less than num.
       To fill the Array, you will insert the value of that loop variable 
       to one of the slots in numArray indexed by the loop variable
	 */
	
	//method
	static int[] buildArray(int num) {
		//num array variable
		int[] numArray = new int[num];
		for(int i = 0 ; i < numArray.length; i++) {
			if (i < num) {
				//assigning i to num
				numArray[i] = i;
				//System.out.println(numArray[i]);
			}
		}
		return numArray;
	}

	public static void main(String[] args) {
		// Test
		
		//user interaction
		Scanner sc = new Scanner(System.in);
		
		//user input
		System.out.println("Enter your numbers: ");
		int num = sc.nextInt();
		
		System.out.println("Your array is: ");
		System.out.println(Arrays.toString(buildArray(num)));

	}

}
