package week1_projects.projects1;

import java.io.*;
import java.util.*;
import java.math.*;

public class AreaOfRectangle {
	
	//method
	static void RectangleArea (double w, double h) {
        // variables
        double area = w * h;
        
        //printing result
   	 	System.out.println(area);
	}
	
	

	public static void main(String[] args) {
		
		//user interaction
		Scanner in = new Scanner(System.in);
		double w, h;
				
		//getting user input
		System.out.println("Enter numbers:");
		w = in.nextDouble();
		h = in.nextDouble();
		
		//calling method
		RectangleArea(w,h);
		

	}

}

