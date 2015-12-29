package cardGame.Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import cardGame.Card;
import cardGame.Library;

public class TestCardGetValues {

	@Test
	public void test() {
		Library.initialize();
		Card testCard = Library.getCardById(0);
		assertEquals(5, testCard.getAttack());
		assertEquals(2, testCard.getDefense());
	}

}




