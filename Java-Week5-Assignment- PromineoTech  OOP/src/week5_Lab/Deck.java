package week5_Lab;
import java.io.*;
import java.util.*;


// 2. Deck Class:
//		Create a class called Deck.
//		Fields:  This class should have a list of Card field called cards 
//				 that will hold all the cards in the deck. 
//			List<Card> cards = new ArrayList<Card>(); 
//
//		Constructor: The constructor for the Deck Class should
// 			instantiate all 52 standard playing cards and add them to the cards list.
//
//		Methods:  
//			a.  describe() to describe the deck to the Console -- 
//					print out all of the cards in the deck.

public class Deck {
	
	//fields
	
	private List<Card> cards =  new ArrayList<Card>();
	private String name;
	
	
	
	//constructor
	
	//The constructor for the Deck Class should
//		instantiate all 52 standard playing cards and add them to the cards list
	



	public Deck() {
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", 
							"Eight", "Nine", "Ten", "Jack", "Queen", "King" ,"Ace"};
		
		//instantiate a new card for each card we want to create
		for(String str : suits) {
			int count = 2;
			for(String n : numbers) {
				
				//creating a new card for each string in numbers
				Card card = new Card(n, str, count);
				
				//adding card
				addCard(card);
				
				count++;
				//this code creates our deck
			}
		}
	}
	
	

	
	
	/*
	 * getters and setters
	 * 
	 */
	
	
	public List<Card> getCards() {
		return cards;
	}


	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	

	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	
	
	//public methods
	
	//get deck name method
	public Deck(String name) {
		this.setName(name);
	}
	
	
	//get card info method
	public void describe() {
		//printing card name
		//System.out.println("Card Name: " + name);
		
		//printing cards
		for(Card c : this.cards) {
			c.describe();
		}
	}
	
	
	//add card to deck method
	public void addCard(Card c) {
		cards.add(c);
	}
	
	
	//Deck shuffle() method
	//This method runs in linear time
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	
	//Deck draw() method
	//this method will remove a card
	public Card draw() {
		Card c = cards.remove(0);
		return c;
		
	}

}
