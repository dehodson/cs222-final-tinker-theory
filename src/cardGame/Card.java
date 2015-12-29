package cardGame;




public class Card{

	private String name;
	private int attack;
	private int defense;
	
	public Card(String name, int attack, int defense){
		this.name    = name;
		this.attack  = attack;
		this.defense = defense;
	}
	
	//get specific values of a card
	public int getAttack(){
		return this.attack;
	}

	public int getDefense() {
		return this.defense;
	}
	
	public String getName(){
		return this.name;
	}
	
	//compares values of the two cards and determines the result.
	BattleOutcome fights(Card opposingCard){
		
		if(this.attack > opposingCard.getDefense()){
			return BattleOutcome.win;
			
		} else if(this.attack == opposingCard.getDefense()){
			return BattleOutcome.tie;
			
		} else {
			return BattleOutcome.lose;
		}
	}
	

}

