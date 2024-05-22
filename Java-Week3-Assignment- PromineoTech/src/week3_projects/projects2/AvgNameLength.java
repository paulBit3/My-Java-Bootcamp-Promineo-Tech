package week3_projects.projects2;

import java.io.*;
import java.util.*;

public class AvgNameLength {
	/*
	 * Given a method call avgNameLength that takes in an Array of String 
	 * stored in names, write a program that will traverse the Array.
       The names Array will hold 5 names that are entered by the user
       The method avgNameLength will traverse the Array and find the 
       average length of all the names that are part of names
       Return the average length of all the names
	 */
	
	//method
	static int avgNameLength(String [] names) {
		int avLength = 0;
		int sum = 0;
		String[] myArray = new String[5];
		
		for (String word : names) {
			sum = sum + word.length();
			
		}
		
		avLength = sum / names.length;
		
		return avLength;
	} 

	public static void main(String[] args) {
		// Test
		
		//user interaction
		Scanner sc = new Scanner(System.in);
		
		//user input
		System.out.println("Enter a name: ");
		
		//declaring an name array
		String[] name;
		
		//initializing
		name = new String[5];
		
		name[0] = sc.nextLine();
		name[1] = sc.nextLine();
		name[2] = sc.nextLine();
		name[3] = sc.nextLine();
		name[4] = sc.nextLine();
		
		//calling our method
		int answer = avgNameLength(name);
		
		//printing
		System.out.println("The average name's length: " + answer);

	}

}
