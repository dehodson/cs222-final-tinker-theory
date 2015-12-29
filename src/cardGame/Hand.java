package cardGame;

import java.util.ArrayList;

//represents a player's hand of cards that they may currently play.
public class Hand {
	private ArrayList<Card> Hand;
	
	public Hand(){
		Hand = new ArrayList<Card>();
	}
	
	//adds a card to the hand.
	void addCard(Card card){
		Hand.add(card);
	}
	
	//removes a card from hand and returns it.
	Card getCard(int n){
		if(this.size() > n - 1){
			return Hand.remove(n - 1);
		} else {
			return null;
		}
	}
	
	//looks at the cards in hand.
	Card lookAt(int n){
		if(this.size() > n){
			return Hand.get(n);
		} else {
			return null;
		}
	}
	
	int size(){
		return Hand.size();
	}
}
