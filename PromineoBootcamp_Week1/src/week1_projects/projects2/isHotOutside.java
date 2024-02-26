package week1_projects.projects2;

import java.io.*;
import java.util.*;

public class isHotOutside {
	
	/*
	 * Create a variable named isHotOutside and 
	 * set it equal to an appropriate value.
	   Choose the appropriate data type for your variable.
	   When the program runs, it will check your code and 
	   print the data type of your variable.
	 */
	
	//method
	static void checkType(Object o) {
	    if (o instanceof String) {
	        System.out.println("String");
	    } else if (o instanceof Integer) {
	        System.out.println("int");
	    } else if (o instanceof Double) {
	        System.out.println("double");
	    } else if (o instanceof Character) {
	        System.out.println("char");
	    } else if (o instanceof Boolean) {
	        System.out.println("boolean");
	    }
	}
	

	public static void main(String[] args) {
		
		// boolean variable
		boolean isHotOutside = false;
		
		/*****Calling our method*****/	
		checkType(isHotOutside);

	}

}
