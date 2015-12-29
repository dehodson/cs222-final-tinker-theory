package cardGame.Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import cardGame.Deck;
import cardGame.Library;

public class TestDeckSize {

	@Test
	public void testConstructDeck() {
		Library.initialize();
		Deck testDeck = new Deck();
		assertEquals(20, testDeck.size());
	}

}
