package cardGame.Testing;

import cardGame.Library;


public class TestCombatValues {


	public boolean wins() {
		Library.initialize();
		
		if (Library.getCardById(5).getAttack() > Library.getCardById(5)
				.getDefense()) {
			return true;
		} else
			return false;
	}

	public boolean ties(){
		if (Library.getCardById(0).getAttack() == Library.getCardById(2)
				.getDefense()) {
			return true;
		} else
			return false;
	}

	}
