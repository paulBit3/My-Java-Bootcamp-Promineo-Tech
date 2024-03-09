package week4_projects.projects1;

import java.io.*;
import java.util.*;

public class ListProjects1 {
	/*
	 * Create a List of Integer
	 * 
	 * Create a List of Integer called listNums
	 * A for loop is used to populate the List with elements, 
	 * from one to whatever value is stored in the variable input endNum. 
	 * Print the List to the console.
	 */
	
	//method
	static void createList(int endNum) {
		//creating a list variable
		List<Integer> myList = new ArrayList<Integer>();
		
		//looping
		for(int i = 0; i <= endNum; i++) {
			myList.add(i);
		}
		//printing
		System.out.println(myList);
	}
	
	/*
	 * Create a new List of String
	 * 
	 * Given a List called tenWords that contains ten different words, 
	 * write code that will find the values stored in 3 particular positions 
	 * in the List tenWords and creates a new List with those words.
	 * 
	 * Create a new List of String called threeWords
       Given num1, num2, and num3 as indexes, retrieve three words stored in
       tenWords
       Populate the List threeWords with the three elements retrieved from tenWords
       After adding the three words to your new List, print out the 
       List stored in threeWords to the console
       *
       **
       *Error Checking:

		Check that each number entered for num1, num2, and num3 
		is a number from 0 to 9
		Otherwise, print "Sorry, there was an error getting a number you requested."
	 */
	
	//we will create a method
	static void myWord(List<String> tenWord, int num1, int num2, int num3) {
		int count = tenWord.size();
		
		//Check that each number entered for 
		//num1, num2, and num3 is a number from 0 to 9
		if((num1 >= 0 && num1 < count) && (num2 >= 0 && num2 < count) && (num3 >= 0 && num3 < count)) {
			//retrieve three words stored in tenWords base on indexes
			//num1, num2, num3
			String firstElement = tenWord.get(num1);
			String secondElement = tenWord.get(num2);
			String thirdElement = tenWord.get(num3);
			
			//Create a new List of String called threeWords
			List<String> threeWords = new ArrayList<String>();
			
			//Populate the List threeWords with the three elements retrieved from tenWords
			threeWords.add(firstElement);
			threeWords.add(secondElement);
			threeWords.add(thirdElement);
			
			//printing the list
			System.out.println(threeWords);
		} else {
			System.out.println("Sorry, there was an error getting a number you requested.");
		}
		
	}
	
	
	
	/*
	 * Create a New List of Integer
	 * 
	 * Given four int numbers stored in the variables num1, num2, num3, and num4
	 * Create a List of Integer, give it a name
       Store all of the values of the variables in the List as its elements
       Add an element to the end of the List that stores the sum of all the values
       Print the List to the console
	 */
	
	//we will create a method to do so
	static void newSumList(int num1, int num2, int num3, int num4) {
		
		//a variable to hold sum of all values
		int sum = 0;
		
		//Create a List of Integer, give it a name
		List<Integer> myList = new ArrayList<Integer>();
		
		//store all the of the variables in the List
		myList.add(num1);
		myList.add(num2);
		myList.add(num3);
		myList.add(num4);
		
		//sum up the numbers
		sum = num1 + num2 + num3 + num4;
		
		//adding sum to the list
		myList.add(sum);
		
		//print the list
		System.out.println(myList);

	}
	
	
	
	/*
	 * Create a List of Integer
	 * 
	 * Given the value stored in the variable endNum, do the following:
	   Create a List of Integer called newList
       Add the numbers 1 to endNum to the List using a loop
       Then, print the first element from the List to the console using 
       "The first number in the List is " + method to get the first element
       Finally, print the last element of the List to the console using 
       "The last number in the List is " + method to get the last element
       The last element of the List should NOT be retrieved using 
       a hard-coded index like someList.get(10)

       Note: Before creating the List, check if endNum is greater 
       than zero and if it is, then proceed creating the List. 
       If endNum is not greater than zero, then simply print 
       "Your List cannot be created with a number less than one."
	 */
	
