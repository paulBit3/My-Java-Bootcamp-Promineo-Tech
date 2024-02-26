package week2_projects.projects1;

import java.io.*;
import java.util.*;

public class HottestDay {
	
	/*
	 * Given three variables, sundayTemp, mondayTemp, and tuesdayTemp, 
	 * write a program that will determine which day is the hottest.
       If sundayTemp is the highest, print "Sunday"
       If mondayTemp is the highest, print "Monday"
       If tuesdayTemp is the highest, print "Tuesday"
       Assume that none of the temperatures are the same
	 */
		
	//Method
	static void hottestDay(double sundayTemp, double mondayTemp, double tuesdayTemp) {
		
		//check the days temperatures
		if(sundayTemp > mondayTemp && sundayTemp > tuesdayTemp) {
			//printing the day
			System.out.println("Sunday");
		} else if(mondayTemp > sundayTemp && mondayTemp > tuesdayTemp){
			//printing the day
			System.out.println("Monday");
		} else if(tuesdayTemp > sundayTemp && tuesdayTemp > mondayTemp) {
			//printing the day
			System.out.println("Tuesday");
		}
    }
	
	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		
		//getting user input
		System.out.println("Enter temperature:  ");
		double sundayTemp, mondayTemp, tuesdayTemp;
		
		sundayTemp = in.nextDouble();
		mondayTemp = in.nextDouble();
		tuesdayTemp = in.nextDouble();
		
		//calling our method
		hottestDay(sundayTemp, mondayTemp, tuesdayTemp);
		

	}

}
