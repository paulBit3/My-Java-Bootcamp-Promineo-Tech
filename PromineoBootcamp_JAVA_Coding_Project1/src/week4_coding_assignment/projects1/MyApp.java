package week4_coding_assignment.projects1;

import java.io.*;
import java.util.*;
import java.math.*;

public class MyApp {
	
	/*
	 * Coding Steps 
	 * 
	 * 1. Create an array of int called ages that contains the
	 * following values: 3, 9, 23, 64, 2, 8, 28, 93.
	 * 
	 * a. Programmatically subtract the value of the first element in the array from
	 * the value in the last element of the array (i.e. do not use ages[7] in your
	 * code). Print the result to the console.
	 * 
	 * b. Create a new array of int called ages2 with 9 elements (ages2 will be
	 * longer than the ages array, and have more elements).
	 * 
	 * i. Make sure that there are 9 elements of type int in this new array.
	 * 
	 * ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the
	 * value of the first element in the new array ages2 from the last element of
	 * ages2).
	 * 
	 * iii. Show that using the index values for the elements is dynamic (works for
	 * arrays of different lengths).
	 * 
	 * c. Use a loop to iterate through the array and calculate the average age.
	 * Print the result to the console.
	 * 
	 * \/---------------------------------\/
	 * 
	 * 2. Create an array of String called names that contains the following values:
	 * “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
	 * 
	 * a. Use a loop to iterate through the array and calculate the average number
	 * of letters per name. Print the result to the console.
	 * 
	 * b. Use a loop to iterate through the array again and concatenate all the
	 * names together, separated by spaces, and print the result to the console.
	 * 
	 * \/---------------------------------\/
	 * 
	 * 3. How do you access the last element of any array?
	 * 
	 * \/---------------------------------\/
	 * 
	 * 4. How do you access the first element of any array?
	 * 
	 * \/---------------------------------\/
	 * 
	 * 5. Create a new array of int called nameLengths. Write a loop to iterate over
	 * the previously created names array and add the length of each name to the
	 * nameLengths array.
	 * 
	 * \/---------------------------------\/
	 * 
	 * 6. Write a loop to iterate over the nameLengths array and calculate the sum
	 * of all the elements in the array. Print the result to the console.
	 * 
	 * \/---------------------------------\/
	 * 
	 * 7. Write a method that takes a String, word, and an int, n, as arguments and
	 * returns the word concatenated to itself n number of times. (i.e. if I pass in
	 * “Hello” and 3, I expect the method to return “HelloHelloHello”).
	 * 
	 * \/---------------------------------\/
	 * 
	 * 8. Write a method that takes two Strings, firstName and lastName, and returns
	 * a full name (the full name should be the first and the last name as a String
	 * separated by a space).
	 * 
	 * \/---------------------------------\/
	 * 
	 * 9. Write a method that takes an array of int and returns true if the sum of
	 * all the ints in the array is greater than 100.
	 * 
	 * \/---------------------------------\/
	 * 
	 * 10. Write a method that takes an array of double and returns the average of
	 * all the elements in the array.
	 * 
	 * \/---------------------------------\/
	 * 
	 * 11. Write a method that takes two arrays of double and returns true if the
	 * average of the elements in the first array is greater than the average of the
	 * elements in the second array.
	 * 
	 * \/---------------------------------\/
	 * 
	 * 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and
	 * a double moneyInPocket, and returns true if it is hot outside and if
	 * moneyInPocket is greater than 10.50.
	 * 
	 * \/---------------------------------\/
	 * 
	 * 13. Create a method of your own that solves a problem. In comments, write
	 * what the method does and why you created it.
	 */
	
	
	/* 
	 * ********************
	 * Step 1
	 * ********************
	 */
	
