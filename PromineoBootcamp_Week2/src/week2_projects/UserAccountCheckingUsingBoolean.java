package week2_projects;

import java.io.*;
import java.util.*;

public class UserAccountCheckingUsingBoolean {

	public static void main(String[] args) {
		
		// boolean variable
		boolean loggedIn = false;
		
		//User interaction
		Scanner sc= new Scanner(System.in);  
		
		while (!loggedIn) {
			
		//Getting user input
		System.out.print("Enter username: ");   
		String username = sc.nextLine();   
		
		System.out.print("Enter password: ");  
		
		String password = sc.nextLine();  
		
		if (username.equals("paul12345") && password.equals("12345")) {
		System.out.println("Welcome back " + username);
		loggedIn = true;
		    } else { 
		System.out.println("Inaccurate credentials!"); 
		} // end of else 
		} // end of while

	} // end main

}
