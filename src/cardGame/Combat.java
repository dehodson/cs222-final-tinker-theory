package cardGame;

import java.util.Random;

public class Combat {
	
	private static int turnsTaken = 0;
	
	private static boolean playerIsAttacking = false;
	private static boolean playerAttacked = false;
	private static boolean gameOver;
	private static BattleOutcome playerVictory;
	
	private static Player player;
	private static Player opponent;
	
	private static Card playerCard;
	private static Card opponentCard;
	
	//set up the values for combat. This could be called to restart the game.
	static void initialize(){ 
		
		playerCard = null;
		opponentCard = null;
		
		player   = new Player("Player");
		opponent = new AIPlayer("Opponent");
		
		player.drawCard();
		player.drawCard();
		player.drawCard();
		
		opponent.drawCard();
		opponent.drawCard();
		opponent.drawCard();
		
		gameOver = false;
		
		//Randomly determine which player will attack first.
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(100);

		if (randomInt < 50) {
			playerIsAttacking = true;
		} else {
			playerIsAttacking = false;
		}
		
	}
	
	//find the outcome of the battle.
	static BattleOutcome fightAIWithCard(int n){
		
		turnsTaken++;
		BattleOutcome outcome;
		BattleOutcome playerSuccess;
		playerAttacked = playerIsAttacking;
		
		playerCard   = player.getHand().getCard(n);
		opponentCard = opponent.playCard();
		
		player.drawCard();
		opponent.drawCard();
		
		//determine the winner of the fight
		if(playerIsAttacking){
			outcome = playerCard.fights(opponentCard);
			
			if(outcome == BattleOutcome.win){
				player.scorePoint();
			} else {
				playerIsAttacking = false;
			}
			
			playerSuccess = outcome;
			
		} else {	
			outcome = opponentCard.fights(playerCard);
			
			if(outcome == BattleOutcome.win){
				opponent.scorePoint();				
				playerSuccess = BattleOutcome.lose;
				
			} else if (outcome == BattleOutcome.tie) {
				playerIsAttacking = true;
				playerSuccess = BattleOutcome.tie;
				
			} else {
				playerIsAttacking = true;
				playerSuccess = BattleOutcome.win;
			}
		}
		
		//determine a victor if the game is over.
		if(player.getPoints() >= 3){
			playerVictory = BattleOutcome.win;
			gameOver = true;
			
		}else if(opponent.getPoints() >= 3){
			playerVictory = BattleOutcome.lose;
			gameOver = true;
		}
		
		//if the players run out of cards, a victor can still be determined.
		if(player.getDeck().size() == 0){
			gameOver = true;
			
			if(player.getPoints() > opponent.getPoints()){
				playerVictory = BattleOutcome.win;
				
			} else if (opponent.getPoints() > player.getPoints()){
				playerVictory = BattleOutcome.lose;
				
			} else {
				playerVictory = BattleOutcome.tie;
			}
		}
		
		return playerSuccess;
		
	}
	
	public static boolean playerAttacking(){
		return playerIsAttacking;
	}
	
	public static boolean playerAttacked(){
		return playerAttacked;
	}
	
	public static int getTurn(){
		return turnsTaken;
	}
	
	public static Card getPlayerLastPlayed(){
		return playerCard;
	}
	
	public static Card getOpponentLastPlayed(){
		return opponentCard;
	}
	
	//returns the player object for info about the player.
	public static Player getPlayerInfo(){
		return player;
	}
	
	
	//returns the opponent object for info about the opponent.
	public static Player getOpponentInfo(){
		return opponent;
	}
	
	public static Boolean getGameOver(){
		return gameOver;
	}
	
	public static BattleOutcome getVictory(){
		return playerVictory;
	}
}
