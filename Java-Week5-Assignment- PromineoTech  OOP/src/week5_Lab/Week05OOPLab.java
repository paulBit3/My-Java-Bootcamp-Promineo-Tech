package week5_Lab;

import java.util.*;

public class Week05OOPLab {

	public static void main(String[] args) {

		
		// A standard deck of playing cards has 52 cards as specified below 
		//		i. There are 4 suits:  Clubs, Diamonds, Hearts, & Spades
		//				
		//	   ii. Each suit has 13 cards:  Two, Three, Four, Five, Six, Seven, 
		//									 Eight, Nine, Ten, Jack, Queen, King & Ace
		//
		//	  iii. Comparing Cards:  When comparing two cards, Ace is high and Two is low.
		//							 to make this easy, a Two will have a value of 2, a
		//							 Three will have a value of 3, ... and an Ace will have
		//							 a value of 14.
		//
	
		
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
		//
		System.out.println("\nQuestion 1: Card Class");
		
		// Add your code here to instantiate a Card
		Card card = new Card("Queen", "Clubs", 12);
		
		// Call the describe method on the newly instantiated card.
		card.describe();
		
		
		

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
		//
		System.out.println("\nQuestion 2: Deck Class");
		
	    // Add your code here to instantiate a Deck	
		Deck deck = new Deck();
	    
	    
	    // Call the describe method on the newly instantiated deck.
		
		
		//card info
	    deck.describe();
	    
	    
	    
		
		
		// 3. Deck shuffle() Method:
		//		Add a shuffle method within the Deck Class
		System.out.println("\nQuestion 3: Deck shuffle() method");
		// Test your method here
		
		deck.shuffle();
		
		
		
		// Call the describe method on the newly shuffled deck.
		//deck.describe();

		
		
		
		// 4. Deck draw() Method:
		//		Add a draw method within the Deck Class
		System.out.println("\nQuestion 4: Deck draw() method");
		
		// Test your method here
		 Card c = deck.draw();
		 
		//get card info
		c.describe();
		
		
		
		
		
		
		// 5. Create Game Board:
		//		Create and test a method that takes an int as a parameter (representing the
		// 			number of players for a game) and returns a Map<String, List<Card>>
		// 			that represents each player (i.e. "Player 1", "Player 2", etc..) 
		//			and their cards.
		//
		// 			The method should create a new instance of Deck, shuffle it,
		// 			and deal the cards out to the "players" in the Map.
		System.out.println("\nQuestion 5: Create Game");
		
		// Call your method here
		Map<String, List<Card>> dashboard = new HashMap<>();
		
		int numberOfPlayers = 5;
		dashboard = gameBoard(numberOfPlayers);
		
		System.out.println("- - - - - - - - - - - - -");
		
		for(int i = 1; i <= numberOfPlayers; i++) {
			String Name = "Player " + i;
			
			System.out.println(Name + " \n-------");
			
			List<Card> playerList = dashboard.get(Name);
			
			for(Card handCard : playerList) {
				handCard.describe();
			}
		}
		
		System.out.println("- - - - - - - - - - - - -");

		
		
		
		
		
		
		
	} 
	
	// Method 5:
	public static Map<String, List<Card>> gameBoard (int numberOfPlayers){
		//a player name
		String Name = "";
		
		//number of card in deck divide by number of players
		int div = 52 / numberOfPlayers;
		
		//a game bard instance
		Map<String, List<Card>> dashBoard = new HashMap<>();
		
		//a player List
		List<Card> playerList = new ArrayList<Card>();
		
		//create a new instance of Deck
		Deck deck = new Deck();
		
		//shuffle it
		deck.shuffle();
		
		//deck size
		int deckLength = deck.getCards().size();
		
		//priting
		System.out.println("Deck has " + deckLength + " cards! ");
		
		//creating an entry in the map that represents each player
		for(int i = 1; i <= numberOfPlayers; i++) {
			Name = "Player " + i;
			dashBoard.put(Name, playerList);
		}
		
		//dealing with the deck
		for(int i = 0; i < div; i++) {
			//loop in the number of players
			for(int j = 1; j <= numberOfPlayers; j++) {
				//player name for the number of players
				Name = "Player " + j;
				playerList = dashBoard.get(Name);
				
				//adding a card from the deck
				playerList.add(deck.draw());
				
				//and replace it
				dashBoard.replace(Name, playerList);
			}
		}
		
		//Check if no card left over
		int cardLeft = 52 % numberOfPlayers;
		
		//if remainder is not 0
		if(cardLeft != 0) {
			System.out.print("With " + numberOfPlayers + " players -- ");
			System.out.println("Card left over is " + cardLeft);
		} else {
			//all card was played
			System.out.println("All card has been played! ");
		}
		
		return dashBoard;
	}
	


}
