package week1_projects.projects1;

import java.io.*;
import java.util.*;
import java.math.*;

public class CircleOfArea {
	
	/*
	 * Final Constant
	
	  Given of type double called radius.
	  In the body of the method declare a 
	  constant of type double named PI equal to 3.14159
	  Then declare a variable called area
	  Set area equal to an equation that will calculate the area 
	  of a circle using PI and the radius parameter
	 */
	
	//method
	 public static void circleArea(double radius) {
	        //constant variable
			final double pi = 3.14159;
			
			//variables
			double area;
			double r = radius;
			
			//area of circle calculation
			area = pi * r * r;
			

	    /*****printing area*****/
	        System.out.println(area);
	    }

	public static void main(String[] args) {
		// User interaction
		Scanner in = new Scanner(System.in);
		double a;
		
		//getting user input
		System.out.println("Enter numbers:");
		a = in.nextDouble();
		
		//calling our method
	    circleArea(a);

	}

}
