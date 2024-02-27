package week3_projects.projects1;

import java.io.*;
import java.util.*;
import java.math.*;

public class FizzBuzz {
	/*
	 * method called fizzBuzz that accepts the integer value stored in num1.
       If the value is divisible by 3, print "Fizz" to the console
       If the value is divisible by 5 print "Buzz" to the console
       If the value is divisible by both 3 and 5 print "FizzBuzz" to the console
       If the number is not divisible by either 3 or 5, print "Hello world!" to the console
       Use System.out.println() in all of your print statements
	 */
	
	//method
	static void fizzBuzz(int x) {
		//String word = "";
		//for (int i = 0; i < x; i++) {
			
			if (x % 3 == 0 && x % 5 == 0) {
				//word += 
				System.out.println("FizzBuzz");
			} 
			else if(x % 3 == 0) {
				//word += "Fizz";
				System.out.println("Fizz");
			}
			else if (x % 5 == 0) {
				//word += "Buzz";
				System.out.println("Buzz");
			}
			else {
				System.out.println("Hello world!");
			}
		//}
		
	}

	public static void main(String[] args) {
		// Test
		int num = 90;
		//calling our method and print
		fizzBuzz(num);

	}

}
