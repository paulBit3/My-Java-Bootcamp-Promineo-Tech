package week1_projects.projects1;

import java.io.*;
import java.util.*;


public class DebugCodeQuestion {
	
	/*
	 * The following program declares a final constant variable and 
	 * then attempts to modify its value. However, doing so results 
	 * in an error. Your task is to debug the program so that it prints 
	 * the MAX_VALUE of 10 and a NEW_MAX_VALUE of 20 to the console. 
	 * Alter the two lines of code provided to make the program work.
	 */
	
	//method
	 static void debug(int num1, int num2) {
	        
	        final int MAX_VALUE = num1; 
	        System.out.println(MAX_VALUE);
	        
	        // FIX THE CODE ON LINE 12 and 13 ONLY''--to fix it, I declared
	        //a new variable NEW_MAX_VALUE = num2
	        int NEW_MAX_VALUE = num2;
	        System.out.println(NEW_MAX_VALUE);
	        
	}

	public static void main(String[] args) {
		// User interaction
		Scanner in = new Scanner(System.in);
		int a, b;
		
		//getting user input
		a = in.nextInt();
		b = in.nextInt();
		
		//calling our method
        debug(a,b);

	}

}
