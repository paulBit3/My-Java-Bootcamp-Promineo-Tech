package week2_projects;

import java.io.*;
import java.util.*;

public class TheOldestPerson {
	
	/*
	 * Given three variables, personOneAge, personTwoAge, and 
	 * personThreeAge, write a program that will determine who is the oldest.
       If Person one is the oldest, print "Person one is the oldest."
       If Person two is the oldest, print "Person two is the oldest."
       If Person three is the oldest, print "Person three is the oldest."
       Assume that no one is the same age
	 */

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		
		int personOneAge,personTwoAge, personThreeAge;
		
		//getting user input
		personOneAge = in.nextInt();
		personTwoAge = in.nextInt();
		personThreeAge = in.nextInt();
      
		
		//determine who is the oldest person
		if(personOneAge > personTwoAge && personOneAge > personThreeAge) {
			//printing the oldest person
			System.out.println("Person one is the oldest.");
		} else if(personTwoAge > personOneAge && personTwoAge > personThreeAge) {
			//printing the oldest person
			System.out.println("Person two is the oldest.");
		} else {
			//printing the oldest person
			System.out.println("Person three is the oldest.");
		}

	}

}
