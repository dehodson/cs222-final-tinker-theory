package cardGame;

public class Player {
	Deck playerDeck;   //holds the player's cards
	String playerName; //string containing the player name
	Hand playerHand;   //cards currently in the player's hand

	int points;
	public Player(String name) {
		playerDeck = new Deck();
		playerName = name;
		playerHand = new Hand();

		points = 0;
	}

	public String getName() {   //returns the players name
		return playerName;
	}

	public Deck getDeck() {     //returns the deck the player has.
		return playerDeck;
	}
	
	public Hand getHand(){		//returns the hand that the player has
		return playerHand;
	}

	public int getPoints() {	// returns the points the player has
		return points;
	}

	public void scorePoint() {  //increases the player's score whenever they win a battle.
		points++;
	}
	
	public void drawCard(){     //takes a card from the player's deck and puts it in hand.
		Card drawnCard = playerDeck.draw();
		if(drawnCard != null){
			playerHand.addCard(drawnCard);
		}
	}
	
	public Card playCard(){     //prompts user to take a card from their hand and play it.
		return Library.getCardById(0);
	}
}
