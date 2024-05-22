package week4_projects.projects1;

import java.io.*;
import java.util.*;

public class CodingChallenge {
	/*
	 * Write code that reverses a variable of type StringBuilder() 
	 * without using the reverse() method, and then print the result to the Console.
	 */
	
	//method
	public static String reverseString(String word) {
		//string builder variable
		StringBuilder res = new StringBuilder();
		
		//looping through the word size
		for(int i = word.length() - 1; i >= 0; i--) {
			//appending
			res.append(word.charAt(i));
		}
		return res.toString();
	}

	public static void main(String[] args) {
		// Testing
		
		//user interaction
		Scanner sc = new Scanner(System.in);
		
		//user input
		System.out.println("Enter a word: ");
		String word = sc.nextLine();
		
		//calling our method
		reverseString(word);
		
		System.out.println(reverseString(word)); //it will print dlroW olleH if we type Hello World
		

	}

}
