package week3_projects.projects2;

import java.io.*;
import java.util.*;
import java.math.*;

public class RectanglePerimeter {
	/*
	 * Write a program that will calculate the perimeter of the rectangle
       The method should method should accept two int variables 
       named length and width and return an integer value representing 
       the perimeter of the rectangle
	 * write a static method called rectanglePerimeter :
	 */
	
	//method
	static int rectanglePerimeter(int l, int w) {
		//initializing perimeter p variable
		int p = 0;
		
		//calculating p
		p = 2 * (l+w);
		
		//returning perimeter p
		return p;
		
		//or we could also do
		//return 2 * (length + width);
		
	}

	public static void main(String[] args) {
		// Test
		
		//user interaction
		Scanner sc = new Scanner(System.in);
		
		//user input
		System.out.println("Enter perimeter values: ");
		int length = sc.nextInt();
		int width = sc.nextInt();
		
		//calling our method
		int result = rectanglePerimeter(length, width);
		
		//printing perimeter value
		System.out.println("Your rectangle perimeter is: " + result);

	}

}
