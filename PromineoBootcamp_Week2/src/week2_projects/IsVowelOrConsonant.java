package week2_projects;

import java.io.*;
import java.util.*;

public class IsVowelOrConsonant {
	/*
	 * Given a variable named letter of type char. Create an if/else 
	 * statement to check to see if the character stored in 
	 * the variable letter is a vowel or a consonant.
       The if statement should have the variable letter equal 
       to each vowel separated by the || operator
       If the character is a vowel, then print "It's a vowel!"
       Else, print "It's a consonant!"
	 */
	
	//Method
    public static void aeiou(char letter) {          
        
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'
				 || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O'
				 || letter == 'U') {
			 //printing if vowel
			 System.out.println("It's a vowel!");
		 } else {
			 //printing consonant
			 System.out.println("It's a consonant!");
		 }
 
    }

	public static void main(String[] args) {
		
		// User interaction
		Scanner in = new Scanner(System.in);
		char a;
		
		a = in.nextLine().charAt(0);
		
		//calling out method
	    aeiou(a);

	}

}
