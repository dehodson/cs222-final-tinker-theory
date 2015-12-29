package cardGame.Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import cardGame.Player;

public class TestPlayerScore {

	@Test
	public void test() {
		Player testPlayer = new Player("test");
		
		testPlayer.scorePoint();
		
		assertTrue(testPlayer.getPoints() == 1);
	}

}
