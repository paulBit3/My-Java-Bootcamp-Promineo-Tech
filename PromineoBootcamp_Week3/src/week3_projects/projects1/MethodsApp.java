package week3_projects.projects1;

import java.io.*;
import java.util.*;

public class MethodsApp {
	/*
	 * 
	 */
	 static double divideNums(int a, int b){
	        return a/b;
	    }

	public static void main(String[] args) {
		// Test
		System.out.println(divideNums(5, 0));
		
		//that will throw an exception error
		//Exception in thread "main" java.lang.ArithmeticException: / by zero

	}

}
