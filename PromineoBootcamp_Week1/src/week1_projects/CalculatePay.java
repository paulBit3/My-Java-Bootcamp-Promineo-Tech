package week1_projects;

import java.io.*;
import java.util.*;

public class CalculatePay {
	/*
	 * Given the already declared variables hoursWorked, hourlyRate, and taxRate,
	 * all of type double. Do the following:
       Declare two variables: grossPay and netPay.
       Calculate the gross pay by multiplying hoursWorked by hourlyRate, 
       and store that result in grossPay
       Calculate the net pay by multiplying the value of taxRate 
       by grossPay and subtracting that amount from grossPay, 
       and store that result in netPay.
	 */

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		
		//Getting user input
		System.out.println("Enter number:");
		double taxRate = .25;
		double hoursWorked = in.nextDouble();
		double hourlyRate = in.nextDouble();
		
		// pay variable
		double grossPay, netPay ;
				
		//computing gross pay
		grossPay = hoursWorked * hourlyRate;
				
		//computing net pay
		netPay = grossPay - (taxRate * grossPay) ;
		
		/*** printing ***/
		System.out.printf("Gross Pay: %.2f\n", grossPay);
		System.out.printf("Net Pay: %.2f\n", netPay);

	}

}
