package videoCurriculum;

import java.io.*;
import java.util.*;

public class OOP {
	/*
	 * Object Oriented Programming (OOP)
	 * 
	 * 
	 * DVD Player
	 * Properties:
	 * 	 - Height
	 * 	 - Weight
	 * 	 - Width
	 * 	 - Color
	 * Functionality:
	 * 	 - Play
	 * 	 - Fast Forward
	 * 	 - Rewind
	 * 	 - Pause
	 * 
	 * DVD
	 * Properties:
	 * 	 - Movie length
	 * 	 - Image
	 * 	 - Size
	 * Functionality
	 * 	 - Store
	 * 
	 * Four Pillars of OOP:
	 * 1. Abstraction
	 *   Ex: Triangle , Table
	 *   
	 * 2. Encapsulation
	 *  Ex: Driving a Car
	 *  
	 * 3. Inheritance
	 *  Allows objects or classes to inherit from classes
	 *  
	 * 4. Polymorphism
	 *  Animals communicate in different ways
	 *  The "method" communicate can take different forms.
	 *  
	 *  
	 *  Class - is how we structure our code in OOP
	 *  Class is like blueprint
	 *  Object is the actual product developed from the blueprint
	 *  An Object is an Instance of a Class
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		//calling our animal class via the constructor to create animal Object
		Animal animal = new Animal();
		
		animal.name = "Elephanto";
		animal.type = "Elephant";
		animal.weight = 8000;
		animal.height = 108;
		animal.location = "Texas Zoo";
		
		//calling the describe method
		animal.describe();
		
		//accessing to fields
		
		System.out.println("\nAccess to individual fiels");
		System.out.println("- - --  - - -- - - --");
		System.out.println("Our animal named: " + animal.getName());
		
		
		//creating an Object with the Default Constructor
		//and use the Setters to store information
		System.out.println("\n\n\n");
		
		Animal kangaroo = new Animal();
		
		kangaroo.setName("Jacky");
		kangaroo.setType("Kangaroo");
		kangaroo.setWeight(160);
		kangaroo.setHeight(45);
		kangaroo.setLocation("Tennessee Zoo");
		
		//hold the info in description method
		kangaroo.describe();
		
		/*
		 * Animal Description: 
			-----------
				Name: Jacky
				Type: Kangaroo
				Weight: 160.0 lb.
				Height: 45.0 in.
				Location: Tennessee Zoo
		 */
		
		
		/*
		 * Encapsulation
		 *
		 */
		
		//calling our rectangle class here
		Rectangle rect = new Rectangle(12.0, 18.0);
		
		//we can set the width to an other number
		rect.setLength(8.0); //that will print 96.0 instead of 216.0
		
		//printing the rectangle area
		System.out.println(rect.getArea()); //will print 216.0
		
		
		/*
		 * Inheritance - Abstraction - Polymorphism
		 * 
		 */
		
		//creating salary and hourly  instance
		
		Employee salary = new Salary("Jack", 2100.59, 0); 
		Employee hourlyRate = new Hourly("Jack", 2100.59, 80, 15, 0 );
		Employee manager = new Manager("David", 3000, 200, 0);
		
		//printing 
		System.out.println(salary.calculatePay()); //for non bonus, this will print 168047.2
		System.out.println(hourlyRate.calculatePay());  //for non bonus, this will print 168047.0
		
		System.out.println(manager.calculatePay()); //for bonus + allowance, this will print 240212.0
		
	}

}
