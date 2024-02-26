package week1_projects.projects2;

import java.io.*;
import java.util.*;
import java.text.*;

public class MiddleInitial {
	
	/*
	 * 
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
		
		// Char variable
		char middleInitial = 'P';
			
			
			

		/*****Calling out method*****/	
		checkType(middleInitial);
	}

}
