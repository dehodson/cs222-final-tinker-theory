package cardGame;

import java.util.ArrayList;

public class Library {
	
	private static ArrayList<Card> Library = new ArrayList<Card>();   //creates an ArrayList for card objects

	public static void initialize() {   //defines the list of cards
		
		Library.add(new Card("Werewolf", 5, 2));
		Library.add(new Card("Kraken", 7, 7));
		Library.add(new Card("Vampire", 2, 5));
		Library.add(new Card("Mantis Mongoloid", 7, 1));
		Library.add(new Card("Mummy", 3, 3));
		Library.add(new Card("Sphinx", 5, 4));
		Library.add(new Card("Mummy Mom", 3, 9));
		Library.add(new Card("Cashmere Sweater", 2, 7));
		Library.add(new Card("Angry Dad", 8, 2));
		Library.add(new Card("Karate Carrot", 6, 6));
		Library.add(new Card("Dying Battery", 2, 2));
		Library.add(new Card("Zombie Sensei", 9, 0));
		Library.add(new Card("Pollution Person", 6, 3));
		Library.add(new Card("Master of Secrets", 1, 9));
		Library.add(new Card("Bottlecap Bastard", 10, 4));
		Library.add(new Card("Corn: the Guy", 1, 1));
		Library.add(new Card("Trashmaster", 1, 5));
		Library.add(new Card("Dingle, the Stubborn", 2, 2));
		Library.add(new Card("Unexpected Token", 6, 8));
		Library.add(new Card("Shit Stance", 0, 10));

	}

	public static Card getCardById(int id) {
		return Library.get(id);
	}
	
	//finds the card object in the array and returns its id
	public static int getIdOfCard(Card card){
		return Library.indexOf(card);
	}

	public static int librarySize() {
		return Library.size();

	}

}
