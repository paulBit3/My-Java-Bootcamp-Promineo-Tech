package week4_projects.projects1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ListProjects2 {
	

	
	/*
	 * Given a List of String called words and containing 5 values 
	 * entered by the user stored in the variables word1,word2, word3, 
	 * word4, and word5, create a new List.
	   Create a new List of String called newList
       This new List will contain every other List item from the original List 
       called words starting with the first item
       When done populating newList, execute your code to see what prints
        to the console
	 * 
	 */
	
	//we will create a method to do so
	static void myNewList(List<String> words) {
		//Create a new List of String called newList
		List<String> newList = new ArrayList<String>();
		
		//variables
		 String word1 = words.get(0);
		 String word2 = words.get(1);
		 String word3 = words.get(2);
		 String word4 = words.get(3);
		 String word5 = words.get(words.size() - 1);
		 
		 newList.add(word1);
		 newList.add(word3);
		 newList.add(word5);
		 
		 //or we could use a loop
//		 for(int i = 0; i < words.size(); i++) {
//			 if ( i % 2 == 0 ) {
//				 newList.add(words.get(i).toString());
//			 }
//		 }


		System.out.println("The old List is: " + words);
		System.out.println("The new List is: " + newList);
	}
	
	
	/*
	 * Create a List of Squared Numbers
	 * 
	 * Given five numbers by the user stored in num1, num2, num3, num4, and num5:
	   Create a List of Integer called squaredNums
	   Add the squared values of each user number as elements to squaredNums
	   Finally, return squaredNums
	 * 
	 */
	
	//we will use a method to do so
	static List<Integer> squaredNumber(int num1, int num2, int num3, int num4, int num5) {
		
		//a list to hold numbers
		List<Integer> Nums = new ArrayList<Integer>();
		Nums.add(num1);
		Nums.add(num2);
		Nums.add(num3);
		Nums.add(num4);
		Nums.add(num5);
		
		//Create a List of Integer called squaredNums
		List<Integer> squaredNums = new ArrayList<Integer>();
		
		int count = 5;
		int result = 0;
			
		for(int i : Nums) {
			//calculate the square
			result = i * i;
			
			//Add the squared values
			squaredNums.add(result);
		}
		//System.out.println(squaredNums);
		return squaredNums;
		
	}
	
	//or we could do
//	static List squaredList(int num1, int num2, int num3, int num4, int num5) {
//	 	
//	    Create a List of Integer called squaredNums
//      List<Integer> squaredNums = new ArrayList<>();
//		
//		squaredNums.add(num1*num1);
//	    squaredNums.add(num2*num2);
//		squaredNums.add(num3*num3);
//		squaredNums.add(num4*num4);
//		squaredNums.add(num5*num5);
//		
//		return squaredNums;
//		
//	}
	
	
	/*
	 * Print Index of userLetter
	 * 
	 * Given a List of char called alphabet,
	 * search the List for the char stored in userLetter and
	 * print to the console the index value of that char.
	 * 
	 */
	//we will create a method to do so
	static void findIndexLetter(List<Character> alphabet, char userLetter) {
		//index variable
		int index = 0;
		
		//looping
		for(int i = 0 ; i < alphabet.size(); i++) {
			//check if alphabet = char
			if(alphabet.get(i) == userLetter) {
				//if so, then index equal i
				index = i;
				//print out the index
				System.out.println(index);
			}
			
		}
		
		//Or we could simply do 
		
		//int valueIndex = alphabet.indexOf(userLetter);
		//System.out.println(valueIndex);
		
	}
	
	/*
	 * List of Factors
	 * 
	 * Given a variable int called userNumber, create a List of Factors 
	 * and print the List to the console.
	 * Create a List of Integer Factors by declaring 
	 * a new List variable, name it factorNum
	 * In the loop, store the factors of userNumber as elements
	 * of the factorNum List
	 * Finally, print the List to the console
	 * 
	 * Note: All values of userNumber will have two (2) possible 
	 * factors at a minimum: one (1) and userNumber.
	 */
	
	//we will create a method to so
	
	/*
	 * we know that a Factor, in mathematics, is a number that divides another number
	 *  or expression evenly—i.e., with no remainder
	 */
	static void listOfFactors(int userNumber) {
		
		//integer variable to hold factor
		int result = 0;
		//Create a List of Integer Factors
		List<Integer> factorNum = new ArrayList<Integer>();
		
		//looping
		for(int i = 1; i <= userNumber; i++) {
			if(userNumber % i == 0) {
				result = userNumber / i;
				factorNum.add(result);
				
				//or do factorNum.add(i);
				
				//I used natural comparator method to sort in order
				factorNum.sort(Comparator.naturalOrder());
				}
		}
		
		//Or we could simply do
	   //for (int i = 1; i <= userNumber; i++) {
	  //    if ( userNumber % i == 0) {
	 //	        factorNum.add(i);
	//	    }
   //	}
			
		//printing result
		System.out.println(factorNum);
	}
	
	
	
	
	
	
	
	
	
	
	/*\                                      /*\
	 * -------------------------------------- *
	 * T e s t i n g   i n main method below  *
	 * -------------------------------------- *
	\*/										 /*\/**/
	

	public static void main(String[] args) {
		// Testing
		

		
		//Testing myNewList method
		
		//user interaction
		Scanner r = new Scanner(System.in);
		
		String word1, word2, word3, word4,word5;
		//user input
		System.out.println("Type a word: ");
		word1 = r.nextLine();
		word2 = r.nextLine();
		word3 = r.nextLine();
		word4 = r.nextLine();
		word5 = r.nextLine();
		
		List<String> words = new ArrayList<>();
		words.add(word1);
		words.add(word2);
		words.add(word3);
		words.add(word4);
		words.add(word5);
		
		//calling our myNewList method
		myNewList(words);
		
		
		
		//Testing our squaredNumber method
		
		//user interaction
		Scanner rn = new Scanner(System.in);
		
		//user input
		System.out.println("Enter your numbers: ");
		int num11, num21, num31, num41, num5;
		
		num11 = rn.nextInt() ;
		num21 = rn.nextInt();
		num31 = rn.nextInt();
		num41 = rn.nextInt();
		num5 = rn.nextInt();
		
		//calling our squaredNumber method
		List<Integer> res = squaredNumber(num11, num21, num31, num41, num5);
		System.out.println(res); //it type 1, 2, 3, 4, 5 it print [1, 4, 9, 16, 25]
		
		
		
		//Testing our findIndexLetter method
		
		//user interaction
		Scanner sca = new Scanner(System.in);
		
		//user input
		System.out.println("Enter a character: ");
		char userLetter = sca.next().charAt(0);
		
		List<Character> alphabet = new ArrayList<>();
		for (int i = 97; i < (97+26); i++) {
		    alphabet.add((char) i);
		}
		
		//calling our findIndexLetter method
		findIndexLetter(alphabet, userLetter);
		
		
		
		//Testing our listOfFactors method
		
		//user interaction
		Scanner c = new Scanner(System.in);
		
		//user input
		System.out.println("Enter a number: ");
		int userNumber = c.nextInt();
		
		//calling our method
		listOfFactors(userNumber);
		

	}

}
