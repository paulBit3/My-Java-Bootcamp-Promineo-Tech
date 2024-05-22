package week4_Lab;

import java.io.*;
import java.util.*;


public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {
		
		// 1. Why would we use a StringBuilder instead of a String?
		/*
		 * **Sring are immutable. They can not be changed or modified.
		 * **StringBuilder is mutable. We can add and remove character.
		 */
		
		// 		a. Instantiate a new StringBuilder
		StringBuilder mySB = new StringBuilder();
		
		//b. Append the characters 0 through 9 to it separated by dashes
		//Note:  make sure no dash appears at the end of the StringBuilder
		
		//to do so we can create a loop
		for(int i = 0 ; i < 10; i++) {
			//make sure no dash appears at the end of the StringBuilder
			if(i != 9) {
				mySB.append(i + "-");
				mySB.append(" ");
			} else {
				mySB.append(i);
			}
			
		}
		//printing
		System.out.println(mySB.toString()); //will print 0- 1- 2- 3- 4- 5- 6- 7- 8- 9

		// 2. List of String:
		//a. Create a list of Strings 
		List<String> myList = new ArrayList<String>();
		
		//b. Add 5 Strings to it, each with a different length
		myList.add("Paul");
		myList.add("Makella");
		myList.add("Appoline");
		myList.add("Washington");
		myList.add("StringBuilder");
		
		//or we can do
		//List<String> myList = Arrays.asList("Paul", "Makella", "Appoline", "Washington", "StringBuilder");

				
		// 3. Testing our method
		System.out.println(displayMyList(myList)); //will print Paul

				
		// 4. Testing our method
		System.out.println(switchedFirstAndLast(myList)); //will print [StringBuilder, Makella, Appoline, Washington, Paul]
		//4 Or we can do
		List<String> swap = switchedFirstAndLast(myList);
		for(String string : swap) {
			System.out.println(myList);
		}
				
		// 5. Testing our method
		System.out.println(concatenateString(myList));

				
		// 6. Testing our method
		System.out.println(search(myList, "o")); // will print [Appoline, Washington]
		
		//we can also do
		List<String> mySearch = search(myList, "o");
		for(String str: mySearch) {
			System.out.println(str);
		} // will print Appoline
		  //            Washington
		
		
		//7. Testing our method
		List<Integer> myInt = new ArrayList<>();
		myInt.add(90);
		myInt.add(4);
		myInt.add(25);
		myInt.add(11);
		myInt.add(23);
		myInt.add(33);
		myInt.add(47);
		myInt.add(20);
		myInt.add(2);
		List<List<Integer>> myLists = divisibleInt(myInt);
		System.out.println();
		//looping
		for(List<Integer> list : myLists) {
			for(Integer num : list) {
				System.out.println(num);
			}
			System.out.println("Next - - -  -");
		} // will print
		 /*
		  * 90
			4
			20
			2
			Next - - -  -
			33
			Next - - -  -
			25
			Next - - -  -
			11
			23
			47
			Next - - -  -
		  */
		
		//8. Testing our method
		List<String> MyList = new ArrayList<>();
		MyList.add("Paul");
		MyList.add("Marianne");
		MyList.add("Washington");
		MyList.add("Texas");
		MyList.add("New York");

		//List<String> MyString = stringToInteger(MyList);
		System.out.println(stringToInteger(MyList)); //will print [4, 8, 10, 5, 8]


				
		// 9. Create a set of strings and add 5 values
		Set<String> stringSet = new HashSet<String>();
		
		//adding 5 values to our set
		stringSet.add("Shwasniger");
		stringSet.add("Arnold");
		stringSet.add("Amazon");
		stringSet.add("Microsoft");
		stringSet.add("Apple");

		
		//10. testing our method
		Set<String> result = StringCharacter(stringSet, 'A');
		System.out.println(result); //will print [Apple, Amazon, Arnold]
		


				
		// 11. Testing our method
		Set<String> myTest = sameString(stringSet);
		System.out.println(myTest); //this print Apple, Shwasniger, Microsoft, Amazon, Arnold]
		
		//or the other way
		List<String> myTest2 = convertSetToList(stringSet);
		System.out.println(myTest2); //this will print [Apple, Shwasniger, Microsoft, Amazon, Arnold]
		
				

		// 12. Test our method 
		Set<Integer> number = new HashSet<Integer>();
		//adding number
		number.add(12);
		number.add(2);
		number.add(13);
		number.add(25);
		number.add(33);
		number.add(20);
		number.add(40);
		number.add(80);
		number.add(10);
		
		Set<Integer> numbers = evenNumbers(number);
		System.out.println(numbers);


				
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 		is a word and the value is the definition of the word
		Map<String, String> hm = new HashMap<String, String>();
		
		//adding values
		hm.put("iPhone", "Apple");
		hm.put("Windows", "Microsoft");
		hm.put("AWS", "Amazon");
		hm.put("Terminator", "Arnold Swasniger");

			
				
		// 14. Testing our method 
		 String myWord = lookupDictionary(hm, "iPhone");
		 System.out.println(myWord);
		 
				
		// 15. Testing our method
		Map<Character, Integer> mp = listToMapLetterCount(myTest2);
		System.out.println(mp); //this will print {A=3, S=1, M=1}
		
		
		
		
		 System.out.println("original List has " + myList.size() + " " + halfTheList(myList)) ;
		    

		}
	
	   
	
	
	
	
	/*
	 * M E T H O D S *//*
	 */
			
			
		// Method 15: Write a method that takes a List<String> 
		// and returns a Map<Character, Integer> containing a count of 
		//	all the strings that start with a given character
		public static Map<Character, Integer> listToMapLetterCount(List<String> myList){
			//an object of hash map
			Map<Character, Integer> mp = new HashMap<Character, Integer>();
			for(String str : myList) {
				//a given character
				char myChar = str.charAt(0); 
				//check if Map is empty
				if(mp.get(myChar) == null) {
					//add value to it
					mp.put(myChar, 1);
				} else {
					//add the value character
					mp.put(myChar, mp.get(myChar) + 1);
				}
			}
			return mp;
		}
			
			
		// Method 14: Write a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
		public static String lookupDictionary(Map<String, String> map, String word){
			//creating a map object
			Map<String, String> mp = new HashMap<String, String>();
			//traversing a map
			//Converting to Set so that we can traverse the map
			//Set set = map.keySet();
			//looping
			for(String key : map.keySet()) {
				//if key match word
				if(key.equals(word)) {
					//add word with its key
					//mp.put(key, word);
					
					//returning or get word and its key
					return map.get(key);
				}
			}
			return "";
		}
	


			
		// Method 12: Write a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
		public static Set<Integer> evenNumbers(Set<Integer> num){
			//a set object to hold integer number
			Set<Integer> number = new HashSet<Integer>();
			for(int i : num) {
				//check if number is divisible by 2
				if(i % 2 == 0) {
					//add the number
					number.add(i);
				}
			}
			return number;
		}
		
	
				
		// Method 11: Write a method that takes a set of strings 
		//			and returns a list of the same strings
		public static Set<String> sameString(Set<String> word){
			
			//creating a set object to add string value
			Set<String> hs = new HashSet<String>();
			
			//looping
			for(String str : word) {
				hs.add(str);
			}
			return hs;
		}
		
		
		
		//or this method also works as well
		public static List<String> convertSetToList(Set<String> word){
			
			//creating a set object to add string value
			List<String> hs = new ArrayList<String>();
			
			//looping
			for(String str : word) {
				hs.add(str);
			}
			return hs;
		}
			


		// Method 10:  Write a method that takes a set of strings and a character 
				//	and returns a set of strings consisting of all the strings in the
				// 	input set that start with the character parameter.
		public static Set<String> StringCharacter(Set<String> word, char myChar){
	
			//creating a set object
			Set<String> hs = new HashSet<String>();
			
			//looping
			for(String value : word) {
				if(value.charAt(0) == myChar) {
					hs.add(value);
				}
			}
			return hs;
		}
				
	
				
		// Method 8: Write a method that takes a list of strings 
		//and returns a list of integers that contains the length of each string
		public static List<Integer> stringToInteger(List<String> WordList){
			//a array list of Integer
			List<Integer> myIntLength = new ArrayList<>();
			
			//looping through word list and add length
			for(String word: WordList) {
				myIntLength.add(word.length());
			}
			return myIntLength;
		}
	
	
				
	
				
		// Method 7: Write a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		public static List<List<Integer>> divisibleInt(List<Integer> myList){
			
			//creating a List<List<Integer>> variable
			List<List<Integer>> listInt = new ArrayList<List<Integer>>();
			//creating 4 instance of integer 
			listInt.add(new ArrayList<Integer>() );
			listInt.add(new ArrayList<Integer>() );
			listInt.add(new ArrayList<Integer>() );
			listInt.add(new ArrayList<Integer>() );
	
			
			for(Integer number1 : myList) {
				//System.out.println("\n\nDivisible by 2: ");
				if (number1 % 2 == 0) {
					//word += 
					
					
					listInt.get(0).add(number1);
					//System.out.println(listInt);
				}
				else if(number1 % 3 == 0) {
					//System.out.println("\n\nDivisible by 3: ");
					
					
					listInt.get(1).add(number1);
					//System.out.println(listInt);
				}
				else if (number1 % 5 == 0) {
					//System.out.println("\n\nDivisible by 5: ");
					
					
					listInt.get(2).add(number1);
					//System.out.println(listInt);
				}
				else {
					//System.out.println("\n\nNot Divisible by 2, 3 or 3: ");
					listInt.get(3).add(number1);
					//System.out.println(listInt);
				}
				
			}
			return listInt;
		}
	
				
	
		// Method 6. Write a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		public static List<String> search(List<String> myList, String query){
			//creating a new list of string
			List<String> newList = new ArrayList<String>();
			
			//looping to see if myList contains query
			for(String str : myList) {
				if(str.contains(query)) {
					newList.add(str);
				}
			}
			return newList;
		}
	
		
		// Method 5. Write a method that takes a list of strings 
		//	  and returns a string with all the list elements concatenated to each other,
		// 	  separated by a comma
		public static String concatenateString(List<String> myList){
			//we will use String Builder as it's about concatenate string
			
			String sep = "";
			
			//string builder variable
			StringBuilder str = new StringBuilder();
			
			//looping over each element
			for(String strings : myList) {
				//make sure no dash appears at the end of the StringBuilder
				str.append(strings + ", ");
			} //this will print Paul, Makella, Appoline, Washington, StringBuilder, 
			
			// If we want to make sure no comma appears at the end of the StringBuilder
			for(String strings : myList) {
				
				str.append(sep).append(strings);
				sep = ", ";
	
			} //this will print Paul, Makella, Appoline, Washington, StringBuilder
			return str.toString();
		}
				
				
		// Method 4. Write a method that takes a list of strings 
		//			and returns the list with the first and last element switched
		public static List<String> switchedFirstAndLast(List<String> myList) {
			
			//getting the first element and hold in temp variable
			String temp = myList.get(0);
			
			//override the first element with the last element
			myList.set(0, myList.get(myList.size() -1));
			
			//swapping last element and temp variable
			myList.set(myList.size()-1, temp);
			
			return myList;
		}
		
	
				
				
				
		//Method 3. Write a method that takes a list of strings 
		//and returns the shortest string
		public static String displayMyList(List<String> myList) {
			
			//starting at index 0
			String shortest = myList.get(0);
			
			//looping
			for(String str: myList) {
				
				//check if str length is less than shortest
				if(str.length() < shortest.length()) {
					
					//then str might be equal to shortest
					shortest = str;
				}
			}
			//return value
			return shortest;
		}
		
		
		/*
		 * method that takes a List of String and returns a new List of String 
		 * containing every other element in the original List.
		 *  The  returned List should be half the size of the original List. 
		 *  If the original List has an odd number of elements, the returned 
		 *  List should have half the amount of elements rounded 
		 *  down (i.e. original List has 5, returned List has 2).
		 */
		
		public static List<String> halfTheList(List<String> listOfNames){
			
			//creating a set object
			List<String> resultList = new ArrayList<>();
			
			//looping
			for(int i = 0; i < listOfNames.size(); i++) {
				if(!(i % 2 == 0)) {
					resultList.add(listOfNames.get(i));
				}
			}
			return resultList;
		}
		
		
		
		/*
		 * 
		 * This method will take a parameter of type Map < String, String>, 
		 * and will return a List of String that contains every value 
		 * of the map where the key starts with 'A'  or 'a'.
		 */
		
		
		private static List< String > returnValuesForKeysStartingWithA( Map < String, String > dictionary) {

			List< String > resultList = new ArrayList<>();

			Set< String > keySet = dictionary.keySet() ;

			for ( String key : keySet ) {

			if ( key.toLowerCase().charAt(0) == 'a' ) {
				resultList.add(dictionary.get( key ));

			}

			}

			return resultList;

			}

}