	static void averageAge() {
		
		//1.a - Create an array of int called ages and populate it
		//    with following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//subtract the value of the first element from
		// the value in the last element of the array
		
		//integer variable to hold values
		int val ;
		int val2 = 0;
		
		// array1 length
		int arr1Length = ages.length;
		
		//I loop the length of the array
		for(int i = 0; i < arr1Length; i++) {
			//1st element from last element
			val = (ages[arr1Length - arr1Length]) - ages[arr1Length - 1];
			
			//doing this will display a negative value
			//so we will use Math.abs function to turn the number positive.
			val2 = Math.abs(val);
			
			//how it works
			//ages[arr1Length - arr1Length] = ages[0] which is 3
			//ages[arr1Length - 1] = ages[7] which is 93
			//so we do 3 - 93 and use the abs function to keep value positive
		}
		//printing result
		System.out.println("Diff of first element from last element give: " + val2);
		
		//------------------------------------
		
		//1.b - Create a new array of int called ages2
		//   ages2 will be longer than the ages array
		//ages2 has 9 elements
		int[] ages2 = new int[arr1Length + 1];
		
		//------------------------------------

		
		//1.b.i Make sure that there are 9 elements of type int in this new array.
		
		//I will copy values from ages array to ages2 array
		
		//source position
		//int startPos = ages[arr1Length - arr1Length];
		
		//destination position
		//int destPos = 0;
		
		//length will be length of ages array
		int len = arr1Length;
		
		// array2 length
		int arr2Length = ages2.length;
		
		
		//copying element(I can also use a for loop)
		//System.arraycopy(ages, startPos, ages2, destPos, len);
	
		//looping to copy element from ages to ages2
		for(int i = 0; i < len; i++) {
			//copying element from ages array to ages2 array
			ages2[i] = ages[i];
			
			//adding element
			ages2[len] = ages[i] + 1;

		}
		
		//printing arrays ages and ages2
		//System.out.println("Old array: " + Arrays.toString(ages));
		//System.out.println("New array: " + Arrays.toString(ages2));
		
		//------------------------------------
		
		//1.b.ii - 	subtract first element in the new array ages2 from the last element
		
		int res = (ages[arr2Length - arr2Length]) - ages2[arr2Length - 1];
		
		//doing this will display a negative value
		//so we will use Math.abs function to turn the number positive.
		int val3 = Math.abs(res);
		
		//printing result
		System.out.println("Diff of first element from last element in Array2 give: " + val3);
		
		//------------------------------------
		
		//1.b.iii - Show that using the index values for 
		//   the elements is dynamic (works for arrays of different lengths).

		//ages2[arr2Length - arr2Length] = ages2[0] which is 3
		//ages2[arr2Length - 1] = ages2[8] which is 100

		
		//------------------------------------
		//1.c - calculate the average age using a for loop
		int sum = 0;
		double av = 0;
		for(int i : ages2) {
			sum += i;
		}
		//the average
		av = sum / arr2Length;
		
		//printing average value
		System.out.println("Average age: " + av);
	}
	
	/*
	 * \/---------------------------------\/
	 */
	
	/* 
	 * ********************
	 * Step 2
	 * ********************
	 */
	
	/*
	 * 2. Create an array of String called names that contains the following values:
	 * “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
	 * 
	 * a. Use a loop to iterate through the array and calculate the average number
	 * of letters per name. Print the result to the console.
	 * 
	 * b. Use a loop to iterate through the array again and concatenate all the
	 * names together, separated by spaces, and print the result to the console.
	 *  
	 */
	//I make it essier by creating a method that take those name and return
	//the average letter
	static void averageLetters(String[] names) {
		
		//double variable
		double av = 0;
		
		//integer variable to hold sum
		int sum = 0;
		
		//array names length
		int len = names.length;
		
		//2.a - calculate the average number
		for(String str : names) {
			sum += sum + str.length();
		}	
		//average
		av = sum / len;
		
		//printing average letter
		System.out.println("The average number of letters per name is: " + av);
		
		//2.b - concatenate all the names together
		
		//variable space
		String sp = " ";
		
		//concatenate variable
		String concat = " ";
		
		for(int i = 0 ; i < len; i++) {
			//concatenate names and add space
			concat += names[i] + sp;			
		}
		//printing average letter
		System.out.println("Concatenate name are: " +  concat);
		
	}
	
	
	/*
	 * \/---------------------------------\/
	 */
	
	/*
	* ********************
		* Step 5
	* ********************
	*/
	
	/*
	 * 5. Create a new array of int called nameLengths. Write a loop to iterate over
	 * the previously created names array and add the length of each name to the
	 * nameLengths array.
	 */
	
	//I will create a List of Integer method that take an array of names 
	//and return the length of each name
	static List<Integer> myNameLengths(String[] names) {
		
		//name length array
		//String[] nameLength = new String[6];
		
		//creating an array List
		List<Integer> nameLength = new ArrayList<Integer>();
		
		//looping into array names
		for(int i = 0; i < names.length; i++) {
			nameLength.add(names[i].length());
		}
		return nameLength;
	}
	
	
	
	/*
	 * \/---------------------------------\/
	 */
	
	/* 
	 * ********************
	 * Step 6
	 * ********************
	 */
	
	/*
	 * 6. Write a loop to iterate over the nameLengths array and calculate the sum
	 * of all the elements in the array. Print the result to the console.
	 */
	
	// I will create an array List of integer and return the sum of all element
	static int sumArray(List<Integer> nameLength) {
		//variable to calculate value
		int sum = 0;
		
		
		//enhance looping through nameLengths array
		for(int i : nameLength) {
			//sum by index
			sum += nameLength.get(i);
		}
		return sum;
	}
	
	
	
	
	/*
	 * \/---------------------------------\/
	 */
	
	 /*
	  **********************
	  * Step 7
	  * ********************
	  */
	
