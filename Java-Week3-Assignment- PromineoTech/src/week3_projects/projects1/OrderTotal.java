package week3_projects.projects1;

import java.io.*;
import java.util.*;
import java.math.*;

public class OrderTotal {
	/*
	 * Complete the method called orderTotal that takes in 4 doubles 
	 * stored in product1, product2, product3, and taxRate. 
	 * The method will sum the values of product1, product2, and product3. 
	 * Then it will figure out the applicable sales tax using the variable 
	 * taxRate. Finally, the method should return a double 
	 * that is the total order price with tax.
	 */
	static double orderTotal(double p1, double p2, double p3, double taxRate) {
		double sum;
		double totalOrder;
		
		sum = p1 + p2 + p3;
		
		//tax rate amount
		taxRate = sum * taxRate;
		
		//I print it to test the rate value
		//System.out.println(taxRate);
		
		//total price
		totalOrder = sum + taxRate;
		
		//return total price of the order
		return totalOrder;
	}

	public static void main(String[] args) {
		// Test
		double p1 = 15999;
		double p2 = 7999;
		double p3 = 5999;

		double rate = .09;
		double mySum = orderTotal(p1,p2,p3,rate);
		System.out.println("Your order total is: $" + String.format("%.2f", mySum));
		

	}

}
