package cardGame;

import java.util.Random;

public class AIPlayer extends Player {

	AIPlayer(String name) {
		super(name);
	}
	
	@Override 
	public Card playCard(){ //allows the AI to select a card and play it.
		Random randomGenerator = new Random();
		
		//this AI is just a basic one that selects a card at random.
		//future iterations will hopefully include something more sophisticated.
		if(this.playerHand.size() > 1){			
			int randomInt = randomGenerator.nextInt(this.playerHand.size() - 1) + 1;
			return playerHand.getCard(randomInt);

		} else {
			return playerHand.getCard(1);
			
		}
	}
}
