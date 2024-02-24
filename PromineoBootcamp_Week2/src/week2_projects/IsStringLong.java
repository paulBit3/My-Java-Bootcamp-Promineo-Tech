package week2_projects;

import java.io.*;
import java.util.*;

public class IsStringLong {
	/*
	 * Given the variable randomWord, create an if/else statement 
	 * that checks the length of the String in variable randomWord
       If the word contains 10 or more characters, print "That is a 
       really long word!"
       Otherwise, print "Your word is not that long."
	 */

	public static void main(String[] args) {
		
		   // User interaction
		   Scanner in = new Scanner(System.in);
		   
		   System.out.println("Enter a word:  ");
	       String randomWord = in.next();
	     	        
	      	//checking the word length
			if(randomWord.length() >= 10) {
				//print about the word length
				System.out.println("That is a really long word!");
			} else {
				//print about word length
				System.out.println("Your word is not that long.");
			}

	}

}
