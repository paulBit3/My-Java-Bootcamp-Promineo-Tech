package week2_projects;

import java.io.*;
import java.util.*;

public class MoneyInBankOrBroke {
	
	/*
	 * Given four integer variables moneyInBank, rentDue, 
	 * carPayment, and food, write a conditional that will check 
	 * if there's enough money for the bills.
       Declare an int variable called billSum and set it equal to 
       the sum of rentDue, carPayment, and food
       If moneyInBank is greater than or equal to billSum, print 
       "You have enough money this week." to the console
       Else, print "You may need to borrow some money."
	 */
	
	//Method
	static void brokeOrNot(int moneyInBank, int rentDue, int carPayment, int food) {
	    
	      //Declare an int variable called billSum
			int billSum = 0;
			
			//set billSum to equal the sum of rentDue, carPayment, and food
			billSum = rentDue + carPayment + food;
			
			//check If moneyInBank is greater than or equal to billSum
			if(moneyInBank > billSum) {
				System.out.println("You have enough money this week.");
			} else {
				System.out.println("You may need to borrow some money.");
			}
	}

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		
		int moneyInBank, rentDue, carPayment, food;
		
		//getting user input
		System.out.print("Enter balance:  ");
		moneyInBank = in.nextInt();
		
		System.out.print("Enter rental price:  ");
		rentDue = in.nextInt();
		
		System.out.print("Enter car payment:  ");
		carPayment = in.nextInt();
		
		System.out.print("Enter food money:  ");
		food = in.nextInt();
		
		//calling our method
		brokeOrNot(moneyInBank, rentDue, carPayment, food);
		

	}

}
