package cardGame;

import java.util.ArrayList;
import java.util.Collections;


//this class holds an array of cards for a player called a "Deck"
public class Deck {
	
	private ArrayList<Card> Deck;

	public Deck() {
		Deck = new ArrayList<Card>();
		ConstructDeck();
	}

	//builds a randomly generated deck for the player.
	public void ConstructDeck() {
		for (int i = 0; i < Library.librarySize(); i++) {
			Deck.add(Library.getCardById(i));
		}

		this.shuffle();
	}

	public Card get(int index) {
		return Deck.get(index);
	}

	public int size() {
		return Deck.size();
	}

	public void shuffle() {
		Collections.shuffle(Deck);
	}
	
	//removes the top card of the deck and returns it.
	public Card draw(){
		if(this.size() > 0){
			return Deck.remove(0);
		} else {
			return null;
		}
	}
}
