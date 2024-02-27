package week3_projects.projects1;

import java.io.*;
import java.util.*;
import java.math.*;

public class FixErrorAnalysis {
	/*
	 * Fix the error in this method. It is supposed to return the sum 
	 * of the three integers for a total of 30 but it only returns 10. 
	 * Fix this bug with only changing one line of code.
	 */
	
	//method
	 static int returnSum(int x, int y, int z){
	        int answer = x + y + z;
	        //return x;//<-the error is here. instead of returning answer variable, 
	                 //it just return x
	                 // so I will fix it by returning answer variable instead->
	        return answer;
	    }

	public static void main(String[] args) {
		// Test
		int a = 10, b = 10, c = 10;
        System.out.println(returnSum(a,b,c));

	}

}
