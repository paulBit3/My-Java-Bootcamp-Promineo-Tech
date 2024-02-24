package week2_projects;

import java.io.*;
import java.util.*;

public class YIsLessThanYAndNegate {
	/*
	 * Given variables x and y, write an expression that 
	 * says x is less than y and negate that expression with !.
       Print the result of that expression to the console.
       Hint: Use the ! operator.
	 */

	public static void main(String[] args) {
		
		// user interaction
		Scanner in = new Scanner(System.in);
		
		int x, y;
		
		//getting user input
		System.out.print("Enter numbers:  ");
		x = in.nextInt();
		y = in.nextInt();
		
		//says x is less than y
		boolean isLessThan = ( !(x < y));
			
		//printing the value
		System.out.println(isLessThan);

	}

}
