package week1_projects;
import java.io.*;
import java.util.*;
import java.math.*;

public class ItemPrice {
	
	/*
	 * Create a variable named itemPrice and set it equal to the price 
	 * of your favorite item on Amazon.
	   Choose the appropriate data type for your variable.
	   When the program runs, it will check your code and print the data type 
	   of your variable.
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
		
		// double variable
		double itemPrice = 55.76;
		
		
	    /*****Calling our method*****/		
		checkType(itemPrice);

	}

}
