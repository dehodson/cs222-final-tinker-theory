package cardGame.Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import cardGame.Player;

public class TestPlayerName {

	@Test
	public void test() {
		Player testPlayer = new Player("test");
		
		assertTrue(testPlayer.getName().equals("test"));
	}

}
