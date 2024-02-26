package week1_projects.projects2;

import java.io.*;
import java.util.*;
import java.text.*;

public class FullName {
	/*
	 * Create a variable named fullName and set it equal to your full name.
	   Choose the appropriate data type for your variable.
       When the program runs, it will check your code and print the data type of your variable.
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
		
		//string variable
	    String fullName = "Paul";
	    
		
	    /*****Calling our method*****/		
		checkType(fullName);

	}

}
