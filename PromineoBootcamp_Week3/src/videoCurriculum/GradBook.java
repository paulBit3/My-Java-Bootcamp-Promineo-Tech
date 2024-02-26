package videoCurriculum;

import java.io.*;
import java.util.*;
import java.math.*;

public class GradBook {
	/*
	 * student grade book program
	 */

	public static void main(String[] args) {
		
		// user interaction
		Scanner sc = new Scanner(System.in);
		
		//getting user input
		System.out.println("Enter student's name: ");
		
		//variables
		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		
		//student grade array
		//int[] grade = new int[5];
		
		//grade value
//		grade[0] = 100;
//		grade[1] = 79;
//		grade[2] = 80;
//		grade[3] = 90;
//		grade[4] = 100;
		
		//or we can do
		//student grade array
		int[] grade = {100, 79, 80, 90, 100};
		
		//printing 
		System.out.println("Student info ---");
		
		//printing student name
		System.out.println("Firstname: " + firstName +"\n" + "Lastname : " + lastName + "\n");
		
		//looping to print out
		for (int i = 0; i < grade.length; i++) {
			
			//printing student grades
			System.out.println("Student grade" +i+ ": " + grade[i]);
		}
		
		//closing the scanner
		sc.close();

	}

}
