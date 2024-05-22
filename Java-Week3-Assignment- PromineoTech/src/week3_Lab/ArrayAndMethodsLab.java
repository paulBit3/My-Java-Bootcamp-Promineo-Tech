package week3_Lab;

import java.io.*;
import java.util.*;
import java.math.*;

public class ArrayAndMethodsLab {

	public static void main(String[] args) {
		
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] numbers = {1, 5, 2, 8, 13, 6};

		
		// 2. Print out the first element in the array
		System.out.println("Frist element: " + numbers[0]);
	
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println("Last element: " + (numbers.length - 1));
		
		
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println("Element at position: " + numbers[6]); //this throw an error

		
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println("Element at position: " + numbers[-1]); //this throw an error

			
		// 6. Write a traditional for loop that prints out each element in the array
		for (int i = 0; i < numbers.length; i++) {
			//prints out each element in the array
			System.out.println("Elements in array: " + numbers[i]);
		}
	
			
		// 7. Write an enhanced for loop that prints out each element in the array
		for (int i : numbers) {
			//prints out each element in the array
			System.out.println("Elements in array: " + i);
		}

		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		int sum = 0;
		for (int i : numbers) {
			sum += i;
			System.out.println("The sum: " + sum);
		}

			
		// 9. Create a new variable called average and assign the average value of the array to it
	
		double av = 0;
		av = sum / numbers.length;
		System.out.println("Average value of the array: " + av);

		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for (int i : numbers) {
			//if number is not divisible by 2
			if (i % 2 == 1) {
				//printing odd number in the array 
				System.out.println("Odd numbers are: " +i);
			}
		}

		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String names[] = {"Sam", "Sally", "Thomas", "Robert"};
		for (String name: names) {
			System.out.println("Name: " +name);
		}

		
		// 12. Calculate the sum of all the letters in the new array
		//meaning we need to find the length
		int theSumOfLet = 0;
		for (String name: names) {
			theSumOfLet += name.length();
		}
		
		//printing
		System.out.println("Name: " +theSumOfLet);

		//testing method
		String name = "Paul";
		String name2 = "Anna";
		//calling our method
		greetings(name);
		
		
		String greet = greetMe(name);
		System.out.println(greet);
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		//the two method both print greeting, but the second method return a value
	}
	

	//
	// Methods:
	//
	
	// 13. Write and test a method that takes a String name and prints out a greeting. 
	//			This method returns nothing.
	static void greetings(String name) {
		//printing greeting
		System.out.println("Hello " +name);
	}
	
	
	// 14. Write and test a method that takes a String name and  
	//			returns a greeting.  Do not print in the method.
	public static  String greetMe(String name) {
		//returning greeting
		return "Hello " + name;
	}

	
	
	
	// 15. Write and test a method that takes a String and an int and 
	//			returns true if the number of letters in the string is greater than the int
	
	
	// 16. Write and test a method that takes an array of string and a string and 
	//			returns true if the string passed in exists in the array
	
	
	// 17. Write and test a method that takes an array of int and 
	//			returns the smallest number in the array

	
	// 18. Write and test a method that takes an array of double and 
	//			returns the average
	

	// 19. Write and test a method that takes an array of Strings and 
	//			returns an array of int where each element
	//			matches the length of the string at that position

			
	// 20. Write and test a method that takes an array of strings and 
	//			returns true if the sum of letters for all strings with an even amount of letters
	//			is greater than the sum of those with an odd amount of letters.


	// 21. Write and test a method that takes a string and 
	//			returns true if the string is a palindrome

	
	
	


}
