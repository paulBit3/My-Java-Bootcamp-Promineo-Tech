package week4_projects.projects1;

import java.io.*;
import java.util.*;

public class LinkedListProject {
	
	/*
	 * Shopping List
	 * 
	 * Given a list called list product, create a new list called shoppingList.
	 * Add product to shoppingList
	 * Print product in shoppingList
	 * 
	 */
	
	// we will create a method to do so
	

    public static void main(String[] args) {
    	
    	//a Shopping prodcut List
    	
    	// Create a new LinkedList to store our shopping list
        LinkedList<String> shoppingList = new LinkedList<>();

        // Add some items to the list
        shoppingList.add("Apples");
        shoppingList.add("Bread");
        shoppingList.add("Bananas");
        shoppingList.add("Milk");
        shoppingList.add("Cheese");
        shoppingList.add("Eggs");
        shoppingList.add("Ham");

        shoppingList.remove(2);

        // Print out the entire shopping list using an enhanced for loop
        System.out.println("Shopping List:");

        for (String item : shoppingList) {
        	System.out.println(item);
        }
        
        
        
        //a Waiting in Line
        LinkedList<String> line = new LinkedList<String>();
        line.add("Amanda");
        line.add("Brad");
        line.add("Cori");
        
        //printing the list
        System.out.println("People in line: " + line);
        System.out.println("First person in line was: " + line.get(0));
        System.out.println("The last person in line was: " + line.get(2));
        
      //removing first element
        line.remove(0);
        
        //adding new element at the end of the list
        line.add("Danny");
        
        
        //printing new list
        System.out.println("People in line now: " + line);
        System.out.println("Now the first person in line is: " + line.get(0));
        System.out.println("The last person in line is: " + line.get(2));
            
            
            
     }
}

