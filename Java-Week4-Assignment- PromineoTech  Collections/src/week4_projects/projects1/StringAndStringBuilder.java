package week4_projects.projects1;
import java.io.*;
import java.util.*;

public class StringAndStringBuilder {
	
	//method to multiply string
	public static String multiplyString(String word, int num) {
		//a string variable to keep our word
		String result = "";
		
		//looping
		for( int i = 0; i < num; i++) {
			result = result + word;
			//or result += word;
		}
		return result;
		
	}
	
	//a method with String Builder
	public static String multiplyStringWithStringBuilder(String word, int num) {
		//string variable using string builder
		StringBuilder result = new StringBuilder();
		
		//looping
		for(int i = 0; i < num; i++) {
			//appending
			result.append(word);
		}
		return result.toString();
	}

	public static void main(String[] args) {
		// 
		String firstName = "Paul";
		String lastName = " Brou";
		//System.out.println(firstName + " " + lastName);
		
		//calling our method
		multiplyString(firstName, 3);
		
		//printing
		System.out.println(multiplyString(firstName, 3)); //will print PaulPaulPaul
		
		//Using String Builder
		StringBuilder fullName = new StringBuilder("ELLo");
		//appending
		fullName.append(lastName);
		
		//printing out
		System.out.println(fullName.toString()); //will print ELLo Brou
		
		//calling our method that  contains String Builder
		multiplyStringWithStringBuilder(firstName, 3);
		
		//printing
		System.out.println(multiplyStringWithStringBuilder(firstName, 3)); //will print PaulPaulPaul
		
		//checking what character is adding a specific index in String builder
		
		//we use charAt
		System.out.println(fullName.charAt(0)); //will print E
		System.out.println(fullName.charAt(3)); //will print o
		System.out.println(fullName.charAt(5)); //will print B
		
		//deleting a character
		//removing char at a specify position
		System.out.println(fullName.deleteCharAt(3)); //will remove ELL Brou
				
		//remove char a substring
		System.out.println(fullName.delete(4, 5)); //will print ELL rou
		
		
		//find index of specific character
		System.out.println(fullName.indexOf("B")); //will print 5
		System.out.println(fullName.indexOf("ro")); //will print 6
		
		//replacing a value
		String lastName2 = "Masha";
		System.out.println(fullName.replace(4, 5, lastName2)); //ELLoMashaBrou
		
		//reversing charater
		System.out.println(fullName.reverse()); //uorBahsaMoLLE

	}

}
