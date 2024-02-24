package week1_projects;

import java.io.*;
import java.util.*;
import java.math.*;

public class PrintModulus {

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		
		int num1, num2;
		
		//Getting user input
		System.out.println("Enter number:");
		num1 = in.nextInt();
		num2 = in.nextInt();
		
		int remainder = num1 % num2;
		
		//printing remainder
		System.out.println(remainder);

	}

}