	/*
	 * 7. Write a method that takes a String, word, and an int, n, as arguments and
	 * returns the word concatenated to itself n number of times. (i.e. if I pass in
	 * “Hello” and 3, I expect the method to return “HelloHelloHello”).
	 */
	
	static String concateWord(String word, int n) {
		//string variable to hold result
		String res = "";
		
		//looping through the word n time
		for(int i = 0; i < n ; i++) {
			res += word;
		}
		return res;
	}
	
	
	/*
	 * \/---------------------------------\/
	 */
	
	/*
	  **********************
	  *Step 8
	  ***********************
	  */
	/*
	 * Write a method that takes two Strings, firstName and lastName, and returns
	 * a full name (the full name should be the first and the last name as a String
	 * separated by a space).
	 */
	
	static String fullName(String firstName, String lastName) {
		
		//returning fullName
		return "" + firstName + " " + lastName + "";
	}
	
	
	/*
	 * \/---------------------------------\/
	 */
	
	/*
	  **********************
	  *Step 9
	  ***********************
	  */
	
	/*
	 * 9. Write a method that takes an array of int and returns true if the sum of
	 * all the ints in the array is greater than 100.
	 */
	
	static boolean isGreater(int[] num) {
		
		//integer variable to hold sum
		int sum = 0;
		
		//enhance loop in the num array
		for(int i: num) {
			sum += i;
		}
		//checking if sum > 100
		if(sum > 100) {
			return true;
		}

		return false;
	}
	
	
	
	/*
	 * \/---------------------------------\/
	 */
	
	 /*
	  **********************
	  *Step 10
	  ***********************
	  */
	
	/*
	 * 10. Write a method that takes an array of double and returns the average of
	 * all the elements in the array.
	 */
	
	static double averageOfDouble(double[] x) {
		
		//double variable to hold sum result
		double sum = 0;
		double av = 0;
		
		//enhance loop
		for(double i : x) {
			sum += i;
		}
		
		//average
		av = sum / x.length;
		
		return av;
	}

	
	
	/*
	 * \/---------------------------------\/
	 */
	
	/*
	  **********************
	  *Step 11
	  ***********************
	  */
	
	/*
	 * 11. Write a method that takes two arrays of double and returns true if the
	 * average of the elements in the first array is greater than the average of the
	 * elements in the second array.
	 */
	
	static boolean isAvgFirstArrGreater(double[] arr1, double[] arr2) {

		
		//I will call the averageOfDouble method here
		
		//av of arr1 > av of arr2, return true
		System.out.println(averageOfDouble(arr2));
		
		return averageOfDouble(arr1) > averageOfDouble(arr2);
	}
	
	
	
	/*
	 * \/---------------------------------\/
	 */
	
	/*
	  **********************
	  *Step 12
	  ***********************
	  */
	
	/*
	 * 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and
	 * a double moneyInPocket, and returns true if it is hot outside and if
	 * moneyInPocket is greater than 10.50.
	 */
	
