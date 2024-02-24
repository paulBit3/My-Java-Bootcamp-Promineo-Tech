package week2_projects;

import java.io.*;
import java.util.*;

public class TeamMakePlayOff {
	/*
	 * Evaluate if your favorite baseball team is any good 
	 * and might make the playoffs. You are given two integer 
	 * variables, wins and losses, and one Boolean variable called isFall.
       If wins is greater than losses and isFall equals true, 
       then print a message that says “It's looking good for your 
       team to make the playoffs.”
       If wins is greater than losses, but isFall is false, then print 
       “Your favorite team has promise, but it's too early to tell.”
       Finally, if both conditions evaluate to false, then print 
       “It's not looking too good.”
	 */
	
	//method
	static void playoffs(int wins, int losses, boolean isFall) {
		//check if wins is greater than losses and isFall equals true
	if(wins > losses && isFall == true) {
		//printing
		System.out.println("It's looking good for your team to make the playoffs.");
		} else if(wins > losses && isFall == false) {
			//printing
			System.out.println("Your favorite team has promise, but it's too early to tell.");
		} else {
			//printing
			System.out.println("It's not looking too good.");
		}
	}

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		
		int wins, losses;
		boolean isFall;
		
		//getting user input
		System.out.println("Enter number: ");
		wins = in.nextInt();
		losses = in.nextInt();
		isFall = in.nextBoolean();
		
		//calling our method
		playoffs(wins, losses, isFall);

	}

}
