package week3_projects.projects2;

import java.io.*;
import java.util.*;

public class PasswordChecker {
	/*
	 * Write a method called passwordChecker that accepts the String stored in variable password.
	   The method should check to make sure that password is at least 8 characters 
	   in length and contains one of 4 special symbols, !, $, %, or &
       The method should return true or false.
	 */
	
	//method
//	static boolean passwordChecker(String password) {
//		boolean symbol = password.matches("!$%&");
//		for (int i = 0; i < password.length();) {
//			if ((password.length() >= 8) && (!symbol) ) {
//				return false;	
//			}else
//				return true;
//		}
//		return false;
//	}
	
	//or we can do this
	static boolean passwordChecker(String password) {
		if (password.length() >= 8 && 
			    (password.contains("!") ||
			     password.contains("$") ||
			     password.contains("%") || 
			     password.contains("&"))) {
			         return true;
			     }
			return false;
	}
	
	
	public static void main (String [] args) {
		//Test
		
		String pw = "!$%&!$%&";
		
		//calling our method
		boolean pass = passwordChecker(pw);
		System.out.println(pass);
		if (pass) {
			System.out.println(pass + "meets the requirements.");
		} else {
			System.out.println(pass + "does not meet the requirements.");
		}
	}

}
