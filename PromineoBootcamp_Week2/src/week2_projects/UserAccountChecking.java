package week2_projects;

import java.io.*;
import java.util.*;

public class UserAccountChecking {

	public static void main(String[] args) {
		
		//User interaction
		Scanner sc= new Scanner(System.in);
		
		//Getting user input
		System.out.print("Enter username:  "); 
		
		String username = sc.nextLine();  
		
		System.out.print("Enter password: "); 
		
		String password = sc.nextLine();   
		
		if (username.equals("paul12345") && password.equals("12345")) {
		 System.out.println("Welcome back " + username);
		    } else { 
		 System.out.println("Inaccurate credentials!"); 
		} // end of else 

	} //end of main

} //end of the class
