package cardGame.Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import cardGame.Deck;
import cardGame.Library;

public class TestDeckShuffle {

	@Test
	public void test() {
		
		
		Library.initialize();
		Deck testDeck = new Deck();
		
		
		assertFalse(Library.getCardById(0).getName().equals(testDeck.get(0)));
	}

}
