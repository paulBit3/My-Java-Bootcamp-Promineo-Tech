package week3_projects.projects3;

import java.io.*;
import java.util.*;

public class BuiltNewArray {
	/*
	 * Given an Array of words named arr and variables word1, 
	 * word2, and word3 do the following:
       Create a new Array called newArr that has word1, 
       word2, and word3 as it's elements
       Create another Array that is big enough to hold all 
       of the words from the original Array arr, as well as the 
       three new words. You can name this Array to your liking.
       Write a loop to get the words from the original Array arr 
       and put them into your new Array
       Add the words from newArr into the new Array also
       Finally, loop through your new Array and print each element to the console
	 */
	
	//method
	static void newArray(String word1, String word2, String word3, String [] arr) {
		
		//new array newArr
		String[] newArr = {word1, word2, word3};
			
		//array2 length
		int len2 = newArr.length;
		//2nd array that is big enough
		String[] secondArray = new String[len2 + 1];
				
		//fisrt loop
		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i+1];
			System.out.println(newArr[i]);
		}
				
		//second loop
		for(int j = 0; j < newArr.length; j++) {
			secondArray[j] = newArr[j];
			System.out.println(secondArray[j]);
		}
		
	}

	public static void main(String[] args) {
		// Test
		
		//user interaction
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"Astros", "Reds", "Phillies", "Dodgers", "Angels"};
		
		//user input
		System.out.println("Enter your words: ");
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		String word3 = sc.nextLine();
		
		//calling our array
		newArray(word1, word2, word3, arr);

	}

}
