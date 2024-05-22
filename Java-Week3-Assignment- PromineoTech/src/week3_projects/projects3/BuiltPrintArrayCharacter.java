package week3_projects.projects3;

import java.io.*;
import java.util.*;
import java.math.*;

public class BuiltPrintArrayCharacter {
	/*
	 * Given the variable userWord, create a new Array that is 
	 * made up of the characters of the word stored in the variable.
       Initialize a new Array, name it whatever you want
       Make sure to use the correct Java data type for this new Array (data type char)
       Add each letter of userWord to the Array as elements
       Once you have populated the Array, print to the console each 
       element of the Array
	 */
	
	//method
	static void charArray(String useWord) {
		//getting the length of the word
		int len = useWord.length();
		//char array
		char [] myChar = new char[len +1];
		
		for (int i = 0; i < len; i++) {
			//adding the user word go myChar table
			myChar[i] = useWord.charAt(i);
			
			//printing character
			System.out.println(myChar[i]);
		}
	}
	
	//or we could do this simply
//	static void charArray(String userWord) {
//		
//	 	char[] arr = new char[userWord.length()];
//		for ( int i = 0; i < userWord.length(); i++ ) {
//			arr[i] = userWord.charAt(i);
//		}
//		for ( int j = 0; j < arr.length; j++ ) {
//			System.out.println(arr[j]);
//		}
//	}

	public static void main(String[] args) {
		// Test
		
		//user interaction
		Scanner sc = new Scanner(System.in);
		//user input
		System.out.println("Type a word: ");
		String word = sc.nextLine();
		
		//calling our method
		charArray(word);
		

	}

}
