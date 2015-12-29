package cardGame.Testing;


import junit.framework.TestCase;
import org.junit.Test;

public class TestCombat extends TestCase {

	@Test
	public void test1() throws Exception {
		TestCombatValues testObject = new TestCombatValues();
		assertTrue(testObject.wins());

	}
	public void test2() throws Exception {
		TestCombatValues testObject = new TestCombatValues();
		assertTrue(testObject.ties());
}
}
