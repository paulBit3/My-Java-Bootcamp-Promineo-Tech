package week3_projects.projects2;

import java.io.*;
import java.util.*;

public class SumOfDigit {
	/*
	 * Complete the method called sumOfDigits that takes an integer 
	 * variable called digits. Then return the sum of all the digits in digits. 
	 * For example, 245 would be 2 + 4 + 5 = 11.
	 */
	
	//method
	static int sumOfDigit(int digits) {
		
		String myDigit = "";
		//returning a string
		myDigit = Integer.toString(digits);
		
		int sum = 0;
		
		for (int i = 0; i < myDigit.length(); i++) {
			
			//using the ASCII to get the numeric value, we subtract 0
			sum += myDigit.charAt(i) - '0';
		}
		return sum;
	}
	
	//we could also use modulo in this way
	//	int result = 0;
	//	
	//	while(digits > 0) {
	//		result += digits % 10;
	//		digits /= 10;
	//	}
	//	return result;

	public static void main(String[] args) {
		// Test
		
		//user interaction
		Scanner sc = new Scanner(System.in);
		
		//user input
		System.out.println("enter a digit: ");
		 int dig= sc.nextInt();
		
		//calling our method
		int digitSum = sumOfDigit(dig);
		
		System.out.println("Sum of the digit is: " + digitSum);

	}

}
