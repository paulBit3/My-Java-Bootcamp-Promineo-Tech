package week5_Lab;


// 1. Card Class:
//		Create a class called Card to represent a standard playing card. 
//		Fields:   The Card class should have the following fields:
// 			a. name field
//			b. suit field
//			c. value field for comparing against other cards.
//
//		Methods:  This class can have any useful method.
//			a. describe() to display the card information to the Console.
//			b. Getters & Setters 

public class Card {
	
	private String name;
	private String suit;
	private int value;
	
	
	
	
	
	
	//public methods
	
	
	public Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
	
	
	//holding Card info
	public void describe() {
		System.out.println( "Card: " + name
				+"\nSuit: " + suit
				+"\n--- " + value
		        + " \n");
	}
	
//	public void describe() {
//		System.out.println( this.name
//				+"\nof: " + this.suit
//				+"\n---: " + this.value);
//	}
	
	
	
	
	
	
	/*
	 * getters and setters
	 */
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getSuit() {
		return suit;
	}
	
	
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	
	public int getValue() {
		return value;
	}
	
	
	public void setValue(int value) {
		this.value = value;
	}

}
