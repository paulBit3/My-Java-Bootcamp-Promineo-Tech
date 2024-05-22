package week3_projects.projects3;

import java.io.*;
import java.util.*;

public class ReverseAnArray {
	/*
	 * Using the initialized Array named arr that uses five (5) 
	 * integers provided by the user as elements.
       Create a new Array called reverseArr that is the 
       reverse of the original Array arr
       Then write a loop that will iterate through each Array 
       and print each element in the console
       Note: You should print the elements of both Arrays
       Hint: Both Array should have the same amounts of elements 
       and therefore have the same lengths
	 */
	
	//mtehod
	static void reverseArr(int x, int y, int z, int e, int f) {
		//first array
		int [] arr = {x, y, z, e, f};
		
		int len = arr.length;
		
		//looping through the array
		for (int i = 0; i < len/2; i++) {
			int temp = arr[i];
			int index = arr.length - i -1;
			//i--;
			arr[i] = arr[index];
			//assigning array value
			arr[index] = temp;
			
			System.out.println(Arrays.toString(arr));
			
			//printing the reverse array
			System.out.println(temp);
			
			//printing the regular array
			//System.out.println(Arrays.toString(arr));
		}
		
		//Or we could do
		//		int j = arr.length;
		//		int[] reverseArr = new int[j];
		//		
		//		for ( int i = 0; i < arr.length; i++ ) {
		//		    reverseArr[j-1] = arr[i];
		//		    j--;
		//		}
		//		
		//		for ( int x : arr ) {
		//		    System.out.println(x);
		//		}
		//		
		//		for ( int y : reverseArr ) {
		//		    System.out.println(y);
		//		}
		//		
		
	}

	public static void main(String[] args) {
		// Test
		
		//user interaction
		Scanner in = new Scanner(System.in);
		int a,b,c,d,e;
		
		//user input
		System.out.println("Enter your numbers: ");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		e = in.nextInt(); 
		reverseArr(a, b, c, d, e);

	}

}