	static  boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside && moneyInPocket > 10.50) {
			return true;
		}
		return false;
	}
	
	
	/*
	 * \/---------------------------------\/
	 */
	
	/*
	  **********************
	  *Step 13
	  ***********************
	  */
	
	/*
	 * 13. Create a method of your own that solves a problem. In comments, write
	 * what the method does and why you created it.
	 */
	
	/*
	 * Here is the program my method will handle
	 * 
	 * Write a program that takes a list of shopping product and their price.
	 * Create a new list called shoppingList that add a new product and remove old product.
	 * Add product and the product price to shoppingList
	 * Print product in shoppingList
	 */
	
	
	public static  List<String> shoppingItem(List<String> itemName, LinkedList<Double> itemPrices2){
		
		// Create a new LinkedList to store our shopping list
		LinkedList<String> shoppingList = new LinkedList<>();
        
        //adding item
        for(int i = 0 ; i < itemName.size(); i++) {
        	for(double j : itemPrices2) {
        		//adding item price in shoppingList
        		
        		//this add item to shopping list
        		shoppingList.add(itemName.get(i++));
        		
        		//this add price to specific item from the beginning of the list
        		shoppingList.add(Double.toString(j++));
        	}
        }
        
		return shoppingList;
	}
	
	
	
	
	
	
	/*
	 * \/---------------------------------\/
	 */
	
	
	

	public static void main(String[] args) {
		// Testing
		
		/* 
		 * ********************
		 * Step 1
		 * ********************
		 */
		
		//calling our averageAge method
		averageAge();
		
		
		
		/* 
		 * ********************
		 * Step 2
		 * ********************
		 */
		
		 String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		 
		 //calling our averageLetters method and passing the name array
		 
		 averageLetters(names);
		
		 
		 
		/* 
		 * ********************
		 * Step 3
		 * ********************
		 * 
		 * 3. How do you access the last element of any array?
		 */
		 System.out.println("we access the last element of an array : array[array.length - 1]" );
		 
		 
		
		/* 
		 * ********************
		 * Step 4
		 * ********************
		 * 
		 * 4. How do you access the first element of any array?
		 */
		 System.out.println("we access the frist element of an array : array[0]" );
		 
		
		 
		 
		/* 
		 * ********************
		 * Step 5
		 * ********************
		 */
		//calling our myNameLengths method and passing the name array
		 List<Integer> nameLength = myNameLengths(names);
		 
		 //printing
		 System.out.println(nameLength);
		 //base on the array names, it will print [3, 5, 3, 5, 4, 3]
		 
		 
		 
		/* 
		 * ********************
		 * Step 6
		 * ********************
		 */
		 
		 //calling our sumArray method
		 int sumAll = sumArray(nameLength);
		 
		 //printing
		 System.out.println(sumAll);
		//base on the array names, it will print 25
		 
		 
		 
		 
		 /*
		  **********************
		  * Step 7
		  * ********************
		  */
		 
		 //User interaction
		 Scanner sc = new Scanner(System.in);
		 
		 //user input
		 System.out.println("Enter a word: ");
		 String word = sc.nextLine();
		 
		 System.out.println("Enter a number: ");
		 int num = sc.nextInt();
		 
		 //calling our concateWord method
		 String cancat = concateWord(word, num);
		 
		 //printing
		 System.out.println(cancat);
		 
		 //if n = 3, it prints HelloHelloHello
		 //if n = 4, it prints HelloHelloHelloHello
		 
		 
		 
		 
		 /*
		  **********************
		  *Step 8
		  ***********************
		  */
		 //string variables
		 String firstName = "Paul";
		 String lastName = "Brou";
		 
		//calling our fullName method
		 String fullName = fullName(firstName, lastName);
         
		 //printing
		 System.out.println(fullName);
		 
		 
		 
		 
		 /*
		  **********************
		  *Step 9
		  ***********************
		  */
		 
		 //integer array variable 
		 int[] arr = {0, 98, 56, 78};
		 
		 //boolean value
		 boolean isGreater = false;
		 
		 //calling our isGreater method
		 isGreater = isGreater(arr);
		 
		 //printing
		 System.out.println(isGreater);
		 
		 //if int[] arr = {0, 98}, sum = 98, it will print false;
		 //if int[] arr = {0, 98, 56, 78}, sum = 232, it will print true;
		 
		 
		 
		 
		 /*
		  **********************
		  *Step 10
		  ***********************
		  */
		 
		 double [] myDouble = {73.5, 13.67, 50.5, 20.00, 11.6};
		 
		 //calling our averageOfDouble method
		 double av = averageOfDouble(myDouble);
		 
		 //printing
		 System.out.println(av);
		 
		 
		 /*
		  **********************
		  *Step 11
		  ***********************
		  */
		 
		 double [] myDouble2 = {73.5, 13.67, 50.5, 20.00, 3};
		 
		 //calling our isAvgFirstArrGreater
		 boolean av2 = isAvgFirstArrGreater(myDouble, myDouble2);
		 
		 //printing
		 System.out.println(av2);
		 
		 //myDouble av = 33.854  and myDouble2 av2 = 32.134, so will return true
		 
	
		 
		 
		 
		 /*
		  **********************
		  *Step 12
		  ***********************
		  */
		 
		 Scanner in = new Scanner(System.in);
		 
		 //user input
		 System.out.println("Is it cold outside? ");
		 
		 boolean isHot = in.nextBoolean();
		 
		 System.out.println("How much money in pocket? ");
		 double moneyInPocket = in.nextDouble();
		 
		 //calling our willBuyDrink method
		 System.out.println(willBuyDrink(isHot, moneyInPocket));
		 
		 //it print false if money in pocket is 9.7
		 //it print true if money in pocket 11.50
		 
		 
		 /*
		  **********************
		  *Step 13
		  ***********************
		  */
		 
		 // Create a new LinkedList to store our shopping list
	     LinkedList<String> shoppingList = new LinkedList<>();

	     // Add some items to the list
	     shoppingList.add("Apples");
	     shoppingList.add("Bread");
	     shoppingList.add("Bananas");
	     shoppingList.add("Milk");
	     

	     //A LinkedList containing item Prices of the shopping list

	     LinkedList<Double> itemPrices = new LinkedList<>();
	     itemPrices.add(10.5);
	     itemPrices.add(5.8);
	     itemPrices.add(18.3);
	     itemPrices.add(34.2);
	   
	     System.out.println(shoppingItem(shoppingList, itemPrices));
	     //this will print the item and it price
	     //[Apples, 10.5, Bread, 5.8, Bananas, 18.3, Milk, 34.2]
	
		 
		 
		 
		 
		 
		 

	}

}
