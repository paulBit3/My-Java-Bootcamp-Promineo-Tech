package week3_projects.projects1;

import java.io.*;
import java.util.*;

public class RepeatWord {
	/*
	 * Complete the method that takes a String named userWord and 
	 * an integer value named numTimes.
       In that method you will take the value stored in 
       numTimes and create a new String that repeats userWord that many times
       Then return the new String value from the method
	 */
	
	//method
	static String repeatWord(String userWord, int numTimes) {
		
		//result
		String result = "";
		
		//looping
		for (int i = 0; i < numTimes; i++) {
			
			result += userWord;
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		// testing
		
		//user interaction
		Scanner in = new Scanner(System.in);
		
		int numTimes;
		String userWord;
		
		//getting user input
		System.out.println("Type a word: ");
		userWord = in.nextLine();
		
		System.out.println("Enter a number: ");
		numTimes = in.nextInt();
		
		System.out.println(repeatWord(userWord,numTimes));



	}

}