	//we'll create a method to do so
	static void startEnd (int endNum) {
		//initialized variable
		int first = 0;
		int last = 0;

		//looping
		//check if endNum is greater than zero
		if(endNum > 0) {
			
			//Create a List of Integer called newList
			List<Integer> newList = new ArrayList<Integer>();
			
			//add 1 and endNum to the list
			newList.add(1);
			newList.add(endNum);
			
			//System.out.println(newList.size());
			
			//printing 1st element
			first = newList.get(0);
			System.out.println("The first number in the List is " + first );
			
			//printing last element
			last = newList.get(newList.size() - 1);
			System.out.println("The last number in the List is " + last );
			
		}else {
			System.out.println("Your List cannot be created with a number less than one.");
		}
		
		//or we could do
//		if ( endNum > 0 ) {
//		    List<Integer> newList = new ArrayList<>();
//		    for ( int i = 1; i <= endNum; i++ ) {
//		        newList.add(i);
//		    }
//	        
//		    System.out.println("The first number in the List is " + newList.get(0));
//		    System.out.println("The last number in the List is " + newList.get(newList.size()-1));
//		    
//		} else {
//		    System.out.println("Your List cannot be created with a number less than one.");
//		}

	}
	
	
	
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
		
		//user interaction
		Scanner sc = new Scanner(System.in);
		
		//user input
		System.out.println("Enter a number: ");
		int endNum = sc.nextInt();
		
		//calling our createList method
		createList(endNum); //this will print [0, 1, 2, 3, 4, 5, 6, 7]
		
		//What name will print to the console
		List<String> str = new ArrayList<>();

		str.add("Nick");
		str.add("Joe");
		str.add("Michael");
		str.add("Tyler");
		str.add("Mike");

		System.out.println(str.get(3)); //this will print Tyler
		
		/*
		 * Access a List of String
		 * 
		 * Given a List stored in the variable productList, write code that will access 
		 * elements in the List based on the index value stored in indexVal.
		   First, check to make sure the number is at least zero, and that it is less 
		   than the size of the List
		   If indexVal is valid, print the product associated with the value stored at indexVal
		   If indexVal is not valid, then print "No product can be found with 
		   that product number." to the console
		 * 
		 */
		
		//User interaction
		Scanner in = new Scanner(System.in);
		
		//user input
		System.out.println("Enter a number: ");
		int indexVal = in.nextInt();
		
		//a list of products
		List<String> productList = new ArrayList<>();
		productList.add("Macboook");
		productList.add("HP Notebook");
		productList.add("iPhone 14");
		productList.add("Acer Aspire");
		productList.add("Windows Surface");
		productList.add("Galaxy S23");
		
		
		//check if indexVal = 0 and also less than the size of list size
		if (!(indexVal > 0 && indexVal >= productList.size())) {
			System.out.println(productList.get(indexVal));
		}
		else {
			
			System.out.println("No product can be found with that product number.");
		}
		
		//or
		if (indexVal >= 0 && indexVal < productList.size()) {
		    System.out.println(productList.get(indexVal));
		} else {
		    System.out.println("No product can be found with that product number.");
		}
		
		
		//testing our myWord method
		Scanner ss = new Scanner(System.in);
		
		//user input
		System.out.println("Enter a number: ");
		
		int number1 = ss.nextInt();
		int number2 = ss.nextInt();
		int number3 = ss.nextInt();
		
		List<String> tenWords = new ArrayList<String>();
		tenWords.add("Bumfuzzle");
		tenWords.add("Cattywampus");
		tenWords.add("Widdershins");
		tenWords.add("Gubbins");
		tenWords.add("Lollygag");
		tenWords.add("Malarkey");
		tenWords.add("Wabbit");
		tenWords.add("Impignorate");
		tenWords.add("Yarborough");
		tenWords.add("Bloviate");
		
		//calling our myWord method         //if type 3, 8, 6
		myWord(tenWords, number1, number2, number3); //this will print [Gubbins, Yarborough, Wabbit]
				
		
		//Testing newSumList method
		
		//User interaction
		Scanner sn = new Scanner(System.in);
		
		int num1, num2, num3, num4;
		
		//user input
		System.out.println("Enter numbers: ");
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		num4 = in.nextInt();
		
		//calling our newSumList method
		newSumList(num1, num2, num3, num4); //if typed 5, it prints [5, 5, 5, 5, 20]
		
		
		// Testing startEnd method
		
		//user interaction
		Scanner n = new Scanner(System.in);
		
		
		//user input
		System.out.println("Enter number: ");
		int Num = n.nextInt();
		
		//calling our startEnd method
		startEnd(Num);
		
		
		
	}

}
