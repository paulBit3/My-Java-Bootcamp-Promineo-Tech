package week3_projects.projects1;

import java.io.*;
import java.util.*;
import java.math.*;

public class AverageElement {
	/*
	 * Takes an array of double and returns the average of all elements in this array
	 */
	
	//method that takes an array
	public static double Average(double[] x) {
		//initializing
		double sum = 0;
		double av = 0;
		
		//looping
		for (double i : x) {
			sum += i;
		}
		
		//returning average
		return av = sum/x.length;
	}

	public static void main(String[] args) {
		
		//a double array
		double[] numbers = new double[5];
		numbers[0] = 73.5;
		numbers[1] = 43.5;
		numbers[2] = 93.5;
		numbers[3] = 33.5;
		numbers[4] = 3.5;
		
		// calling our method
		double mySum = Average(numbers);
		
		//printing sum
		System.out.println("The sum: " + mySum);

	}

}
