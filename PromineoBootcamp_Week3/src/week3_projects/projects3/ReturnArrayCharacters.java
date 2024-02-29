package week3_projects.projects3;

import java.io.*;
import java.util.*;

public class ReturnArrayCharacters {
	/*
	 * In the static method wordToArray take the value of userWord and 
	 * turn it into an Array of char taking each letter in userWord and 
	 * storing it into that Array.
       Name your new Array variable charArray
       return the Array variable in the method body
	 */
	//I will create 2 array
	
	//our static method
	static char[] wordToArray(String useWord) {
		//getting the length of the word
		int len = useWord.length();
		//char array and assign it
		char[] charArray = new char[len];
		
		for(int i = 0; i < len; i++) {
			charArray[i] = useWord.charAt(i);
			//System.out.println(charArray[i]);
		}
		return charArray;
		
	}
	
	//we also could simply do
//	static char[] wordToArray(String userWord) {
//
//		    char[] charArray = new char[userWord.length()];
//			for (int i = 0; i < userWord.length(); i++) {
//			    charArray[i] = userWord.charAt(i);
//			}
//			
//			return charArray;
//	 
//	}
//	

	public static void main(String[] args) {
		// Test
		
		//user interaction
		Scanner in = new Scanner(System.in);
		String userWord;
		
		//user input
		System.out.println("Enter your numbers: ");
		userWord = in.nextLine();
		
		//printing
		System.out.println("Your array is: ");
		System.out.println(Arrays.toString(wordToArray(userWord)));

	}

}
