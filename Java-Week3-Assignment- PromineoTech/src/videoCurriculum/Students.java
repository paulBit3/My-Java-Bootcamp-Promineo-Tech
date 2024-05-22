package videoCurriculum;

import java.io.*;
import java.util.*;

public class Students {
	/*
	 * Student class
	 */

	public static void main(String[] args) {
		
		// variables
		String studentName = "Paul Brou";
		String studentName2 = "Jennifer Romero";
		String studentName3 = "Brett Gonser";
		String studentName4 = "Matt Watlington";
		
		String instructorName = "Chuck Kiefriter";
		String mentorName = "Michael Goers";
		
		
		//a student array
		String[] students = new String[4];
		
		//assigning value
		students[0] = "Paul Brou";
		students[1] = "Jennifer Romero";
		students[2] = "Brett Gonser";
		students[3] = "Matt Watlington";
		
		
		//printing student name
		System.out.println("Students names: " + studentName + ": " + studentName2 + ": " + studentName3 + ": " + studentName4);
		
		//printing instructor name
		System.out.println("Instructor: " + instructorName);
		
		//printing mentor name
		System.out.println("Mentor: " + mentorName);
		
		//printing array values
		System.out.println("Students names in array: " + students[0] + ": " + students[1] + ": " + students[2] + ": " + students[3]);
		
		//for loop to print
		for (int i =0; i < students.length; i++) {
			//printing array values
			System.out.println("Students names in array: " + students[i]);
		}
		
		//enhance for loop to print
		for (String student: students) {
			//printing array values
			System.out.println("Enhance printing Students names : " + student);
		}

	}

}
